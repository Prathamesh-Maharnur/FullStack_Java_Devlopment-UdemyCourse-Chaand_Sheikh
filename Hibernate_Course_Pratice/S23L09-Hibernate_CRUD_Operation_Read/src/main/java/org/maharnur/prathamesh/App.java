package org.maharnur.prathamesh;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
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
				
				// Create entity class object
				Users user = new Users();
				
				// Begin transaction
				session.beginTransaction();
				
				//Perform Operation [get() is now deprecated]
				user = session.find(Users.class,1);
				
				// Commit the Transaction
				session.getTransaction().commit();
				
				System.out.println(user);
			}finally {
				session.close();
				factory.close();
			}
	}
}
