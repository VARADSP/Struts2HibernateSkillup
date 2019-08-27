package com.codeFactory.connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConnection {

	Configuration cfg = new Configuration();
	SessionFactory factory;
	Session session1;
	
	public Session getHbmConnection()
	{
		cfg.configure("hibernate.cfg.xml");
		factory = cfg.buildSessionFactory();
		session1 = factory.openSession();
		
		return session1;
	}
}
