package com.boni.springboot.springBoot;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

	@RequestMapping("/{userName}")
	public String login(@PathVariable String userName) {
		
		return ("<P>Welcome User</P>" +userName);
	}
}


