package com.globallogic.creditcardpayment.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "statement")
public class Statement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="statementid")
	long statementid;
	@Column(name="dueAmount")
    double dueAmount;
	@Column(name="billingDate")
	Date billingDate;
	@Column(name="dueDate")
	Date dueDate;
	public Statement(long statementid, double dueAmount, Date billingDate, Date dueDate) {
		super();
		this.statementid = statementid;
		this.dueAmount = dueAmount;
		this.billingDate = billingDate;
		this.dueDate = dueDate;
	}
	public Statement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getStatementid() {
		return statementid;
	}
	public void setStatementid(long statementid) {
		this.statementid = statementid;
	}
	public double getDueAmount() {
		return dueAmount;
	}
	public void setDueAmount(double dueAmount) {
		this.dueAmount = dueAmount;
	}
	public Date getBillingDate() {
		return billingDate;
	}
	public void setBillingDate(Date billingDate) {
		this.billingDate = billingDate;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	@Override
	public String toString() {
		return "Statement [statementid=" + statementid + ", dueAmount=" + dueAmount + ", billingDate=" + billingDate
				+ ", dueDate=" + dueDate + "]";
	}
	
}