package com.jsp.demo5.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.junit.Test;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import com.jsp.demo5.entity.Comment;
import com.jsp.demo5.entity.Post;
import com.jsp.demo5.entity.User;
import com.jsp.demo5.repository.CommentRepoImpl;
import com.jsp.demo5.repository.CommentRepository;
import com.jsp.demo5.repository.PostRepository;
import com.jsp.demo5.repository.UserRepoImpl;
import com.jsp.demo5.repository.UserRepository;




@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class CommentServiceTest {
    @Autowired
    private CommentService commentService;
    
    @Autowired
    private UserRepository userRepo; 
    
    @Autowired
    private PostRepository postRepo;      
    
    @Autowired
    private CommentRepository commentRepo;
    
    Comment comment1;
    Comment comment2;
    
    Post post1;
    User user1;
    Post post2;
    User user2;    
    
    
    @Before
    public void setUp() throws ParseException {
    	TestData testData=new TestData();
    	user1=testData.setUpUser();
        user1=userRepo.save(user1);
    	user2=testData.setUpUser2();
        user2=userRepo.save(user2);
        post1=testData.setUpPost(user1);
        post1=postRepo.save(post1);
        post2=testData.setUpPost2(user2);
        post2=postRepo.save(post2);        
        comment1=testData.setUpComment1(user1, post1);
        comment1=commentRepo.save(comment1);
        comment2=testData.setUpComment2(user1, post1);
        comment2=commentRepo.save(comment2);
        
    }   

    @Test
    @DisplayName("get all comments")
	public void getAllCommments(){
    	Integer id=post1.getId();    	
    	
    	System.out.println(id);
    	
    	assertEquals(2,commentService.getAllCommments(id).size());
        
        
	}
    
    
    @Test
    @DisplayName("get top commenters")
	public void getTopCommenters(){
    	System.out.println("aaaa"+commentService.topcommenters());
    	assertEquals(3,commentService.topcommenters().size());
        
        
	}
		
		
		

	}
	

