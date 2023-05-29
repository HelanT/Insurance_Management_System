package com.ims.client;

import java.util.Scanner;

import com.ims.admin.dao.impl.UserDAOImpl;
import com.ims.details.admin.Admin;
import com.ims.details.admin.ApplyForPolicy;
import com.ims.details.admin.UserDetails;

public class InsuranceClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		UserDAOImpl udaoImpl = new UserDAOImpl();
		while(true)
		{
			System.out.println("====================================================");
			System.out.println("                1)Admin                             ");
			System.out.println("                2)User                              ");
			System.out.println("                3)Register/Apply for Policy         ");
			System.out.println("                4)Exit                              ");
			System.out.println("====================================================");
			
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				Admin details = new Admin();
				System.out.println("Enter Admin Email:");
				String mail = sc.next();
				System.out.println("Enter Password:");
				String pw = sc.next();
				if(mail.equals(mail)&&(pw.equals(pw)))
				{
					System.out.println("Valid User Admin");
				}
				else
					System.out.println("Invalid User Admin");
		        
				details.AdminMenuDetails();
			    break;
			    
			case 2:
				UserDetails details1 = new UserDetails();
				System.out.println("Enter User Email:");
				String email = sc.next();
				System.out.println("Enter Password:");
				String pass = sc.next();
				boolean flag = udaoImpl.verifyEmailAndPassword(email,pass);
				if (flag)
				{
					System.out.println("Valid User");
					
				}
				else
					System.out.println("In Valid User");
				
				details1.UserListDetails();
				break;
				
			case 3:
				ApplyForPolicy.UserMenuDetails();
				break;
				
			case 4:
				System.out.println("Thanks for using Our App");
				System.exit(0);
				
				default:
					System.out.println("Choose 1 to 4 Between");
					
				
			}
			
	
		}
		

	}

}
