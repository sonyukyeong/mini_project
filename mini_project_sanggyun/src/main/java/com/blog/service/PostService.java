package com.blog.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface PostService {
	
	void getmain(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;


}
