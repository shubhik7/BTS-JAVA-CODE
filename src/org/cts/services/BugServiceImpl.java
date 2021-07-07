package org.cts.services;
import org.cts.dao.BugsDao;

import org.cts.dao.BugsDaoImpl;

import org.cts.model.Bugs;



public class BugServiceImpl implements BugService {
	BugsDao dao=new BugsDaoImpl();
	
	@Override
	public boolean registerBugs(Bugs bug) {
		// TODO Auto-generated method stub
		boolean b= dao.register(bug); 
		return b;
	}

}
