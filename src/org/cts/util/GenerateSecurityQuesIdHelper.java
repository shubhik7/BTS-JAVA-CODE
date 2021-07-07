package org.cts.util;
import org.cts.model.Employee;

public class GenerateSecurityQuesIdHelper {
	
		public String generateSecurityId(Employee empl) {
			
			String secQ=empl.getSecurityQuestion();
			String secId=null;
			        if (secQ.equals("What is the name of your pet?")) {
			         secId="q001";
			        }
			        else if(secQ.equals("What is your favourite colour?")) {
				      secId="q002";
			        }
			        else if(secQ.equals("What is your nickname?")) {
				      secId="q003";
			        }
			     
		    return secId;

	}
	}


