package com.krutika;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.customer.pojo.CustomerForm;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        System.out.println(cfg.getProperty("hibernate.connection.driver_class"));
        cfg.configure("com\\krutika\\cfg\\hibernate.cfg.xml");
        System.out.println(cfg.getProperty("hibernate.connection.driver_class"));
        
        SessionFactory factory = cfg.buildSessionFactory();
        
        Session ses = factory.openSession();
        Transaction tx = ses.beginTransaction();
        
        /*CustomerForm customer= new CustomerForm();
        customer.setCustomer_ID(666);
        customer.setCustomer_name("Lukas");
        customer.setCustomer_add("MEXICO");
        customer.setCustomer_status("complete");
        
        ses.persist(customer);
        tx.commit();*/
        
        //Using HQL commands:
        
        Query query = ses.createQuery("from CustomerForm");
        List<CustomerForm>records = query.getResultList();
        
        //using java 8 features:
        
        
        records.stream().forEach(s-> System.out.println(s.getCustomer_ID()+"\t"+s.getCustomer_name()+"\t"+s.getCustomer_add()
    			+"\t"+s.getCustomer_status()));
        /*for(CustomerForm customerRecords:records) {
        	System.out.println(customerRecords.getCustomer_ID()+"\t"
        			+customerRecords.getCustomer_name()+"\t"+customerRecords.getCustomer_add()
        			+"\t"+customerRecords.getCustomer_status());
        }*/
        
    }
}
