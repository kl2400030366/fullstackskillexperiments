package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class StaffManager {
	
	public String addStaff(Staff S) throws Exception
	{
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.persist(S);
		session.getTransaction().commit();
		session.close();
		factory.close();
		
		return "Staff added...";
	}

}
