package org.cts.services;

import org.cts.dao.ProjectDao;


import org.cts.dao.ProjectDaoImpl;

import org.cts.model.Project;

public class ProjectServiceImpl implements ProjectService {
	ProjectDao dao=new ProjectDaoImpl();

	@Override
		public boolean registerProject(Project project) {
			// TODO Auto-generated method stub
			boolean b= dao.register(project);  System.out.println("Assign Bugs");
			return b;
			
			
		
	}

}
