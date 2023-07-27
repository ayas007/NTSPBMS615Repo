 package com.nt.service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.IEmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
//has a property
	private IEmployeeDAO dao;
	
	public EmployeeMgmtServiceImpl(IEmployeeDAO dao) {
		super();
		System.out.println("EmployeeMgmtServiceImpl: 1-param constructor");
		this.dao = dao;
	}

	@Override
	public String registerEmployee(EmployeeDTO dto) throws Exception {
		
		System.out.println("EmployeeMgmtServiceImpl:registerEmployee ");
		
		//write b.logic to calculate grossSal and netSal
		float grossSalary=dto.getBasicSalary()+dto.getBasicSalary()*0.4f;//S+40%
		float netSalary=grossSalary - dto.getBasicSalary()*0.2f;// -20%
		
		//Prepare BO class obj having parsistable data
		EmployeeBO bo=new EmployeeBO();
		bo.setEname(dto.getEname());
		bo.setDesg(dto.getDesg());
		bo.setBasicSalary(dto.getBasicSalary());
		bo.setGrossSalary(grossSalary);
		bo.setNetSalary(netSalary);
		
		//use DAO
		int count=dao.insertEmployee(bo);
		
		//gen finl reslt
		return count==1?" Employee Registered with netSalary::"+netSalary:" Employee not registered with netSalary::"+netSalary;//ternary operater
	}//method
 
}