package com.catalyst.SMA.WebServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.catalyst.SMA.Services.UserService;
import com.catalyst.SMA.models.Search;
import com.catalyst.SMA.models.User;

@RestController
public class UserWebService {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
	public User getUserByUserId(@PathVariable Integer userId) {
		User user = userService.getUserByUserId(userId);
		return user;
	}
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		return "Test";
	}
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public User getUserByUserId(@RequestBody Search search) {
		userService.createSearch(search);
		return getUserByUserId(search.getUserId());
				
	}
	

}
