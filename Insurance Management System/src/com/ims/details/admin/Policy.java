package com.ims.details.admin;

import java.util.Scanner;


import com.ims.admin.dao.impl.PolicyInfoDAOImpl;
import com.ims.model.PolicyInfo;

public class Policy {
	
public static void PolicyMenuDetails() {
		
		Scanner sc = new Scanner(System.in);
		PolicyInfoDAOImpl pdaoImpl = new PolicyInfoDAOImpl();
		while(true)
		{
			System.out.println("==========================================");
			System.out.println("          1)Add Policy                   ");
			System.out.println("          2)View All Policy              ");
			System.out.println("          3)View Policy                  ");
			System.out.println("          4)Update Policy                ");
			System.out.println("          5)Delete Policy                ");
			System.out.println("          6)Back                         ");
			System.out.println("==========================================");
			
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				pdaoImpl.addPolicy();
				break;
				
			case 2:
				for(PolicyInfo p:pdaoImpl.viewPolicy())
				{
					System.out.println(p.getPolicyId()+"\t"+p.getPolicyName()+"\t"+p.getCategoryName()+"\t"+p.getSubCategoryName()+"\t"+p.getSumAssured()+"\t"+p.getPremium()+"\t"+p.getPolicyDetails());
				}
				break;
				
			case 3:
				System.out.println("Enter Policy ID:");
				int pid = sc.nextInt();
				pdaoImpl.viewPolicy(pid);
				break;
				
			case 4:
				System.out.println("Enter Policy ID:");
				int pid1 = sc.nextInt();
				pdaoImpl.updatePolicy(pid1);
				break;
				
			case 5:
				System.out.println("Enter Policy ID:");
				int pid2 = sc.nextInt();
				pdaoImpl.deletePolicy(pid2);
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
