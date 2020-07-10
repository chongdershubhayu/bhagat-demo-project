package com.example;

import java.util.ArrayList;
import java.util.List;

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
	
	@RequestMapping(value ="/test/{userId}", produces = { "application/json"})
	public List<UserDetails> getUserDetails(@PathVariable Integer userId) {
		UserDetails user1 = new UserDetails("1", "user1", "Developer",10000);
		UserDetails user2 = new UserDetails("2", "user2", "Manager",30000);
		UserDetails user3 = new UserDetails("3", "user3", "Tester",10000);

		List<UserDetails> userDetails= new ArrayList<UserDetails>();;
		userDetails.add(user3);
		userDetails.add(user2);
		userDetails.add(user1);
		
		return userDetails;
	}
	
}


