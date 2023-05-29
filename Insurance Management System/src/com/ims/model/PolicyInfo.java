package com.ims.model;

public class PolicyInfo{

	private int policyId;
	private String policyName;
	private String CategoryName;
	private String SubCategoryName;
	private int sumAssured;
	private int premium;
	private String policyDetails;
	
	
	public PolicyInfo(int policyId, String policyName, String categoryName, String subCategoryName, int sumAssured,
			int premium, String policyDetails) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
		CategoryName = categoryName;
		SubCategoryName = subCategoryName;
		this.sumAssured = sumAssured;
		this.premium = premium;
		this.policyDetails = policyDetails;
	}
	public PolicyInfo(int policyId, String policyName, int sumAssured, int premium, String policyDetails) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
		this.sumAssured = sumAssured;
		this.premium = premium;
		this.policyDetails = policyDetails;
	}
	public PolicyInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	public String getSubCategoryName() {
		return SubCategoryName;
	}
	public void setSubCategoryName(String subCategoryName) {
		SubCategoryName = subCategoryName;
	}
	public int getSumAssured() {
		return sumAssured;
	}
	public void setSumAssured(int sumAssured) {
		this.sumAssured = sumAssured;
	}
	public int getPremium() {
		return premium;
	}
	public void setPremium(int premium) {
		this.premium = premium;
	}
	public String getPolicyDetails() {
		return policyDetails;
	}
	public void setPolicyDetails(String policyDetails) {
		this.policyDetails = policyDetails;
	}
	
	
}