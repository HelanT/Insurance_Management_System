package com.ims.admin.dao;

import java.util.List;

import com.ims.model.Category;
import com.ims.model.PolicyInfo;


public interface CategoryDAO {
	
	public void addCategory();
	
    public  List<Category> viewAllCategory();
    
    public Category viewCategory(int cid);
	public void updateCategory(int cid);
	public void deleteCategory(int cid);

}
