package com.ims.admin.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ims.admin.dao.CategoryDAO;
import com.ims.model.Category;
import com.ims.model.PolicyInfo;


public class CategoryDAOImpl implements CategoryDAO{
	
	Scanner sc = new Scanner(System.in);
	static List<Category> addCategory = new ArrayList<>();
	
	
	@Override
	public void addCategory() {
		// TODO Auto-generated method stub

		int h = 1;
		while(h==1)
		{
			++h;
			System.out.println("Enter Category ID:");
			int cid = sc.nextInt();
			System.out.println("Enter Category Name:");
			String cname = sc.next();
			System.out.println("Enter Category Details:");
			String des = sc.next();
			
			Category category = new Category(cid,cname,des);
			addCategory.add(category);
			
			System.out.println("Category Added Successfully");
			
			System.out.println("Would you like to add another Category? 1)Yes  2)No ");
			h = sc.nextInt();
			
			
			
			
			
		}//end of while
		
		
	}
	@Override
	public List<Category> viewAllCategory() {
		// TODO Auto-generated method stub
		 return addCategory;
		
	}

	@Override
	public Category viewCategory(int cid) {
		// TODO Auto-generated method stub
		for(Category c: addCategory)
		{
			if(c.getCategoryId()==cid)
			{
				
			 System.out.println(c.getCategoryId()+"\t"+c.getCategoryName()+"/t"+c.getCategoryDetails());
		    }
		}
	  return null;
	  
	}

		
	

	@Override
	public void updateCategory(int cid) {
		// TODO Auto-generated method stub
		
		int k = 0;
		for(Category c : addCategory)
		{
			
			if(c.getCategoryId()== cid)
			{
				++k;
				System.out.println("Would you like to update  1)Category ID 2)Category Name 3)Category Details ");
				int choice = sc.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("Enter Category ID:");
					int id = sc.nextInt();
					c.setCategoryId(id);
					System.out.println("Category ID is Updated");
					break;
					
				case 2:
					System.out.println("Enter Category Name:");
					String catName = sc.next();
					c.setCategoryName(catName);
					System.out.println("Category Name is Updated");
					break;
					
				case 3:
					System.out.println("Enter Category Details:");
					String d = sc.next();
					c.setCategoryDetails(d);
					break;
					
					default:
						System.out.println("Choose 1 to 3 between");
						
					
				}
			}
		}
		if(k==0);
		System.out.println("Given ID doesn't Exist");
		

	}

	@Override
	public void deleteCategory(int cid) {
		// TODO Auto-generated method stub
		
		int r = 0;
		for(Category c: addCategory)
		{
			if(c.getCategoryId()==cid)
			{
				addCategory.remove(c);
				System.out.println("Category Deleted Successfully");
				++r;
				break;
				
				}
		}
		if(r==0)
			System.out.println("Given ID doesn't exist!");
		

	}
	

}
