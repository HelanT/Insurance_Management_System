package com.ims.admin.dao;

import java.util.List;


import com.ims.model.SubCategory;

public interface SubCategoryDAO {
	
	  public  void addSubCategory();
	 
	 
	  public List<SubCategory> viewSubCategory();
	   
	  public SubCategory viewSubCategory(int sid);
	   
	  public void updateSubCategory(int sid);
	  
	  public void deleteSubCategory(int sid);

		

}
