package com.jsp.demo5.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

import java.math.BigInteger;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.jsp.demo5.entity.Comment;
import com.jsp.demo5.entity.Post;
import com.jsp.demo5.entity.User;
import com.jsp.demo5.entity.Postmonths;
import com.jsp.demo5.service.CommentService;
import com.jsp.demo5.service.TestData;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class CommentRepoImplTest {
	@Autowired
    private UserRepository userRepo; 
    
	@Autowired
    private PostRepository postRepo;      
    
	@Autowired
    private CommentRepository commentRepo; 
	
	@Autowired
    private CommentRepoImpl commentRepoImpl; 
	
	@Mock
	EntityManager em;
	
    
    Comment comment1;
    Comment comment2;
    
    List<Comment> comments;
    
    @Mock
    Query mockedQuery;
    
    Post post1;
    User user1;
    Post post2;
    User user2;    
    
    /*
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
        comment1=commentRepo.save(comment1);;
        comment2=testData.setUpComment2(user1, post1);
        comment2=commentRepo.save(comment2);
        
        
    }
    
    @Test
    public void findAllComments1() {
    	assertThat(commentRepoImpl.findAllComments1(post1.getId())).hasSize(2);
    }
    
    
    @Test
    public void topcommenters() {
    	List<Postmonths> pm = new ArrayList<>();
    	Postmonths pm1=new Postmonths();
    	pm1.setCnt(BigInteger.valueOf(50));
    	pm1.setMname("July");
    	pm.add(pm1);
    	
    	Query query = Mockito.mock(Query.class);
    	Mockito.when(em.createNativeQuery(commentRepoImpl.q1,Postmonths.class)).thenReturn(query);
    	Mockito.when(query.getResultList()).thenReturn(pm);
        
    	assertThat(commentRepoImpl.topcommenters()).hasSize(1);
    }
    */
}
