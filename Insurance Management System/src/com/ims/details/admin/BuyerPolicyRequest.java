package com.ims.details.admin;

import java.util.Scanner;

import com.ims.admin.dao.impl.UserDAOImpl;

public class BuyerPolicyRequest {
	
public static void BuyerPolicyRequestMenuDetails() {
		
		Scanner sc = new Scanner(System.in);
		UserDAOImpl daoImpl = new UserDAOImpl ();
		while(true)
		{
			System.out.println("================================");
			System.out.println("        1)View                 ");
			System.out.println("        2)Activate             ");
			System.out.println("        3)Cancel                ");
			System.out.println("        4)Back                  ");
			System.out.println("==================================");
			
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter Email:");
				String e = sc.next();
				System.out.println("Enter Policy ID:");
				int p = sc.nextInt();
				daoImpl.PolicyRequestList(e, p);
				break;
				
			case 2:
				System.out.println("Enter Email:");
				String email = sc.next();
				System.out.println("Enter Policy ID:");
				int pid = sc.nextInt();
				daoImpl.policyActivate(email,pid);
				System.out.println("User Activate Successfully");
				break;
				
			case 3:
				System.out.println("Enter Email:");
				String mail = sc.next();
				System.out.println("Enter Policy ID:");
				int id = sc.nextInt();
				daoImpl.PolicyCancel(mail,id);
				System.out.println("User Cancel Successfully");
			    break;
			    
			case 4:
				Admin.AdminMenuDetails();
				break;
				
				default:
					System.out.println("Choose 1 to 4 between");
					
			}
		}
		
	}

}
