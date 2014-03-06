package com.hibernate;

import java.util.Date;

public class Commandes {
	
	private int codeTsCmd;
	private int codeCmd;
	private int codePdt;
	private int qtCmd;
	private String client;
	private Date dateCmd;
	

	
	
	public int getCodeTsCmd() {
		return codeTsCmd;
	}
	public void setCodeTsCmd(int codeTsCmd) {
		this.codeTsCmd = codeTsCmd;
	}
	public int getCodeCmd() {
		return codeCmd;
	}
	public void setCodeCmd(int codeCmd) {
		this.codeCmd = codeCmd;
	}
	public int getCodePdt() {
		return codePdt;
	}
	public void setCodePdt(int codePdt) {
		this.codePdt = codePdt;
	}
	public int getQtCmd() {
		return qtCmd;
	}
	public void setQtCmd(int qtCmd) {
		this.qtCmd = qtCmd;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	
	public Date getDateCmd() {
		return dateCmd;
	}
	public void setDateCmd(Date dateCmd) {
		this.dateCmd = dateCmd;
	}
	

}
