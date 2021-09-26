package com.cg.blog.exception;

public class BloggerAlreadyExistsException extends RuntimeException {
public BloggerAlreadyExistsException(String message) {
	super(message);
}
}
