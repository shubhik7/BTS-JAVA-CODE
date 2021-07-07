package org.cts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.cts.model.AssignBugs;
import org.cts.util.DBUtil;

public class AssignBugsDaoImpl implements AssignBugDao {

	@Override
	public boolean assign(AssignBugs assignBug) {
		// TODO Auto-generated method stub	
			Connection con=null;
			PreparedStatement pst=null;
			boolean isRegistered=false;
			try {
				con=DBUtil.getConnection();
				if(con!=null) 
				{
					pst=con.prepareStatement("insert into assign_bugs(project_id,assigned_date,assigned_member,assigned_bug_id) values(?,?,?,?)");
					pst.setInt(1, assignBug.getProjectId());
					pst.setString(2, assignBug.getBugAssignedDate());
					pst.setString(3, assignBug.getAssignedMember());
					pst.setString(4, assignBug.getAssignedBugId());
					
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


