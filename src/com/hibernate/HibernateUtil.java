package com.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {
	
	private static final SessionFactory sessionFactory;
	
	static{
		try{
			sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
			
		} catch (HibernateException ex){
			System.out.println("initil creation sessionfactory failed"+ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
}