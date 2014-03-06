package com.hibernate;

public class ProduitsPrix {
	
	private int codePdt;
	private String nomPdt;
	private String desc;
	private long prixPdt;
	
	//getters and setters
	public int getCodePdt() {
		return codePdt;
	}
	public ProduitsPrix() {
		super();
	}
	public void setCodePdt(int codePdt) {
		this.codePdt = codePdt;
	}
	public String getNomPdt() {
		return nomPdt;
	}
	public void setNomPdt(String nomPdt) {
		this.nomPdt = nomPdt;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public long getPrixPdt() {
		return prixPdt;
	}
	public void setPrixPdt(long prixPdt) {
		this.prixPdt = prixPdt;
	}

}
