package com.boni.springboot.springBoot;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

	@RequestMapping("/{userName}")
	public String loginUser(@PathVariable String userName) {
		
		return ("<P>Welcome User</P>" +userName);
	}
	
	@RequestMapping("/")
	public String login() {
		
		return ("<P>Welcome</P>");
	}
}


