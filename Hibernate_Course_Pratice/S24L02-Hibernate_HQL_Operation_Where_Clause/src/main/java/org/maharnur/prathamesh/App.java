package org.maharnur.prathamesh;

import java.util.List;

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
			session.beginTransaction();
			
			List<Users> list = session.createQuery("from users where username='Pratham' OR"
					+ " password LIKE '%123' ", Users.class).getResultList();
			
			for(Users user: list) {
				System.out.println(user);
			}
			
		}finally {
			session.close();
			factory.close();
		}
	}

}
