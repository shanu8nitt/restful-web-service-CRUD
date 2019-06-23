package com.inMemoryDb.restfulwebservice.Users;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDAOService {
	private static int count =3;
	
	public static List<UserPojo> userPojo = new ArrayList<UserPojo>();
	static{
		userPojo.add(new UserPojo(1, "apple",  new Date(), "finance"));
		userPojo.add(new UserPojo(2, "mango", new Date(), "hr"));
	}
	
	public UserPojo addUser(UserPojo user)
	{
		
		if(user.getId() == null) {
			user.setId(count++);			
		}
		
		userPojo.add(user);
		return user;
		
	
	}
	
	public List<UserPojo> findAll()
	{
		return userPojo;
		
	}
	
	public UserPojo find(int id) {
		for(UserPojo abc : userPojo)
		{
			if (abc.getId()==id)
			{
				return abc;
			}
		}		
		return null;		
	}

}
