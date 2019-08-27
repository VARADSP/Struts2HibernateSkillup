package com.codeFactory.action;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.codeFactory.bean.Employee;
import com.codeFactory.connection.HibernateConnection;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class StoreData extends ActionSupport implements ModelDriven<Employee>{

	private Employee emp = new Employee();
	HibernateConnection hbmCon = new HibernateConnection();
	
	public String execute()
	{
		Session session1 = hbmCon.getHbmConnection();
		Transaction t = session1.beginTransaction();
		
		
		session1.persist(emp);
		t.commit();
		session1.close();
		System.out.println("saved.");
		
		System.out.println("first name : " + emp.getFirstName());
		System.out.println("last name : " + emp.getLastName());
		
		return SUCCESS;
	}

	@Override
	public Employee getModel() {
		// TODO Auto-generated method stub
		return emp;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}
}
