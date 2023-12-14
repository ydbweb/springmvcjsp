package com.jsp.demo5.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.demo5.entity.Comment;
import com.jsp.demo5.entity.Post;
import com.jsp.demo5.entity.Postmonths;

@Component
public class CommentRepoImpl {
	
	  	@Autowired
	  	private CommentRepository repository;
	  
	  	public String q1="SELECT count(p.id) as cnt,u.nameuser as mname FROM comment p LEFT JOIN user u ON(u.id=p.user_id) GROUP BY p.user_id ORDER BY cnt DESC LIMIT 3";
			
		@PersistenceContext
		private EntityManager entityManager;		
		
		public List<Postmonths> topcommenters(){			
			
			List<Postmonths> results = entityManager
					.createNativeQuery(q1,Postmonths.class)
					.getResultList();
			
			return results;
		}	
		
		public List<Comment> findAllComments1(Integer id){			
			
			List<Comment> results = entityManager
					.createQuery("SELECT c FROM Comment c WHERE c.post.id=:id" )
					.setParameter("id", id)
					.getResultList();
			
			return results;
		}
		
		public List<Comment> getcommentsByUsers(Integer id){
			List<Comment> results = entityManager
					.createQuery("SELECT c FROM Comment c WHERE c.user.id=:id" )
					.setParameter("id",id)
					.getResultList();
			
			return results;
		}			

}
