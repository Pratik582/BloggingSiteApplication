package com.cg.blog.entities;


import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Blogger {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
int userId;
String blogger_name;
List<Post> post;
List<Comment> comments;
List<Post> upvoted;
List<Post> downvoted;
Award award_received;
Award award_given;
List<Community> communities;
int karma;
public Blogger() {
	
}
public Blogger(int userId, String blogger_name, List<Post> post, List<Comment> comments, List<Post> upvoted,
		List<Post> downvoted, Award award_received, Award award_given, List<Community> communities, int karma) {
	super();
	this.userId = userId;
	this.blogger_name = blogger_name;
	this.post = post;
	this.comments = comments;
	this.upvoted = upvoted;
	this.downvoted = downvoted;
	this.award_received = award_received;
	this.award_given = award_given;
	this.communities = communities;
	this.karma = karma;
}
@Override
public String toString() {
	return "Blogger [userId=" + userId + ", blogger_name=" + blogger_name + ", post=" + post + ", comments=" + comments
			+ ", upvoted=" + upvoted + ", downvoted=" + downvoted + ", award_received=" + award_received
			+ ", award_given=" + award_given + ", communities=" + communities + ", karma=" + karma + "]";
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getBlogger_name() {
	return blogger_name;
}
public void setBlogger_name(String blogger_name) {
	this.blogger_name = blogger_name;
}
public List<Post> getPost() {
	return post;
}
public void setPost(List<Post> post) {
	this.post = post;
}
public List<Comment> getComments() {
	return comments;
}
public void setComments(List<Comment> comments) {
	this.comments = comments;
}
public List<Post> getUpvoted() {
	return upvoted;
}
public void setUpvoted(List<Post> upvoted) {
	this.upvoted = upvoted;
}
public List<Post> getDownvoted() {
	return downvoted;
}
public void setDownvoted(List<Post> downvoted) {
	this.downvoted = downvoted;
}
public Award getAward_received() {
	return award_received;
}
public void setAward_received(Award award_received) {
	this.award_received = award_received;
}
public Award getAward_given() {
	return award_given;
}
public void setAward_given(Award award_given) {
	this.award_given = award_given;
}
public List<Community> getCommunities() {
	return communities;
}
public void setCommunities(List<Community> communities) {
	this.communities = communities;
}
public int getKarma() {
	return karma;
}
public void setKarma(int karma) {
	this.karma = karma;
}


}
