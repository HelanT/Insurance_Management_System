package com.ims.details.admin;

import java.util.Scanner;



import com.ims.admin.dao.impl.CategoryDAOImpl;
import com.ims.admin.dao.impl.PolicyInfoDAOImpl;
import com.ims.admin.dao.impl.SubCategoryDAOImpl;
import com.ims.admin.dao.impl.UserDAOImpl;
import com.ims.client.InsuranceClient;



public class Admin {
	
	public static void AdminMenuDetails() {
		
		Scanner sc = new Scanner (System.in);
		while(true)
		{
			System.out.println("=================================");
		    System.out.println("        1)Category              ");
			System.out.println("        2)Sub-Category           ");
			System.out.println("        3)Policy               ");
			System.out.println("        4)User                  ");
			System.out.println("        5)Buyer's Policy Request  ");
			System.out.println("        6)Back                     ");
			System.out.println("=====================================");
			
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			switch(choice)
			{
			
			case 1:
				CategoryDetails details2 = new CategoryDetails();
				details2.CategoryMenuDetails();
				break;
				
		    case 2:
		         SubCategoryDetails details3 = new SubCategoryDetails();
		         details3.SubCategoryDetails();
		         break;
				
			case 3:
				Policy details4 = new Policy();
				details4.PolicyMenuDetails();
				break;
				
			case 4:
				UserDetails details5 = new UserDetails();
				details5.UserListDetails();
				break;
				
			case 5:
				BuyerPolicyRequest details = new BuyerPolicyRequest();
				details.BuyerPolicyRequestMenuDetails();
				break;
				
			case 6:
		          InsuranceClient.main(null);
				break;
				
				default:
					System.out.println("Choose 1 to 6 between");
					
				
				
			}
		}
	}
}

	
