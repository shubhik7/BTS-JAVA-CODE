package org.cts.dao;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.cts.model.Employee;
import org.cts.util.DBUtil;

public class EmployeeDaoImpl implements EmployeeDao {
	
	@Override
	public boolean register(Employee employee) {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement pst=null;
		boolean isRegistered=false;
		try {
			con=DBUtil.getConnection();
			if(con!=null)
			{
				pst=con.prepareStatement("insert into register_emp(login_id, password,emp_type,first_name,last_name,date_of_birth,house_number,street_name,state_name,country_name,pincode,contact_no,mail_id,security_question,security_question_answer,registration_date) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
				System.out.println(employee.getSecurityQuestion());
				pst.setInt(1, employee.getLoginId());
				pst.setString(2, employee.getPassword());
				pst.setString(3, employee.getEmpType());
				pst.setString(4, employee.getFirstName());
				pst.setString(5, employee.getLastName());
				pst.setString(6, employee.getDateOfBirth());
				pst.setString(7, employee.getHouseNumber());
				pst.setString(8, employee.getStreetName());
				pst.setString(9, employee.getStateName());
				pst.setString(10, employee.getCountryName());
				pst.setString(11, employee.getPincode());
				pst.setString(12, employee.getContactNo());
				pst.setString(13, employee.getMailId());
				pst.setString(14, employee.getSecurityQuestion());
			
				pst.setString(15, employee.getSecurityQuesAns());
				pst.setString(16, employee.getRegDate());
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
