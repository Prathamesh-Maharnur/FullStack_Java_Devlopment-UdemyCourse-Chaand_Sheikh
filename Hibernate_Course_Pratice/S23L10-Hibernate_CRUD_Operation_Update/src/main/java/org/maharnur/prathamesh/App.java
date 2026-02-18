package org.maharnur.prathamesh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.maharnur.prathamesh.entity.Users;

public class App {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Users.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			// Create entity class object
			Users user = new Users();

			// Begin transaction
			session.beginTransaction();

			// Perform Transaction
			user = session.find(Users.class, 1);
			System.out.println("Before updation: " + user);
			user.setPassword("prasad@123");

			// Commit Transaction
			session.getTransaction().commit();
			System.out.println("After updation: " + user);
		} finally {
			session.close();
			factory.close();
		}
	}
}
