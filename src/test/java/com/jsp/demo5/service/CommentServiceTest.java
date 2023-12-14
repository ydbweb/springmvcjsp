package com.jsp.demo5.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.math.BigInteger;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.junit.Test;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import com.jsp.demo5.entity.Comment;
import com.jsp.demo5.entity.Post;
import com.jsp.demo5.entity.Postmonths;
import com.jsp.demo5.entity.User;
import com.jsp.demo5.repository.CommentRepoImpl;
import com.jsp.demo5.repository.CommentRepository;
import com.jsp.demo5.repository.PostRepository;
import com.jsp.demo5.repository.UserRepoImpl;
import com.jsp.demo5.repository.UserRepository;




@RunWith(SpringRunner.class)
public class CommentServiceTest {
	@InjectMocks
    private CommentService commentService;     
    
	@Mock
    private CommentRepoImpl commentRepoImpl;
    
    Comment comment1;
    Comment comment2;
    
    List<Comment> comments;
    List<Postmonths> pm;
    
    Post post1;
    User user1;
    Post post2;
    User user2;    
    
    
    @Before
    public void setUp() throws ParseException {
    	TestData testData=new TestData();
    	user1=testData.setUpUser();
    	user2=testData.setUpUser2();
        
        post1=testData.setUpPost(user1);
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
    @DisplayName("get all comments")
	public void getAllCommments(){
    	when(commentRepoImpl.findAllComments1(post1.getId())).thenReturn(comments);
    	
    	assertEquals(2,commentService.getAllCommments(post1.getId()).size());
        
        
	}
    
    
    @Test
    @DisplayName("get top commenters")
	public void getTopCommenters(){
    	when(commentRepoImpl.topcommenters()).thenReturn(pm);
    	
    	assertEquals(1,commentService.topcommenters().size());
	}

}
	

