package com.cg.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.blog.service.UserServiceIntf;

@RestController
@RequestMapping("/user")
@Validated
public class UserController 
{
	@Autowired
	private UserServiceIntf userv;
	
	
}
