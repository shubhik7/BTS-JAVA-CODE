package org.cts;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
	
import org.cts.model.Employee;

import org.cts.services.EmployeeService;
import org.cts.services.EmployeeServiceImpl;

import org.cts.model.Project;
import org.cts.services.ProjectService;
import org.cts.services.ProjectServiceImpl;
import org.cts.util.AssignManagerHelper;

import org.cts.model.Bugs;
import org.cts.services.BugService;
import org.cts.services.BugServiceImpl;

import org.cts.model.ProjectMembers;
import org.cts.services.ProjectMembersService;
import org.cts.services.ProjectMembersServiceImpl;

import org.cts.util.GenerateSecurityQuesIdHelper;
import org.cts.model.BugSolution;
import org.cts.services.BugSolutionService;
import org.cts.services.BugSolutionServiceImpl;

import org.cts.dao.BugHistoryDao;
import org.cts.dao.BugHistoryDaoImpl;

import org.cts.model.AssignBugs;
import org.cts.services.AssignBugService;
import org.cts.services.AssignBugServiceImpl;

public class Main {	 
	static void adminTask1()
	{
		int loginId;
		String password;
		String empType;
		String firstName;
		String lastName;
		String dob;
		String houseNo;
		String streetName;
		String state;
		String country;
		String pincode;
		String contactNo;
		String mailId;
		String securityQues;
		String securityAns;
		String regDate;
		String securityOuesId;
		
		try {
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Login Id");
			loginId=Integer.parseInt(reader.readLine());
			System.out.println("Enter password");
			password =reader.readLine(); 
			System.out.println("Enter employment type"); 
			empType=reader.readLine();
			System.out.println("Enter Enployee's firstname"); 
			firstName=reader.readLine();
			System.out.println("Enter Employee's lastname");
			lastName=reader.readLine();
			System.out.println("Enter date of birth"); 
			dob=reader.readLine();
			System.out.println("Enter house number"); 
			houseNo=reader.readLine();
			System.out.println("Enter street name");
			streetName=reader.readLine();
			System.out.println("Enter state "); 
			state=reader.readLine();
			System.out.println("Enter country");
			country=reader.readLine();
			System.out.println("Enter pincode");
			pincode=reader.readLine();
			System.out.println("Enter contact number");
			contactNo=reader.readLine();
			System.out.println("Enter email id");
			mailId=reader.readLine();
			System.out.println("Select security question "); 
			securityQues=reader.readLine(); 
			System.out.println("Give answer"); 
			securityAns=reader.readLine(); 
			System.out.println("Enter registration date"); 
			regDate=reader.readLine();
			 
			Employee ee = new Employee(loginId, password, empType, firstName, lastName, dob, houseNo, streetName,
			state, country, pincode, contactNo, mailId, securityQues, securityAns, regDate);
			
			GenerateSecurityQuesIdHelper sid=new  GenerateSecurityQuesIdHelper();
			securityOuesId= sid.generateSecurityId(ee); 
				  	  
			Employee e1= new Employee(loginId, password, empType, firstName, lastName, dob, houseNo, streetName,
		    state, country, pincode, contactNo, mailId, securityOuesId , securityAns, regDate);
			
			EmployeeService empservice = new EmployeeServiceImpl();
			boolean b = empservice.registerEmployee(e1); 
			System.out.println(b);
			if (b)
				System.out.println(" Employee registered successfully");
		    else
				System.out.println( "Employee not registered");
		
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
		  
	static void adminTask2()
	{
		int projectId;
		String projectName;
		String startDate;
		String endDate;
		String status;
		String assignedManager;
		
		try
		{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Enter Project ID"); 
		    projectId=Integer.parseInt(reader.readLine()); 
			System.out.println("Enter Project name");
			projectName=reader.readLine();
		    System.out.println("Enter starting date of the project");
		    startDate=reader.readLine(); 
		    System.out.println("Enter ending date of the project");
			endDate=reader.readLine();
		    System.out.println("Enter status of your project");
			status= reader.readLine();
		    System.out.println("Select manager assigned to the project");
		    assignedManager=reader.readLine();
				  	  
			Project pp=new Project(projectId,projectName,startDate,endDate,status,assignedManager);
			
			AssignManagerHelper assignManagerId= new AssignManagerHelper();
			String managerId=assignManagerId.assignManagerId(pp);
				  
			Project p1=new Project(projectId,projectName,startDate,endDate,status,managerId);
			
			ProjectService projectService = new ProjectServiceImpl();	  
		    boolean c= projectService.registerProject(p1);
				  
		    if(c) 
		    	System.out.println("project registered successfully");
		    else
		    	System.out.println(" project not registered");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
			 
	static void tester()
	{
		String bugName;
		int projectId;
		String bugRaisedBy;
		int priorityId;
		String bugDesc;
		String bugStatus;
		String bugRegDate;
		
		try 
		{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Enter bugname");
			bugName=reader.readLine();
		    System.out.println("Enter Project Id");
			projectId= Integer.parseInt(reader.readLine());
			System.out.println("Enter the name of the person who raised the bug");
			bugRaisedBy=reader.readLine(); 
			System.out.println("Enter Priority Id");
		    priorityId= Integer.parseInt(reader.readLine());
			System.out.println("Enter Bug Description");
			bugDesc=reader.readLine();
			System.out.println("Enter Bug Status");
		    bugStatus=reader.readLine();
			System.out.println("Enter bug registration date");
		    bugRegDate=reader.readLine();
				  
			Bugs b1=new Bugs(bugName,projectId,bugRaisedBy,priorityId,bugDesc,bugStatus,bugRegDate);
				  
			BugService bugService = new BugServiceImpl();  
			boolean d= bugService.registerBugs(b1);
				  
		    if(d)
		    	System.out.println("bugs registered successfully");
			else
				System.out.println("bugs not registered");
			
		}catch(IOException e) {
			e.printStackTrace();
				
		}
	}
		
		 
	static void managerTask1() 
	{
		int projectId;
		String managerName;
		String memberName;
		int memberStatus;
		
		try 
		{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	  
			System.out.println("Enter Project Id"); 
			projectId=Integer.parseInt(reader.readLine()); 
			System.out.println("Enter manager Name"); 
			managerName=reader.readLine();
			System.out.println("Enter Member Name "); 
			memberName=reader.readLine();
			System.out.println("Enter Member Status"); 
		    memberStatus=Integer.parseInt(reader.readLine());
				  
			ProjectMembers pMember= new ProjectMembers(projectId,managerName,memberName,memberStatus);
			
			ProjectMembersService pMemberService= new ProjectMembersServiceImpl();
			boolean e=pMemberService.registerMember(pMember);
				  
		    if(e) 
		    	System.out.println("members registered successfully to the project");
			else 
				System.out.println("members registration unsuccessful");
			
		    
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	static void managerTask2()
	{
		int assignedProjectId;
		String bugAssignDate;
		String bugAssignedTo;
		String assignedBugId;
	    
		try
		{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	  
			System.out.println("Enter Project Id");
			assignedProjectId=Integer.parseInt(reader.readLine());
			System.out.println("Enter date of bug assignment");
			bugAssignDate=reader.readLine();
		    System.out.println("Enter Member Name");
			bugAssignedTo=reader.readLine();
			System.out.println("Enter assigned bug Id");
			assignedBugId=reader.readLine();
				  
			AssignBugs assignBug=new AssignBugs(assignedProjectId,bugAssignDate,bugAssignedTo,assignedBugId);
			
			AssignBugService assignBugService=new AssignBugServiceImpl();
			boolean x=assignBugService.assignBug(assignBug);
			
			
			if(x) 
				System.out.println("bug assigned successfully");
			else 
				System.out.println("bug assignment wasn't complete");
			
		}catch(IOException e){
			e.printStackTrace();
		}
			
	}	 
		   
		   
	static void developer() 
	{
		String bugId; 
		String bugSolveDate;
	    String bugSolutionDetail;
	    
	    try
	    {
		    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	  
			//Scanner sc=new Scanner(System.in);
			System.out.println("Enter Bug Id");
			bugId=reader.readLine();
			System.out.println("Enter Solved Date");
			bugSolveDate=reader.readLine();
			System.out.println("Enter Solution Details");
			bugSolutionDetail=reader.readLine();
				  
		    BugSolution bugSolution= new BugSolution(bugId,bugSolveDate,bugSolutionDetail);
				   
			BugSolutionService bugSolutionService = new BugSolutionServiceImpl();	   
			boolean f=bugSolutionService.registerSolution(bugSolution);
				   
			if(f)
				System.out.println("Bug Solution registered successfully");
			else
				System.out.println("Bug Solution not registered");
			
	    }catch(IOException e) {
	    	e.printStackTrace();
	    }
	}	
			
	static void adminTask3() 
	{
		System.out.println("Bug History Details are generated as per the values available in the database");
		BugHistoryDao dao=new BugHistoryDaoImpl();   
		dao.display();		
	}
	
public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Bug Tracking System");
		System.out.println("Enter employee type:\n 1.Administrator\n 2.Manager\n 3.Tester\n 4.Developer");
		int employeetype=sc.nextInt();
		switch(employeetype)
		{
		case 1:
		{
		
			int adminChoice=0;
		    while(adminChoice!=3) {
		        System.out.println("1. BTS Management System");
		        System.out.println("2. Report Management System");
		        System.out.println("3. Logout");
	            int adminSelectedChoice=sc.nextInt();
			
			switch (adminSelectedChoice) {
			  case 1:
			  {
				  int adminAction=0;
				  while(adminAction!=3) {
				  System.out.println("Select action:\n 1.Register Employee Details\n 2.Register Project Details\n 3.Go back");
				  int adminSelectedAction=sc.nextInt();
				  
				  switch(adminSelectedAction) {
				  case 1:
					  System.out.println("Register Employee Details");
					  Main.adminTask1();
					  break;
				  case 2:	
					  System.out.println("Register Project Details");
					  Main.adminTask2();
					  break;
				  case 3:
					  break;
				  }adminAction=adminSelectedAction;
			      }
			  }		  
				   
				  
			  break;
			  case 2:
				   System.out.println("Bug History");
				   Main.adminTask3();
				   break;
			  case 3:
				  System.out.println("Thankyou");
				  break;
			}
			adminChoice=adminSelectedChoice;
		    }
		}
		break;
		case 2:{
		
		
			int managerChoice=0;
		    while(managerChoice!=2) {
		    	System.out.println("1. Manager Activity Management");
		    	System.out.println("2. Logout");
		    	int managerSelectedChoice=sc.nextInt();
		    	
		    switch(managerSelectedChoice) {
		    
			  case 1:
			  {
				  int managerAction=0;
				  while(managerAction!=3) {
				  System.out.println("select action:/n 1.Add Project Member\n 2.Assign Bugs\n 3.Go Back");  
				  int managerSelectedAction=sc.nextInt();
				  
				  switch(managerSelectedAction) {
				  case 1:
					  System.out.println("Add Project Member");
					  Main.managerTask1();
					  break;
				  case 2:
					  System.out.println("Assign Bugs");
					  Main.managerTask2();
				      break;
				  case 3:
					  break;
				  }managerAction=managerSelectedAction;
				  }
			  }
			  break;
			  case 2:
				  System.out.println("Thankyou");
				  break;
		    }
		    managerChoice=managerSelectedChoice;
		    }
		}break;
		
		case 3:{
			
			int testerChoice=0;
		    while(testerChoice!=2) {
		    	System.out.println("1. Raise Bugs Management System");
		    	System.out.println("2. Logout");
		    	int testerSelectedChoice=sc.nextInt();
		    	
		    switch(testerSelectedChoice) {
		    
		       case 1:
		    	   System.out.println("Raise Bugs");
				   Main.tester();
			       break;
			  case 2:
				  System.out.println("Thankyou");
				  break;
		    }
		    testerChoice=testerSelectedChoice;
		    }
		    
		}
		    break;
		
		    case 4:{
       
			
			int developerChoice=0;
		    while(developerChoice!=2) {
		    	System.out.println("1. Fix Bugs Management System");
		    	System.out.println("2. Logout");
		    	int developerSelectedChoice=sc.nextInt();
		    	
		  switch(developerSelectedChoice) {
		    case 1:
		    	System.out.println("Register Bug Solution");
		    	Main.developer();
		    	break;
		    case 2:
		    	System.out.println("Thankyou");
		    	break;
		    }
		  developerChoice=developerSelectedChoice;
		    }
		    }
		    break;
		    
           default: System.out.println("You have no permission to enter this site!!!!");
	
       
			sc.close();
		}
	}
}
