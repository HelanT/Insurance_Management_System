package com.ims.admin.dao;

import java.util.List;

import com.ims.model.User;

public interface UserDAO {

	public void addCustomer();
	
	public List<User> ViewAllUserInfo();
	
	public boolean EmailPasswordVerification(String email, String password);
		

	public String getPassword(String email);
	
		

	public void policyHold(int uid); 
		
		
	

	public void PolicyRequestList(String email, int PolicyId);
		
	

	public void  policyActivate(String email, int PolicyId);
	
		
	

	public void PolicyCancel(String mail, int PolicyId); 
		
		
	

	public boolean verifyEmailAndPassword(String email, String password);
		
		
	}

	
	
	
	
	
	

