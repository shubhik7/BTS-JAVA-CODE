package org.cts.model;
public class Employee {
	
    
	private int loginId;
	private String  password;
	private String empType ;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String houseNumber;
	private String streetName;
	private String stateName;
	private String countryName;
	private String pincode ;
	private String contactNo ;
	private String mailId ;
	private String securityQuestion;
	private String securityQuesAns;
	private String regDate ;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int loginId, String password, String empType, String firstName, String lastName,
			String dateOfBirth, String houseNumber, String streetName, String stateName, String countryName,
			String pincode, String contactNo, String mailId, String securityQuestion,
			String securityQuesAns, String regDate) {
		super();
		this.loginId= loginId;
		this.password = password;
		this.empType = empType;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.houseNumber = houseNumber;
		this.streetName = streetName;
		this.stateName = stateName;
		this.countryName = countryName;
		this.pincode = pincode;
		this.contactNo = contactNo;
		this.mailId = mailId;
		this.securityQuestion = securityQuestion;
		this.securityQuesAns = securityQuesAns;
		this.regDate = regDate;
	}
	public int getLoginId() {
		return loginId;
	}
	public void setLoginId(int loginId) {
		this.loginId= loginId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmpType() {
		return empType;
	}
	public void setEmpType(String empType) {
		this.empType = empType;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getSecurityQuestion() {
		return securityQuestion;
	}
	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}
	public String getSecurityQuesAns() {
		return securityQuesAns;
	}
	public void setSecurityQuesAns(String securityQuesAns) {
		this.securityQuesAns = securityQuesAns;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	

}
