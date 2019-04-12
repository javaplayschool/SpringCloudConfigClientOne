package com.javaplayschool.SpringCloudConfigClientOne;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Value("${db.url}")
	public String dbUrl;
	
	@Value("${welcome.message}")
	public String welcomeMsg;
	
	
	@RequestMapping("/welcome")
	public String welcome() {
		
		System.out.println(welcomeMsg);
		
		return welcomeMsg;
	}
	

	@RequestMapping("/dburl")
	public String getBbUrl() {
		
		System.out.println("Db Url : "+dbUrl);
		
		return dbUrl;
	}

}
