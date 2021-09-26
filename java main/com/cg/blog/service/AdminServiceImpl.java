package com.cg.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.blog.dao.ICommunityDao;
import com.cg.blog.entities.Community;

import com.cg.blog.exception.CommunityAlreadyExistsException;

@Component
public class AdminServiceImpl implements AdminServiceIntf 
{
	@Autowired
	public ICommunityDao cDao;

	@Override
	public Community addCommunity(Community community) {
		boolean exists= community.getCommunityId() != 0 && cDao.existsById(community.getCommunityId());
        if(exists){
            throw new CommunityAlreadyExistsException("community already exists for id="+community.getCommunityId());
        }
        community = cDao.save(community);
        System.out.println("returning saved blog: " + community);
        return community;
		
	}

	@Override
	public Community updateCommunity(Community community) {
		community=cDao.save(community);
		return community;
	}

	
	@Override
	public List<Community> listAllCommunity() {
		List<Community> community=cDao.findAll();
		return community;
	}

	@Override
	public Community deleteCommunity(int communityId) {
		//Community community=
		//cDao.deleteById(communityId);
		
		return null;
	}

	

}
