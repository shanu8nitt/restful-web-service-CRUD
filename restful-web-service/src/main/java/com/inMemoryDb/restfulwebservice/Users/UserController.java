package com.inMemoryDb.restfulwebservice.Users;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	public UserDAOService service;
	
	@GetMapping("/findall")
	public List<UserPojo> findall()
	{
		return service.findAll();
		 
	}
	@GetMapping("/find/{id}")
	public UserPojo findById(@PathVariable int id)
	{
		 UserPojo findUser = service.find(id);
		 if(findUser == null)
		 throw new UserNotFoundException("id->"+id);
		 return findUser;
	}
	@PostMapping("/adduser")
	public void addUser(@Valid @RequestBody UserPojo userdata) {
		service.addUser(userdata);
		
	}

}
