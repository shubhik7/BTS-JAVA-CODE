package org.cts.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.Statement;
import org.cts.util.DBUtil;

import org.cts.model.BugSolution;

public class BugSolutionDaoImpl implements BugSolutionDao {

	@Override
	public boolean register(BugSolution bs) {
		// TODO Auto-generated method stub
		Connection con=null;
		
		Statement st=null;
		PreparedStatement pst=null;
		boolean isRegistered=false;
		try {
			con=DBUtil.getConnection();
			if(con!=null) 
			{
				
					
				pst=con.prepareStatement("insert into bug_solution(bug_id,solved_date,solution_details) values(?,?,?)");
				pst.setString(1, bs.getBugId());
				pst.setString(2, bs.getSolvedDate());
				pst.setString(3, bs.getSolutionDetails());
				
				st=con.createStatement();
				st.executeUpdate("update reg_bugs set status=\"resolved\" where bug_id='"+bs.getBugId()+"';");
				
				int a=pst.executeUpdate();
				if(a>0) 
					isRegistered=true;
				
				
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
		return isRegistered;
		
	}

}
