package org.cts.services;
import org.cts.dao.EmployeeDao;
import org.cts.dao.EmployeeDaoImpl;

import org.cts.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDao dao=new EmployeeDaoImpl();
	/*
	 * @Override public boolean registerEmployee(Employee employee) { boolean
	 * b=dao.register(employee); System.out.println(b); return b; }
	 */

	@Override
	public boolean registerEmployee(Employee employee) {
		// TODO Auto-generated method stub
		boolean b=dao.register(employee);  
		return b;
		
		
	}

}
