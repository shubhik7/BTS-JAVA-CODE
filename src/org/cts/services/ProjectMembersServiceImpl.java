package org.cts.services;
import org.cts.model.ProjectMembers;
import org.cts.dao.ProjectMembersDao;
import org.cts.dao.ProjectMembersDaoImpl;

public class ProjectMembersServiceImpl implements ProjectMembersService {
	ProjectMembersDao dao=new ProjectMembersDaoImpl();

	@Override
	public boolean registerMember(ProjectMembers member) {
		// TODO Auto-generated method stub
		
	        boolean b=dao.register(member);
	        return b;
	}

}
