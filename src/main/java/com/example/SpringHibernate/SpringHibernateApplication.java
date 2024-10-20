package com.example.SpringHibernate;

import com.example.SpringHibernate.Entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringHibernateApplication {

	public static void main(String[] args) {


		User user=new User("Sidd","siddheshwar@gmail.com","password","male","Pune" );


		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");

		//C:\Projects\Spring\SpringHibernate\src\main\resources\hibernate.cfg.xml

		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();




		session.save(user);
		transaction.commit();

		session.close();
		sessionFactory.close();
		SpringApplication.run(SpringHibernateApplication.class, args);

	}

}
