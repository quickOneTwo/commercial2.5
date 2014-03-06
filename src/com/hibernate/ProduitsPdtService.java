package com.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProduitsPdtService {
	
	public List<ProduitsPrix> listAll(){
		List<ProduitsPrix> listProduitsPrixs;
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		listProduitsPrixs = session.createQuery("from ProduitsPrix").list();
		
		tx.commit();
		session.close();
		
		return listProduitsPrixs;
	}
	
	public void ajouterPdtPrix(ProduitsPrix pdtPrix){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(pdtPrix);
		
		tx.commit();
		session.close();
	}
}
