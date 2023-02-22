package com.exam.biz;

import java.util.ArrayList;

import com.exam.dao.EmpDao;
import com.exam.entity.EmpEntity;

public class EmpBiz {

	public int insertEmp(EmpEntity emp) {
		EmpDao dao=new EmpDao();
		int n=dao.insertEmp(emp);
		return n;
	}

	public ArrayList<EmpEntity> listEmp() {
		EmpDao dao=new EmpDao();
		ArrayList<EmpEntity> list=dao.listEmp();
		
		return list;
	}
	
	public int updateEmp(String ename,String phone,String dept) {
		EmpDao dao=new EmpDao();
		int n=dao.updateEmp(ename,phone,dept);
		return n;
	}

}
