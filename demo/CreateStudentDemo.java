package com.serhatkaradag.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.serhatkaradag.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		
		try {
			
			System.out.println("Creating a new student object..");
			Student tempStudent = new Student("Paul","Wall","paul@hotmail.com");
			
			session.beginTransaction();
			
			System.out.println("Saving the student ...");
			session.save(tempStudent);
			
			session.getTransaction().commit();
			
			System.out.println("Done!");
			
		} 
		finally {
			factory.close();
		}
	}

}
