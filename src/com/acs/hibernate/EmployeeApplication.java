package com.acs.hibernate;



import org.hibernate.cfg.Configuration;




public class EmployeeApplication {

	public static void main(String[] args) {
	System.out.println("running");
	Configuration cfg= new Configuration();
	System.out.println(cfg);
	cfg.configure();
	org.hibernate.SessionFactory sf=cfg.buildSessionFactory();
	org.hibernate.Session session=sf.openSession();
	org.hibernate.Transaction tx=session.beginTransaction();
	Employee emp=new Employee();
	emp.setId(1);
	emp.setName("abhishek");
    emp.setMarks(101);
    session.save(emp);
    tx.commit();
    session.clear();
    sf.close();
	
	}

}
