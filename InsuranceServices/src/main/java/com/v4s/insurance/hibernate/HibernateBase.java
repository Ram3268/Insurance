package com.v4s.insurance.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateBase {
	
	protected static SessionFactory sessionFactory = null;
	
	public static void buildSessionFactory() {
	    Configuration configuration = new Configuration().configure();
	    
	    StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
	            .applySettings(configuration.getProperties());
	    
	    sessionFactory = configuration.buildSessionFactory(builder.build());
	}
	
	public static SessionFactory getSessionFactoryObj() {
		return sessionFactory;
	}
	
	public HibernateBase() {
		buildSessionFactory();
	}
	

}









