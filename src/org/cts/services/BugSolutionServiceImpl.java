package org.cts.services;

import org.cts.dao.BugSolutionDao;
import org.cts.dao.BugSolutionDaoImpl;

import org.cts.model.BugSolution;

public class BugSolutionServiceImpl implements BugSolutionService {
	BugSolutionDao dao= new BugSolutionDaoImpl();
	
	@Override
	public boolean registerSolution(BugSolution solution) {
		// TODO Auto-generated method stub
		boolean b=dao.register(solution); 
		return b;
		
	}

}
