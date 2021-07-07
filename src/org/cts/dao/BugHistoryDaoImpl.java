package org.cts.dao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

import org.cts.util.DBUtil;



import java.util.Scanner;

public class BugHistoryDaoImpl implements BugHistoryDao {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		String bstatus=null;
		String bName=null;
		String bugDes=null,regDate=null,rBy=null,solveDate=null,solDetail=null,projectName=null,projectStatus=null,endDate=null,
				startDate=null,managerId=null,assignedDate=null,assignedMember=null;
		int projectId=0;
		int priorityId=0;
		
		Connection con=null;
		Statement st=null, st1=null, st2=null, st3=null, st4=null, st5=null;
		
		try {
			con=DBUtil.getConnection();
			if(con!=null) 
			{
				st=con.createStatement();
				ResultSet resultset=st.executeQuery("select bug_id from reg_bugs");
				while(resultset.next()) {
					System.out.println(resultset.getString(1));
				}
				Scanner scan=new Scanner(System.in);
				
				System.out.println("Select bug_id");
				
				String sbid=scan.nextLine();
				
				st1=con.createStatement();
				ResultSet result=st1.executeQuery("select bug_name,status from reg_bugs where bug_id='"+sbid+"';");
				while(result.next()) {
					bName=result.getString(1);
					System.out.println("Bug name: "+bName);
					 bstatus=result.getString(2);
					System.out.println("Bug Status: "+bstatus);
				}
				
				
				if(bstatus.equals("resolved")) {
					System.out.println("enter word display");
					String display=scan.nextLine();
					System.out.println(display);
					if(display.equals("display")) {
						
						st2=con.createStatement();
					    ResultSet rs=st2.executeQuery("select bug_desc,raised_date,raised_by,priority_id,project_id from reg_bugs where bug_id='"+sbid+"';");
						System.out.println(rs);
					    while (rs.next()) {
							bugDes=rs.getString(1);
							System.out.println(bugDes);
							regDate=rs.getString(2);
							rBy=rs.getString(3);
							priorityId=rs.getInt(4);
							projectId=rs.getInt(5);
						}
						
						st3=con.createStatement();
						ResultSet rs1=st3.executeQuery("select solved_date,solution_details from bug_solution where bug_id='"+sbid+"';");
						while(rs1.next()) {
							solveDate=rs1.getString(1);
							solDetail=rs1.getString(2);
						}
						
						st4=con.createStatement();
						ResultSet rs2=st4.executeQuery("select project_name,start_date,end_date,status,assigned_manager_id from register_project where project_id='"+projectId+"';");
						while(rs2.next()) {
							projectName=rs2.getString(1);
							startDate=rs2.getString(2);
							endDate=rs2.getString(3);
							projectStatus=rs2.getString(4);
							managerId=rs2.getString(1);
						}
					    
						st5=con.createStatement();
						ResultSet rs3=st5.executeQuery("select assigned_date,assigned_member from assign_bugs where project_id='"+projectId+"';");
						while(rs3.next()) {
							assignedDate=rs3.getString(1);
							assignedMember=rs3.getString(2);
				
						}
					
					System.out.println(sbid);
					System.out.println(bName);
					System.out.println(bugDes);
					System.out.println(assignedDate);
					System.out.println(assignedMember);
					System.out.println(solDetail);
					System.out.println(regDate);
					System.out.println(rBy);
					System.out.println(solveDate);
					System.out.println(priorityId);
					System.out.println(projectId);
					System.out.println(projectName);
					System.out.println(startDate);
					System.out.println(endDate);
					System.out.println(projectStatus);
					System.out.println(managerId);
					
					}scan.close();
				}
				
			}
		} catch (Exception e) {
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		
		}
	
	}

}
