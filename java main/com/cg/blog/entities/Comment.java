package com.cg.blog.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
int commentId;
String commentDescription;
int votes;
Blogger blogger;
Post post;
boolean voteup;
public Comment() {
	
}
public int getCommentId() {
	return commentId;
}
public void setCommentId(int commentId) {
	this.commentId = commentId;
}
public String getCommentDescription() {
	return commentDescription;
}
public void setCommentDescription(String commentDescription) {
	this.commentDescription = commentDescription;
}
public int getVotes() {
	return votes;
}
public void setVotes(int votes) {
	this.votes = votes;
}
public Blogger getBlogger() {
	return blogger;
}
public void setBlogger(Blogger blogger) {
	this.blogger = blogger;
}
public Post getPost() {
	return post;
}
public void setPost(Post post) {
	this.post = post;
}
public boolean isVoteup() {
	return voteup;
}
public void setVoteup(boolean voteup) {
	this.voteup = voteup;
}

}
