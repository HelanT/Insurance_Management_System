package com.ims.admin.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ims.admin.dao.PolicyInfoDAO;
import com.ims.model.Category;
import com.ims.model.PolicyInfo;
import com.ims.model.SubCategory;

public class PolicyInfoDAOImpl implements PolicyInfoDAO {
	Scanner sc = new Scanner(System.in);
	  static List<PolicyInfo> addPolicy = new ArrayList<>();
	  static List<Category> addCategory = new ArrayList<>();
	 static  List<SubCategory> addSubCategory = new ArrayList<>();

	 
	 
	
	

	@Override
	public void addPolicy() {
		// TODO Auto-generated method stub
		
		
		int d = 1;
		while(d==1)
		{
			++d;
			System.out.println("Enter Policy ID:");
			int pid= sc.nextInt();
			System.out.println("Enter Policy Name:");
			String pname = sc.next();
			System.out.println(addCategory);
			System.out.println("Choose from the above list:");
			String cname = sc.next();
			System.out.println(addSubCategory);
			System.out.println("Choose from the above list:");
			String subName = sc.next();
			System.out.println("Enter SumAssured:");
			int sa = sc.nextInt();
			System.out.println("Enter Premium:");
			int pre = sc.nextInt();
			System.out.println("Enter Policy Details:");
			String des = sc.next();
			
			PolicyInfo policy = new PolicyInfo(pid,pname,cname,subName,sa,pre,des);
			addPolicy.add(policy);
			
			System.out.println("Policy Added Successfully");
			
			System.out.println("Would you like to add another Policy? 1)Yes  2)No ");
			d = sc.nextInt();
			
			
		}	

	}


	@Override
	public List<PolicyInfo> viewPolicy() {
		// TODO Auto-generated method stub 
		return addPolicy;
	}

	@Override
	public PolicyInfo viewPolicy(int pid) {
		// TODO Auto-generated method stub
		for(PolicyInfo p: addPolicy)
		{
			if(p.getPolicyId()==pid)
			{
			   System.out.println(p.getPolicyId()+"\t"+p.getPolicyName()+"\t"+ p.getCategoryName()+"\t"+ p.getSubCategoryName()+"\t"+p.getSumAssured()+"\t"+p.getPremium()+"\t"+p.getPolicyDetails());
			   
			}
			
		}
		return null;
	}

	@Override
	public void updatePolicy(int pid) {
		// TODO Auto-generated method stub
		
	int h = 0;
	for(PolicyInfo p: addPolicy)
	{
		if(p.getPolicyId()==pid)
		{
			++h;
			System.out.println("Would you like to update 1)Policy Name 2)SumAssured 3)Description");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter Policy Name:");
				String pname = sc.next();
				p.setPolicyName(pname);
				System.out.println("Your Policy Name is Updated");
				break;
				
			case 2:
				System.out.println("Enter SumAssured:");
				int sa = sc.nextInt();
				p.setSumAssured(sa);
				System.out.println("Sum Assured is Updated");
				break;
				
			case 3:
				System.out.println("Enter Category Details:");
				String des = sc.next();
				p.setPolicyDetails(des);
				System.out.println("Details Updated");
				break;
				
				default:
					System.out.println("Choose 1 to 3 between");
					
			}
		}
	}
	if(h==0)
		System.out.println("Given Policy ID doesn't exist!");

	}

	@Override
	public void deletePolicy(int pid) {
		// TODO Auto-generated method stub
		int k = 0;
		for(PolicyInfo pol: addPolicy)
		{
			if(pol.getPolicyId()==pid)
			{
				addPolicy.remove(pol);
				System.out.println("Policy Deleted Successfully");
				++k;
				break;
				
				}
		}
		if(k==0)
			System.out.println("Given ID doesn't exist!");
		

	}

}

	