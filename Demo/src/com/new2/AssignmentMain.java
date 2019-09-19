package com.new2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class AssignmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Demo1");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		
//		Assignment s1 = new Assignment(1,"Dare to Do","2018-10-03","Kiren Bedi",1);
//		Assignment s2 = new Assignment(2,"Go Set a Watchman","2018-10-03","Harper Lee",3);
//		Assignment s3 = new Assignment(3,"One Life is Not Enough","2018-10-03","Natwar Singh",2);
//		Assignment s4 = new Assignment(4,"One Indian Girl","2018-10-03","Cheten Bhagat",2);
//		Assignment s5 = new Assignment(5,"Mrs.Funnybones","2018-10-03","Twinkle Khanna",1);
//		
		Assignment st=em.find(Assignment.class, 3);
		st.setEdition(9);
		
		em.remove(st);
		
		
//		em.persist(s1);
//		em.persist(s2);
//		em.persist(s3);
//		em.persist(s4);
//		em.persist(s5);
//		
		et.commit();
		em.close();
		emf.close();

	}

}
