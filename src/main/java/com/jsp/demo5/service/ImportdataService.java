package com.jsp.demo5.service;	

import java.math.BigInteger;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.demo5.entity.Post;
import com.jsp.demo5.repository.CommentRepository;
import com.jsp.demo5.repository.PostRepoImpl;
import com.jsp.demo5.repository.UserRepository;
import com.jsp.demo5.repository.ImportdataRepositoryImpl;


	@Service
	public class ImportdataService {
		
		@Autowired
		ImportdataRepositoryImpl ImportdataRepositoryImpl;
		
		public String importusers() throws ParseException {
			
			ImportdataRepositoryImpl.saveuserstodb();
					
			return "complete";
			
		}
		
		
		public String importposts() throws ParseException {
			
			ImportdataRepositoryImpl.savepoststodb();
					
			return "complete";
			
		}
		
		
		public String importcomments() throws ParseException {
			
			ImportdataRepositoryImpl.savecommentstodb();
					
			return "complete";
			
		}
		
			

		

	}
	

