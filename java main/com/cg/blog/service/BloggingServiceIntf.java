package com.cg.blog.service;

import java.util.List;

import com.cg.blog.entities.Blogger;

public interface BloggingServiceIntf {
	
 Blogger addBlogger(Blogger blogger);
 
 Blogger updateBlogger(Blogger blogger);
 
 Blogger viewBlogger(int userId);
 
 List<Blogger> viewAllBlogger(List<Blogger> blogger);
 
 Blogger deleteBlogger(int userId);
  
}
