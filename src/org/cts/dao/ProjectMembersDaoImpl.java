package org.cts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.cts.model.ProjectMembers;
import java.sql.SQLException;

import org.cts.util.DBUtil;

public class ProjectMembersDaoImpl implements ProjectMembersDao {

	@Override
	public boolean register(ProjectMembers mem) {
		Connection con=null;
		PreparedStatement pst=null;
		boolean isRegistered=false;
		
		try {
			con=DBUtil.getConnection();
			if(con!=null)
			{
				pst=con.prepareStatement("insert into project_members(project_id,manager_name,member_name,status) values(?,?,?,?)");
				pst.setInt(1, mem.getProjectId());
				pst.setString(2, mem.getManagerName());
				pst.setString(3, mem.getMemberName());
				pst.setInt(4, mem.getStatus());
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
