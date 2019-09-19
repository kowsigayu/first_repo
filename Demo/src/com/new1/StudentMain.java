package com.new1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Demo");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
//		
//		Student s1 = new Student(1,"raja",98);
//		Student s2 = new Student(2,"ramesh",6);
//		Student s3 = new Student(3,"ravi",95);
//		Student s4 = new Student(4,"mano",55);
//		Student s5 = new Student(5,"susi",70);
		
		Student st=em.find(Student.class, 3);
		
//		System.out.println("Before Updation");
//		System.out.println("Student_roll_no=" + s4.getRoll_no());
//		System.out.println("Student_name" +s4.getName());
//		System.out.println("Student_mark" + s4.getMark());
//		
		//st.setMark(99);
		
//		System.out.println("After Updation");
//		System.out.println("Student_roll_no=" + s4.getRoll_no());
//		System.out.println("Student_name" +s4.getName());
//		System.out.println("Student_mark" + s4.getMark());
//		
		em.remove(st);
		
//		em.persist(s1);
//		em.persist(s2);
//		em.persist(s3);
//		em.persist(s4);
//		em.persist(s5);
		
		et.commit();
		em.close();
		emf.close();
	}

}
