package org.cts.dao;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.cts.model.Project;
import org.cts.util.DBUtil;

public class ProjectDaoImpl implements ProjectDao {

	@Override
	public boolean register(Project project) {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement pst=null;
		boolean isRegistered=false;
		try {
			con=DBUtil.getConnection();
			if(con!=null)
			{
				pst=con.prepareStatement("insert into register_project(project_id,project_name,start_date,end_date,status,assigned_manager_id) values(?,?,?,?,?,?)");
				pst.setInt(1, project.getProjectId());
				pst.setString(2, project.getProjectName());
				pst.setString(3, project.getStartDate());
				pst.setString(4, project.getEndDate());
				pst.setString(5, project.getStatus());
				pst.setString(6, project.getAssignedManagerId());
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
