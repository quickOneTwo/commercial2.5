package com.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CmdService {
	
	public void ajouter(Commandes cmd){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(cmd);
	
		tx.commit();
		session.close();
		
	}
}
// application web service 
// pas d'organisation de code DAO Service'
// il ya pas beaucoup de class donc c'est pas suffisament'