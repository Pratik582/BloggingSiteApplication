package com.cg.blog.entities;


import java.io.File;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Community {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
int communityId;
String communityDescription;
int totalMembers;
int onlineMembers;
File image;
LocalDate date;
List<String> postrulesAllowed;
List<String> postrulesDisallowed;
List<String> banningPolicy;
List<String> flairs;
private Admin admin;



public Admin getAdmin() {
	return admin;
}
public Community() {
	
}
public int getCommunityId() {
	return communityId;
}
public void setCommunityId(int communityId) {
	this.communityId = communityId;
}
public String getCommunityDescription() {
	return communityDescription;
}
public void setCommunityDescription(String communityDescription) {
	this.communityDescription = communityDescription;
}
public int getTotalMembers() {
	return totalMembers;
}
public void setTotalMembers(int totalMembers) {
	this.totalMembers = totalMembers;
}
public int getOnlineMembers() {
	return onlineMembers;
}
public void setOnlineMembers(int onlineMembers) {
	this.onlineMembers = onlineMembers;
}
public File getImage() {
	return image;
}
public void setImage(File image) {
	this.image = image;
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
public List<String> getPostrulesAllowed() {
	return postrulesAllowed;
}
public void setPostrulesAllowed(List<String> postrulesAllowed) {
	this.postrulesAllowed = postrulesAllowed;
}
public List<String> getPostrulesDisallowed() {
	return postrulesDisallowed;
}
public void setPostrulesDisallowed(List<String> postrulesDisallowed) {
	this.postrulesDisallowed = postrulesDisallowed;
}
public List<String> getBanningPolicy() {
	return banningPolicy;
}
public void setBanningPolicy(List<String> banningPolicy) {
	this.banningPolicy = banningPolicy;
}
public List<String> getFlairs() {
	return flairs;
}
public void setFlairs(List<String> flairs) {
	this.flairs = flairs;
}
public void setAdmin(Admin admin) {
	// TODO Auto-generated method stub
	
}
public void add(Community comm) {
	// TODO Auto-generated method stub
	
}

}
