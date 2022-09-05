package com.globallogic.creditcardpayment.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transaction")
public class Transaction {

	@Id                                                  
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	@Column(name="id")                                   
	long transid;
	@Column(name="cardNumber")
	String cardNumber;
	@Column(name="tranDate")
	Date tranDate;
	@Column(name="status")
	String status;
	@Column(name="amount")
	double amount;
	@Column(name="paymentMethod")
	String paymentMethod;
	@Column(name="description")
	String description;
	public Transaction(long transid, String cardNumber, Date tranDate, String status, double amount,
			String paymentMethod, String description) {
		super();
		this.transid = transid;
		this.cardNumber = cardNumber;
		this.tranDate = tranDate;
		this.status = status;
		this.amount = amount;
		this.paymentMethod = paymentMethod;
		this.description = description;
	}
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getTransid() {
		return transid;
	}
	public void setTransid(long transid) {
		this.transid = transid;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public Date getTranDate() {
		return tranDate;
	}
	public void setTranDate(Date tranDate) {
		this.tranDate = tranDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Transaction [transid=" + transid + ", cardNumber=" + cardNumber + ", tranDate=" + tranDate + ", status="
				+ status + ", amount=" + amount + ", paymentMethod=" + paymentMethod + ", description=" + description
				+ "]";
	}
	
}