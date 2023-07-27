 package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;

public class  EmployeeOracleDAOImpl implements IEmployeeDAO {
	private static final String EMP_INSERT_QUERY = "INSERT INTO REAL_TIMEDI_SPRING_EMPLOYEE VALUES(SP_ENO_SEQ.NEXTVAL ,?,?,?,?,?)";
//has a pro
	private DataSource ds;
	 
	public  EmployeeOracleDAOImpl(DataSource ds) {
		super();
		System.out.println("EmployeeOracleDAOImpl:1-param constructor");
		this.ds = ds;
	}
	
//	@Override
//	public int insertEmployee(EmployeeBO bo) throws Exception {
//		int result=0;
//		System.out.println("EmployeeOracleDAOImpl: insertEmployee ");
//	 
//		try(Connection con=ds.getConnection();
//		PreparedStatement	ps = con.prepareStatement(EMP_INSERT_QUERY);
//			){
//			// set value of query paream
//			ps.setString(1, bo.getEname());
//			ps.setString(2, bo.getDesg());
//			ps.setFloat(3, bo.getBasicSalary());
//			ps.setFloat(4, bo.getGrossSalary());
//			ps.setFloat(5, bo.getNetSalary());
//			
//			// execute the Query
//			result = ps.executeUpdate();
//	}//try
//		catch (SQLException se) {
//			se.printStackTrace();
//			throw  se;//exeption rethrowing
//		}
//		catch (Exception e) {
//			// exeption rethrowing
//			e.printStackTrace();
//			throw e;//	 exeption rethrowing
//		}
//	return result;
//	
//}//method
	
	
	
	

	@Override
	public int insertEmployee(EmployeeBO bo) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		int result=0;
		try {
			// grt pooled jdbc con object
			con = ds.getConnection();
			// create PrepardStatement obj having query as the pre-compiled SQL qury
			ps = con.prepareStatement(EMP_INSERT_QUERY);
			// set value of query paream
			ps.setString(1, bo.getEname());
			ps.setString(2, bo.getDesg());
			ps.setFloat(3, bo.getBasicSalary());
			ps.setFloat(4, bo.getGrossSalary());
			ps.setFloat(5, bo.getNetSalary());
			// execute the Query
			result = ps.executeUpdate();

		} catch (SQLException se) {
			throw se;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			// close jdbc obj
			try {
				if (ps != null)
					ps.close();
			} catch (SQLException e2) {
				e2.printStackTrace();

			}
			try {
				if (con != null)
					con.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}

		} // final
		return result;
	}// method

}// class