package com.ims.model;

public class SubCategory {
	
	private int subCategoryId;
    private String CategoryName;
	private String subCategoryName;
	private String subCategoryDetails;
	
	

	public SubCategory(int subCategoryId, String categoryName, String subCategoryName, String subCategoryDetails) {
		super();
		this.subCategoryId = subCategoryId;
		CategoryName = categoryName;
		this.subCategoryName = subCategoryName;
		this.subCategoryDetails = subCategoryDetails;
	}

	public SubCategory(int subCategoryId, String subCategoryName, String subCategoryDetails) {
		super();
		this.subCategoryId = subCategoryId;
		this.subCategoryName = subCategoryName;
		this.subCategoryDetails = subCategoryDetails;
	}

	public SubCategory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(int subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public String getSubCategoryDetails() {
		return subCategoryDetails;
	}

	public void setSubCategoryDetails(String subCategoryDetails) {
		this.subCategoryDetails = subCategoryDetails;
	}

	

	

	
	
	

}
