package com.cg.blog.service;

import java.util.List;

import com.cg.blog.entities.Community;

public interface AdminServiceIntf {
	
 Community addCommunity(Community community);
 
 Community updateCommunity(Community community);
 
 Community deleteCommunity(int communityId);
 
 List<Community> listAllCommunity();
 

 
}
