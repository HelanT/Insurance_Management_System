package com.ims.details.admin;

import java.util.Scanner;

import com.ims.admin.dao.impl.CategoryDAOImpl;
import com.ims.admin.dao.impl.PolicyInfoDAOImpl;
import com.ims.admin.dao.impl.SubCategoryDAOImpl;
import com.ims.admin.dao.impl.UserDAOImpl;
import com.ims.client.InsuranceClient;
import com.ims.model.Category;
import com.ims.model.PolicyInfo;
import com.ims.model.SubCategory;
import com.ims.model.User;

public class UserDetails {
	
	 static UserDAOImpl udaoImpl = new UserDAOImpl();
	 static CategoryDAOImpl cdaoImpl = new CategoryDAOImpl();
     static SubCategoryDAOImpl scdaoImpl = new SubCategoryDAOImpl();
     static PolicyInfoDAOImpl pdaoImpl = new PolicyInfoDAOImpl();
	
	
	public static void UserListDetails()
	{
		Scanner sc = new Scanner (System.in);
	    while(true)
		{
			System.out.println("============================================");
			System.out.println("       1)Add Users             		") ;
			System.out.println("       2)View List of User          ") ;
			System.out.println("       3)View List of Categories    ") ;
			System.out.println("       4)View List of Sub-Categories") ;
			System.out.println("       5)View Policy           		") ;
			System.out.println("       6)Policy Hold                 ") ;
			System.out.println("       7)Back            		     ") ;
			
					
			System.out.println("=============================================");
			
			System.out.println("Enter Your Choice:");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				udaoImpl.addCustomer();
				break;
				
			case 2:
				for(User u:udaoImpl.ViewAllUserInfo())
				{
					System.out.println(u.getUid()+"\t"+u.getFirstname()+"\t"+u.getLastname()+"\t"+u.getEmail()+"\t"+u.getPhoneNumber()+"\t"+u.getPassWord());
					
				}
				break;
				
			case 3:
				for(Category c: cdaoImpl.viewAllCategory())
				{
					System.out.println(c.getCategoryId()+"\t"+c.getCategoryName()+"\t"+c.getCategoryDetails());
				}
				
				
				break;
				
			case 4:
				for(SubCategory s:scdaoImpl.viewSubCategory())
				{
					System.out.println(s.getSubCategoryId()+"\t"+s.getSubCategoryName()+"\t"+s.getSubCategoryDetails());
				}
				
				break;
				
			case 5:
				for(PolicyInfo p:pdaoImpl.viewPolicy())
				{
					System.out.println(p.getPolicyId()+"\t"+p.getPolicyName()+"/t"+p.getCategoryName()+"\t"+p.getSubCategoryName()+"\t"+p.getSumAssured()+"\t"+p.getPremium()+"\t"+p.getPolicyDetails());
					
				}
				break;
				
			
				
			case 6:
				System.out.println("Enter User ID:");
				int id = sc.nextInt();
				udaoImpl.policyHold(id);
				break;
				
			case 7:
				Admin.AdminMenuDetails();
				break;
				
				default:
					System.out.println("Choose 1 to 5 between");
					
					
				
				
			}
		}
	}

}



