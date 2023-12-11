package com.jsp.demo5.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

import javax.transaction.Transactional;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jsp.demo5.entity.Comment;
import com.jsp.demo5.entity.Post;
import com.jsp.demo5.entity.User;
import com.jsp.demo5.repository.CommentRepoImpl;
import com.jsp.demo5.repository.CommentRepository;
import com.jsp.demo5.repository.PostRepository;
import com.jsp.demo5.repository.UserRepoImpl;
import com.jsp.demo5.repository.UserRepository;

public class TestData {
    
    Comment comment1;
    Comment comment2;
    
    Post post1;
    User user1;
    
    Post post2;
    User user2;
    
    SimpleDateFormat formatter;
    
 
    public User setUpUser() throws ParseException {
    	formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH); 
        user1=new User();
    	user1.setDateCreated(formatter.parse("01-01-2019 00:00:00"));
    	user1.setNameuser("James Brown");
    	
    	return user1;
	}
    
    public Post setUpPost(User user) throws ParseException {
        post1=new Post();
        post1.setDateCreated(formatter.parse("01-01-2019 00:00:03"));
        post1.setUser(user);
        post1.setTxt("jnhj");
    	
    	return post1;
	}
    
    public User setUpUser2() throws ParseException {
    	formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH); 
        user2=new User();
    	user2.setDateCreated(formatter.parse("01-01-2019 00:00:00"));
    	user2.setNameuser("James Blue");
    	
    	return user2;
	}
    
    public Post setUpPost2(User user) throws ParseException {
        post2=new Post();
        post2.setDateCreated(formatter.parse("01-01-2019 00:00:03"));
        post2.setUser(user);
        post2.setTxt("jnhj  hu uhujhj");
    	
    	return post2;
	}    
    
    public Comment setUpComment1(User user,Post post) throws ParseException {
        comment1 =new Comment();
        comment1.setDateCreated(formatter.parse("31-07-2023 00:00:00"));
        comment1.setUserId(user);
        comment1.setPost(post);
        comment1.setText("jkjjk");
    	
    	return comment1;
	}
    
    public Comment setUpComment2(User user,Post post) throws ParseException {
        comment2 =new Comment();
        comment2.setDateCreated(formatter.parse("31-07-2023 00:00:00"));
        comment2.setUserId(user);
        comment2.setPost(post);
        comment2.setText(",;k,,;kk");
    	
    	return comment2;        
    }
}
