package com.data.service;

public class UserServiceImpl implements UserService {

	@Override
	public boolean validateUser(String userName, String userPass) {
		if(userName.equals("testUser1") && userPass.equals("morYa"))
		  return true;
		else
			 return false;
		}
	
	public void update()
	{
		System.out.println("UserService Update");
	}

}
