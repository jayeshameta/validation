package com.validation.api.validation.facade;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Component;

@Component
public class Validation {
	/* use this class to get the value of the validation criteria defined in the validation.properties file
	 * */
	@Value("${validation.age}")
    public String age;
	
	@Value("${validation.name}")
    public String name;
}
