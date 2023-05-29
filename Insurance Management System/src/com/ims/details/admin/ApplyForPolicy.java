package com.ims.details.admin;

import java.util.Scanner;

import com.ims.admin.dao.impl.UserDAOImpl;
import com.ims.client.InsuranceClient;

public class ApplyForPolicy {
	
	public static void UserMenuDetails()
	{
		Scanner sc = new Scanner(System.in);
		UserDAOImpl udaoImpl = new UserDAOImpl();
		while(true)
		{
			System.out.println("================================");
			System.out.println("        1)Apply/Register           ");
			System.out.println("        2)Email Verification    	");
			System.out.println("        3)Forgot Password         ");
			System.out.println("        4)Back                    ");
			System.out.println("=====================================");
			
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				udaoImpl.addCustomer();
				break;
				
			case 2:
				System.out.println("Enter Email:");
				String mail = sc.next();
				System.out.println("Enter Password:");
				String pw = sc.next();
				boolean EmailPasswordVerification = udaoImpl.EmailPasswordVerification(mail, pw);
				
				if(mail.equals(mail)&& pw.equals(pw))
				{
					System.out.println("User Verified");
					
				}
				else
				{
					System.out.println("Invalid User");
				}
				break;
				
				
			case 3:
				System.out.println("Enter Email:");
				String e = sc.next();
				String passWord = udaoImpl.getPassword(e);
				
				if(passWord!= null)
					System.out.println("Your Password is :" + passWord);
				
				else
					System.out.println("Email doesn't Exist!");
				break;
				
				
			case 4:
				InsuranceClient.main(null);
				break;
				
				default:
					System.out.println("Choose 1 to 4 between");
					
					
			}
		}
	}

}
