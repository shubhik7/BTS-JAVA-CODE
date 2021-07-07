package org.cts.services;
import org.cts.model.AssignBugs;
import org.cts.dao.AssignBugDao;
import org.cts.dao.AssignBugsDaoImpl;

public class AssignBugServiceImpl implements AssignBugService {
	
	AssignBugDao dao=new AssignBugsDaoImpl();
	
	@Override
	public boolean assignBug(AssignBugs assignbug) {
		// TODO Auto-generated method stub
		boolean b= dao.assign(assignbug);  
		return b;
	}

	
	

}
