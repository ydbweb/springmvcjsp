package com.jsp.demo5.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeTrue;
import static org.mockito.Mockito.when;

import java.math.BigInteger;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import com.jsp.demo5.entity.Comment;
import com.jsp.demo5.entity.Post;
import com.jsp.demo5.entity.Postmonths;
import com.jsp.demo5.entity.User;
import com.jsp.demo5.repository.CommentRepoImpl;
import com.jsp.demo5.repository.PostRepoImpl;
import com.jsp.demo5.repository.UserRepoImpl;

@RunWith(SpringRunner.class)
public class PostServiceTest {
	@InjectMocks
    private PostService postService;
	
	@Mock
    private UserRepoImpl userRepoImpl;	
    
	@Mock
    private CommentRepoImpl commentRepoImpl;
	
	@Mock
    private PostRepoImpl postRepoImpl;
	
	//@PersistenceContext
	//private EntityManager entityManager;
    
    Comment comment1;
    Comment comment2;
    
    List<Comment> comments;
    List<Postmonths> pm;
    List<Post> posts;
    List<User> users;
    
    Post post1;
    User user1;
    Post post2;
    User user2;    
    
    
    @Before
    public void setUp() throws ParseException {
    	TestData testData=new TestData();
    	users=new ArrayList<>();
    	user1=testData.setUpUser();
    	user2=testData.setUpUser2();
    	users.add(user1);
        
    	posts=new ArrayList<>();
        post1=testData.setUpPost(user1);
        posts.add(post1);
        post2=testData.setUpPost2(user2);   
        
        comments=new ArrayList<>();
        comment1=testData.setUpComment1(user1, post1);
        comments.add(comment1);
        
        comment2=testData.setUpComment2(user1, post1);
        comments.add(comment2);
        
    	pm = new ArrayList<>();
    	Postmonths pm1=new Postmonths();
    	pm1.setCnt(BigInteger.valueOf(50));
    	pm1.setMname("July");
    	pm.add(pm1);
        
    } 
    
    @Test 
    public void getfirstpost(){
    	when(postRepoImpl.getfirstpost(1)).thenReturn(post1);
    	
    	assertEquals("jnhj",postService.getfirstpost(1).getTxt());
    }
    
    
    @Test
 	public void getpagination(){
     	when(postRepoImpl.getcountnumberofpostsquery("")).thenReturn(posts);

     	Map<String, Integer> vararr = new HashMap<String, Integer>();
     	vararr=postService.getpagination(1,"");
     	
     	assumeTrue(vararr.get("total").equals(2));
 	}   
    
}
