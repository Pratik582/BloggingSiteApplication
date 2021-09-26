package com.cg.blog.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Moderator {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int userid;

	
	public Moderator(int userid) {
		super();
		this.userid = userid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}
}
