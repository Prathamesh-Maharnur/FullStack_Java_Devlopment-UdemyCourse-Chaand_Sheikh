package org.maharnur.prathamesh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.maharnur.prathamesh.entity.Users;

public class App {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
											.configure("hibernate.cfg.xml")
											.addAnnotatedClass(Users.class)
											.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			// Create object of entity class type
			Users user = new Users("Pratham", "pass@123", "Prathamesh", "Maharnur");
			
			// Start transaction
			session.beginTransaction();
			
			// perform operation [save() is deprecated]
			session.persist(user);
			
			// Commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Row added!");
			
		}finally {
			session.close();
			factory.close();
		}

	}

}
