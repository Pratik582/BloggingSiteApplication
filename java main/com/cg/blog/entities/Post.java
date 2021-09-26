package com.cg.blog.entities;


import java.io.File;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
int postId;
String title;
List<File> data;
LocalDateTime datetime;
List<Comment> comments;
int votes;
boolean voteup;
boolean notsaleforwork;
boolean spoiler;
boolean originalcontent;
String flair;
PostType content;
       public Post() {
	
        }
public int getPostId() {
	return postId;
}
public void setPostId(int postId) {
	this.postId = postId;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public List<File> getData() {
	return data;
}
public void setData(List<File> data) {
	this.data = data;
}
public LocalDateTime getDatetime() {
	return datetime;
}
public void setDatetime(LocalDateTime datetime) {
	this.datetime = datetime;
}
public List<Comment> getComments() {
	return comments;
}
public void setComments(List<Comment> comments) {
	this.comments = comments;
}
public int getVotes() {
	return votes;
}
public void setVotes(int votes) {
	this.votes = votes;
}
public boolean isVoteup() {
	return voteup;
}
public void setVoteup(boolean voteup) {
	this.voteup = voteup;
}
public boolean isNotsaleforwork() {
	return notsaleforwork;
}
public void setNotsaleforwork(boolean notsaleforwork) {
	this.notsaleforwork = notsaleforwork;
}
public boolean isSpoiler() {
	return spoiler;
}
public void setSpoiler(boolean spoiler) {
	this.spoiler = spoiler;
}
public boolean isOriginalcontent() {
	return originalcontent;
}
public void setOriginalcontent(boolean originalcontent) {
	this.originalcontent = originalcontent;
}
public String getFlair() {
	return flair;
}
public void setFlair(String flair) {
	this.flair = flair;
}
public PostType getContent() {
	return content;
}
public void setContent(PostType content) {
	this.content = content;
}

}
