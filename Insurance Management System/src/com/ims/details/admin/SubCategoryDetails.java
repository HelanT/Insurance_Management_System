package com.ims.details.admin;

import java.util.Scanner;

import com.ims.admin.dao.impl.SubCategoryDAOImpl;
import com.ims.model.SubCategory;

public class SubCategoryDetails {
	
	
public static void SubCategoryDetails() {
		
		Scanner sc = new Scanner(System.in);
	    SubCategoryDAOImpl sdaoImpl = new SubCategoryDAOImpl();
		while(true)
		{
			System.out.println("============================================");
			System.out.println("        1)Add Sub-Category                  ");
			System.out.println("        2)View All Sub-Category             ");
			System.out.println("        3)View Sub-Category                 ");
			System.out.println("        4)Update Sub-Category                ");
			System.out.println("        5)Delete Sub-Category                ");
			System.out.println("        6)Back                               ");
			System.out.println("==============================================");
			
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			switch (choice)
			{
			case 1:
				sdaoImpl.addSubCategory();
				break;
				
			case 2:
				for(SubCategory s:sdaoImpl.viewSubCategory())
				{
					System.out.println(s.getSubCategoryId()+"\t"+s.getSubCategoryName()+"\t"+s.getSubCategoryDetails());
				}
				break;
				
			case 3:
				System.out.println("Enter SubCategory ID:");
				int sid = sc.nextInt();
				sdaoImpl.viewSubCategory(sid);
				break;
				
			case 4:
				System.out.println("Enter SubCategory ID:");
				int sid1 = sc.nextInt();
				sdaoImpl.updateSubCategory(sid1);
				break;
				
			case 5:
				System.out.println("Enter SubCategory ID:");
				int sid2 = sc.nextInt();
				sdaoImpl.deleteSubCategory(sid2);
				break;
				
			case 6:
				Admin.AdminMenuDetails();
				break;
				
				default:
					System.out.println("Choose 1 to 6 between");
					
			}
		}
	}

}
