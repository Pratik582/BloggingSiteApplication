package com.cg.blog.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.blog.entities.Community;

public interface ICommunityDao extends JpaRepository<Community, Integer>{

}
