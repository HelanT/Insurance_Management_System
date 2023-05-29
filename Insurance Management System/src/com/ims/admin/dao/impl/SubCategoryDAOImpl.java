package com.ims.admin.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ims.admin.dao.SubCategoryDAO;
import com.ims.model.Category;
import com.ims.model.SubCategory;

public class SubCategoryDAOImpl implements SubCategoryDAO  {
	Scanner sc = new Scanner(System.in);
	static List<SubCategory> addSubCategory = new ArrayList<>();
	static List<Category> addCategory = new ArrayList<>();
	
	@Override
	public void addSubCategory() {
		// TODO Auto-generated method stub
		
		int s =1;
		while(s==1)
		{
			++s;
			System.out.println("Enter Sub-Category ID:");
			int sid = sc.nextInt();
			System.out.println("Enter Sub-Category Name:");
			String subName = sc.next();
			System.out.println("Enter Details:");
			String ds = sc.next();
			
			SubCategory subcategory = new SubCategory(sid,subName,ds);
			addSubCategory.add(subcategory);
			
	        System.out.println("Sub-Category Added Successfully");
	        
	        System.out.println("Would you like to add another sub-category? 1)Yes 2)No");
	        s = sc.nextInt();
	        
	        
	        
		}

	}
	@Override
	public List<SubCategory> viewSubCategory() {
		// TODO Auto-generated method stub
		return addSubCategory;
	}

	@Override
	public SubCategory viewSubCategory(int sid) {
		// TODO Auto-generated method stub
		for(SubCategory s: addSubCategory)
		{
			if(s.getSubCategoryId()==sid)
			{
				System.out.println(s.getSubCategoryId()+"\t"+s.getSubCategoryName()+"\t"+s.getSubCategoryDetails());
			}
			
		}
		return null;
	}

	@Override
	public void updateSubCategory(int sid) {
		// TODO Auto-generated method stub

		int c = 0;
		for(SubCategory s: addSubCategory)
		{
			if(s.getSubCategoryId()==sid)
			{
				++c;
				System.out.println("Would you like to update 1) Sub-Category ID 2)Sub-Category Name 3)Details");
				int choice = sc.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("Enter Sub-Category ID:");
					int id = sc.nextInt();
					s.setSubCategoryId(id);
					System.out.println("Sub-Category ID is Updated");
					break;
					
				case 2:
					System.out.println("Enter Sub-Category Name:");
					String sName = sc.next();
					s.setSubCategoryName(sName);
					System.out.println("Sub-Category Name is Updated");
					break;
					
				case 3:
					System.out.println("Enter Details:");
					String dt = sc.next();
					s.setSubCategoryDetails(dt);
					System.out.println("Sub-Category Details is Updated");
					break;
					
					default:
						System.out.println("Choose 1 to 3 between");
						
						
				}
			}
		}
		if(c==0)
			System.out.println("Given ID doesn't Exist");
	}

	@Override
	public void deleteSubCategory(int sid) {
		// TODO Auto-generated method stub
		
		int f = 0;
		for(SubCategory s: addSubCategory)
		{
			if(s.getSubCategoryId()==sid)
			{
				addSubCategory.remove(s);
				System.out.println("Sub-Category Deleted Successfully");
				++f;
			}
		}
		if(f==0)
			System.out.println("Given ID doesn't exist");
		

	}

}
