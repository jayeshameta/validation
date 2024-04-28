package com.validation.api.validation.intercept;

import jakarta.servlet.http.HttpServletRequest; 
import jakarta.servlet.http.HttpServletResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component; 
import org.springframework.web.servlet.HandlerInterceptor;

import com.validation.api.validation.exception.IncorrectAgeException;
import com.validation.api.validation.exception.InvalidName;
import com.validation.api.validation.facade.Validation;

@Component
public class RequestInterceptor implements HandlerInterceptor { 
	
	@Autowired
	Validation validation;

	//Request is intercepted by this method before reaching the Controller 
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		/*
		 * this method will check if the name and age sent in the request is valid or
		 * not we can add lots of checks here for the requestBody received from the
		 * payload
		 */

		if (!validation.age.equals(request.getParameter("age"))) {
			throw new IncorrectAgeException("Age should be 25");
		}
		if (!validation.name.equals(request.getParameter("name"))) {
			throw new InvalidName("Name should be test");
		}
		return true;
	}
} 



