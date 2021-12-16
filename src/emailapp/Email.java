package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity=15;
	private int defaultPasswordLength=10;
	private String alternateEmail;
	private String companySuffix = "company.com";
	
	//Constructor to receive the first name and last name
	
	public Email(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		
		// call a method asking for depertment - retrun depertment
		this.department=setDepartment();
		
		// call a method that return a random password
		this.password=randomPassword(defaultPasswordLength);
		
		//combine elements to genrate email
		email =firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department +"."+ companySuffix;
	
	

	}
	//Ask for the department
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES: \n1: Sales\n2: Development\n3: Account\n0: Default\n\nChoose your Department: ");
		
			Scanner in = new Scanner(System.in);
			int depChoice = in.nextInt();
			
		
		if(depChoice==1) {
			return "sales";
	}
		else if(depChoice==2) {
			return "development";
		}
		else if(depChoice==3) {
		return "account";
	}
		else {
			return "";
		}
	}
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
		char[] password = new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	public String getPassword() {
		return password;
	}
	public void changePassword(String password) {
		this.password = password;
	}
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	public void setMailboxCapacity(int mailboxCapacity) {
		this.mailboxCapacity = mailboxCapacity;
	}
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	public String showInfo() {
		return "DISPLAY NAME:" +firstName+""+lastName +
				"\nCOMPANY EMAIL:"+email +
				"\nPASSWORD:"+password +
				"\nMAILBOX-CAPACITY:"+ mailboxCapacity +"gb";
	}

}
