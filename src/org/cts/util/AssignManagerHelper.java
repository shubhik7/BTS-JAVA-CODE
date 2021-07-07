package org.cts.util;
import org.cts.model.Project;
public class AssignManagerHelper {
	public String assignManagerId(Project pro) {
			String manager= pro.getAssignedManagerId();
			String mid=null;
			if(manager.equals("Riya Tiwari"))
				mid="904002";
			else if(manager.equals("Rahul K"))	
				mid="980762";
			else if(manager.equals("Riddhi Gupta"))
				mid="904992";
			return mid;
		}

	}


