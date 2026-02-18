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
			
			// Create User entity class object
			Users user = new Users();
			
			// Begin Transaction
			session.beginTransaction();
			
			// Perform Operation [delete() is no longer supported]
			user = session.find(Users.class, 3);
			System.out.println("Before deletion: "+user);
			session.remove(user);
			
			// Commit Transaction
			session.getTransaction().commit();
			System.out.println("User deleted!!!");
		}
}
