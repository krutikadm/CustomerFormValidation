package com.krutika;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.customer.pojo.CustomerForm;




public class RetriveTest {

	public static void main(String[] args) {
		 Configuration cfg = new Configuration();
	        System.out.println(cfg.getProperty("hibernate.connection.driver_class"));
	        cfg.configure("com\\krutika\\cfg\\hibernate.cfg.xml");
	        System.out.println(cfg.getProperty("hibernate.connection.driver_class"));
	        
	        SessionFactory factory = cfg.buildSessionFactory();
	        
	        Session ses = factory.openSession();
	        Transaction tx = ses.beginTransaction();
	        
	        Query query = ses.createQuery("from CustomerForm where customer_ID=222");
	        List<CustomerForm>cForm=query.getResultList();
	        cForm.stream().forEach(s -> System.out.println(s.getCustomer_ID()
	        		+"\t"+s.getCustomer_name()+"\t"+s.getCustomer_add()+"\t"
	        		+s.getCustomer_status()));
	}

}
