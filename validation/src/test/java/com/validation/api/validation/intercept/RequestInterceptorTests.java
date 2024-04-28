package com.validation.api.validation.intercept;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.servlet.HandlerExecutionChain;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import jakarta.servlet.http.HttpServletResponse;


@SpringBootTest
public class RequestInterceptorTests {
	
	
	@Autowired
	RequestMappingHandlerMapping mapping;
	
	@Autowired
	RequestInterceptor requestInterceptor;
	
	@Mock
	HttpServletResponse response;
	
	@Mock
	Object handler;
	
	@Test
	public void testpreHandle() throws Exception{
		MockHttpServletRequest mockHttpServletRequest = new MockHttpServletRequest("POST", "api/validateData");
		mockHttpServletRequest.setParameter("name", "test");
		mockHttpServletRequest.setParameter("age", "25");
		assertTrue(requestInterceptor.preHandle(mockHttpServletRequest,response,handler));
	}
	
}
