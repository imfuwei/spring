package com.zfw.beans;

public class Account {
	@Override
	public String toString() {
		return "Account [aid=" + aid + ", aname=" + aname + ", balance="
				+ balance + "]";
	}
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	private Integer aid;
	private String aname;
	private double balance;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(String aname, double balance) {
		super();
		this.aname = aname;
		this.balance = balance;
	}
	
}
