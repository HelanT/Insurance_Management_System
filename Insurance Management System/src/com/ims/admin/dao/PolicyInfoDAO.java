package com.ims.admin.dao;


import java.util.List;

import com.ims.model.Category;
import com.ims.model.PolicyInfo;
import com.ims.model.SubCategory;

public interface PolicyInfoDAO {

	public void addPolicy();
	
	public List<PolicyInfo> viewPolicy();
	
	public PolicyInfo viewPolicy(int pid);
	
	public void updatePolicy (int pid);
	public void deletePolicy(int pid);


	
	
	
	
	
	

	
}
