package com.jsp.demo5.controller;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.demo5.entity.Comment;
import com.jsp.demo5.entity.Post;
import com.jsp.demo5.entity.Postresult;
import com.jsp.demo5.service.CommentService;
import com.jsp.demo5.service.ImportdataService;
import com.jsp.demo5.service.PostService;
import com.jsp.demo5.service.UserService;


@Controller
public class ImportdataController {
	@Autowired
	PostService postservice;
	
	@Autowired
	CommentService commentservice;	
	
	@Autowired
    UserService userservice;
	
	@Autowired 
	ImportdataService importdata;
/*
	
    @RequestMapping(value={"/importusers"}) 
    @ResponseBody
    String importusers() throws ParseException {
    	importdata.importusers();
		return "imported users";
    	
    }
    
    
    @RequestMapping(value={"/importposts"}) 
    @ResponseBody
    String importposts() throws ParseException {
    	importdata.importposts();
		return "imported posts";
    	
    }    
    
    @RequestMapping(value={"/importcomments"}) 
    @ResponseBody
    String importcomments() throws ParseException {
    	importdata.importcomments();
		return "imported commnets";
    	
    }      
*/
}
