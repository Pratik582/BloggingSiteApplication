package com.cg.blog.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
@Entity
@Table(name = "user1")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
int userId;
	@NotEmpty(message = "Password cannot be empty")
	@Size(min = 8, max = 30, message = "Enter Valid password")
String password;

String role;
public User() {
	
}
public User(int userId, String password, String role) {
	super();
	this.userId = userId;
	this.password = password;
	this.role = role;
}
@Override
public String toString() {
	return "User [userId=" + userId + ", password=" + password + ", role=" + role + "]";
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}

}
