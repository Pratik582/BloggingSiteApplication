package com.cg.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.blog.entities.Community;
import com.cg.blog.service.AdminServiceIntf;

@RestController
@RequestMapping("/admin")
@Validated
public class AdminController 
{
	@Autowired
	private AdminServiceIntf aserv;
	
	@GetMapping("/by/id/{id}")
	public Community createCommunity(@PathVariable("id") int id)
	{
		return null;
	}
	
	@PutMapping("/by/name/{name}")
	public String manageCommunity(@PathVariable("name") String name)
	{
		return null;
	}
}
