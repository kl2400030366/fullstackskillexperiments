package model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;


public class StudentsManager {
	public List<Students> getStudents() throws Exception
	{
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Students> cq = cb.createQuery(Students.class);
		Root<Students> studentRoot = cq.from(Students.class); //Fetch all
		
		//cq.where(cb.lt(studentRoot.get("cgpa"), 9.0)); //Criteria
		cq.where(cb.le(studentRoot.get("cgpa"), 9.0));
		
		List<Students> slist = session.createQuery(cq).list();
		
		session.getTransaction().commit();
		session.close();
		factory.close();
		
		return slist;
	}
}
