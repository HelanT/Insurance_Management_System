package com.ims.admin.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ims.admin.dao.UserDAO;
import com.ims.model.PolicyInfo;
import com.ims.model.User;

public class UserDAOImpl implements UserDAO {

	Scanner sc = new Scanner(System.in);
	static List<PolicyInfo> addPolicy = new ArrayList<>();
	static List<User> addUsers = new ArrayList<>();
	static List<User> activateUser = new ArrayList<>();
	static List<User> policyrequest = new ArrayList<>();
	static List<User> cancelUser = new ArrayList<>();
	
	@Override
	public void addCustomer() {
		// TODO Auto-generated method stub
		 int h = 1;
		 while(h==1)
		 {
			 ++h;
			 System.out.println("Enter User ID:");
			 int uid = sc.nextInt();
			 System.out.println(addPolicy);
			 System.out.println("Choosee from above list:");
			 int pid = sc.nextInt();
			 System.out.println("Enter User First Name:");
			 String fname = sc.next();
			 System.out.println("Enter User Last Name:");
			 String lname = sc.next();
			 System.out.println("Enter User Address:");
			 String add = sc.next();
			 System.out.println("Enter User Phone Number:");
			 long phoneNumber = sc.nextLong();
			 System.out.println("Enter Email:");
			 String mail = sc.next();
			 System.out.println("Enter Password:");
			 String pw = sc.next();
			 
		    User us = new User(uid,pid,fname,lname,add, phoneNumber,mail,pw);
		    addUsers.add(us);
		    System.out.println("User Added SuccessFully");
		    
		    System.out.println("Would yu like to add more user 1)Yes 2)No");
		    h = sc.nextInt();
		    
		 }
		
		

	}

	@Override
	public List<User> ViewAllUserInfo() {
		// TODO Auto-generated method stub
		return addUsers;
	}

	@Override
	public boolean EmailPasswordVerification(String email, String password) {
		// TODO Auto-generated method stub
		boolean flag = false;
		for( User u : addUsers)
		{
			if (u.getEmail().equals(email)&& u.getPassWord().equals(password))
			{
				return true;
			}
			
		}
		return false;
		
		
	}

	@Override
	public String getPassword(String email) {
		// TODO Auto-generated method stub
		
		for(User u: addUsers)	
		{
			if(u.getEmail().equals(email))
			{
				return u.getPassWord();
			}
		}
		return null;
		
	}

	@Override
	public void policyHold(int uid) {
		// TODO Auto-generated method stub
	     int e =0;
	     for(User ue : addUsers)
	     {
	    	 if(ue.getUid()== uid)
	    	 {
	    		 
	    	 System.out.println("User ID:" +ue.getUid()+"\t"+"Policy ID:"+ue.getPolicyId()+"\t"+"User First Name:"+ue.getFirstname()+"\t"+"User Last Name:" + ue.getLastname()+"\t"+"User Address:"+ue.getAddress()+"\t"+"User Phone Number:"+ue.getPhoneNumber()+"\t"+"User Email:"+ue.getEmail());
	    	 ++e;
	    	 
			}
	     }
	     if(e==0)
	    	 System.out.println("Given ID doesn't Exist");
	     
	
	}

	@Override
	public void PolicyRequestList(String email, int PolicyId) {
		// TODO Auto-generated method stub
		
		int f = 0;
		for(User u : addUsers)
		{
			if(u.getEmail()==email && (u.getPolicyId())==PolicyId)
			{
				
				System.out.println("User ID:" +u.getUid()+"\t"+"Policy Id:"+u.getPolicyId()+"\t"+"User First Name:"+u.getFirstname()+"\t"+"User Last Name:" + u.getLastname()+"\t"+"User Address:"+u.getAddress()+"\t"+"User Phone Number:"+u.getPhoneNumber()+"\t"+"User Email:"+u.getEmail());
				System.out.println("Policy with above Information is Requested. ");
				++f;
			}
		}
		
		if(f==0)
			System.out.println("Given Information doesn't exist!");
		
	}
	
	
	@Override
	public void policyActivate(String email, int PolicyId) {
		// TODO Auto-generated method stub
		
		int a = 0;
		for(User u : addUsers)
		{
			if(u.getEmail()== email && (u.getPolicyId()==PolicyId))
			{
				System.out.println("Your Policy is Activated");
				++a;
			}
			
	}
		if(a==0)
			System.out.println("Given Information doesn't Exist");

	}
	@Override
	public void PolicyCancel(String mail, int PolicyId) {
		// TODO Auto-generated method stub
		
		int k = 0;
		for(User u : addUsers)
		{
			if(u.getEmail()== mail && (u.getPolicyId()==PolicyId))
			{
				addUsers.remove(u);
				System.out.println("User Cancel Successfully");
				
				++k;
			}
		}
		if(k==0)
			System.out.println("User doesn't Exist");
		
	}
		
	
	@Override
	public boolean verifyEmailAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		boolean flag = false;
		for( User u : addUsers)
		{
			if (u.getEmail().equals(email)&& u.getPassWord().equals(password))
			{
				flag = true;
				
			}
		}
		return flag;
		
		
	}

	

}
