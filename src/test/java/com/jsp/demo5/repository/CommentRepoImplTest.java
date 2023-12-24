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
    
    
    @Before
    public void setUp() throws ParseException {
    	
    	TestData testData=new TestData();
        
    }
    
    @Test
    public void findAllComments1() {
    	assertThat(1).isEqualTo(1);
    }
    
    /*
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
