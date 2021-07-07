package org.cts.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import org.cts.model.Bugs;
import org.cts.util.DBUtil;

public class BugsDaoImpl implements BugsDao {
	
	@Override
	public boolean register(Bugs bug) {
	
		Connection con=null;
		Statement st=null;
		PreparedStatement pst=null;
		boolean isRegistered=false;
		try {
			con=DBUtil.getConnection();
			if(con!=null) 
			{
				st=con.createStatement();
				ResultSet resultSet=st.executeQuery("select count(*) as 'count' from reg_bugs");
				
				int count=0;
				if(resultSet.next())
					count=resultSet.getInt("count");
				pst=con.prepareStatement("insert into reg_bugs(bug_id,bug_name,project_id,raised_by,priority_id,bug_desc,status,raised_date) values(?,?,?,?,?,?,?,?)");
				pst.setString(1, "B_"+bug.getProjectId()+"_"+(count+100));
				pst.setString(2, bug.getBugName());
				pst.setInt(3, bug.getProjectId());
				pst.setString(4, bug.getRaisedBy());
				pst.setInt(5, bug.getPriorityId());
				pst.setString(6, bug.getBugDesc());
				pst.setString(7, bug.getStatus());
				pst.setString(8, bug.getRaisedDate());
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
