package com.ims.model;

public class User {
	
	private int uid;
	private String firstname;
	private String lastname;
	private String address;
	private long phoneNumber;
	private String email;
	private String passWord;
	
	private int PolicyId;
	
	public User(int uid, String firstname, String lastname, String address, long phoneNumber, String email,
			String passWord) {
		super();
		this.uid = uid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.passWord = passWord;
		
		
	}

	public User(int uid, String firstname, String lastname, String address, long phoneNumber, String email,
			String passWord, int PolicyId) {
		super();
		this.uid = uid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.passWord = passWord;
		this.PolicyId = PolicyId;
	}
		
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public User(int uid2, int pid, String fname, String lname, String add, long phoneNumber2, String mail, String pw) {
		// TODO Auto-generated constructor stub
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public int getPolicyId() {
		// TODO Auto-generated method stub
		return PolicyId;
	}

	
	
	
	

}
