package com.validation.api.validation.config;

import com.validation.api.validation.intercept.RequestInterceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry; 
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer; 
  
@Configuration
public class RequestInterceptorConfig implements WebMvcConfigurer { 
     
    //Register an interceptor with the registry, Interceptor name : RequestInterceptor
	@Autowired
	RequestInterceptor requestInterceptor;
	
	@Override
    public void addInterceptors(InterceptorRegistry registry) { 
        registry.addInterceptor(requestInterceptor).addPathPatterns("/**"); 
    } 
    //* We can register any number of interceptors with our spring application context 
}



