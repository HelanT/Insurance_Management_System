package com.ims.details.admin;

import java.util.Scanner;


import com.ims.admin.dao.impl.CategoryDAOImpl;
import com.ims.model.Category;


public class CategoryDetails {
	
 public static void CategoryMenuDetails() {
		
		Scanner sc = new Scanner(System.in);
		CategoryDAOImpl cdaoImpl = new CategoryDAOImpl();
		while(true)
		{
			System.out.println("===============================");
			System.out.println("       1)Add Category          ");
			System.out.println("       2)View All Category         ");
			System.out.println("       3)View Category             ");
			System.out.println("       4)Update Categeory           ");
			System.out.println("       5)Delete Categeory          ");
			System.out.println("       6)Back                       ");
			System.out.println("==================================");
			
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			switch(choice) {
			
			case 1:
				cdaoImpl.addCategory();
				break;
				
			case 2:
				for(Category c:cdaoImpl.viewAllCategory())
				{
					System.out.println(c.getCategoryId()+"\t"+c.getCategoryName()+"\t"+c.getCategoryDetails());
				}
				
				break;
				
			case 3:
				System.out.println("Enter Category ID:");
				int cid = sc.nextInt();
				cdaoImpl.viewCategory(cid);
				break;
				
			case 4:
				System.out.println("Enter Category ID:");
				int cid1 = sc.nextInt();
				cdaoImpl.updateCategory(cid1);
				break;
				
			case 5:
				System.out.println("Enter Category ID:");
				int cid2 = sc.nextInt();
				cdaoImpl.deleteCategory(cid2);
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
