package com.globallogic.creditcardpayment.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payment")
public class Payment {
	@Id                                                      
	@GeneratedValue(strategy = GenerationType.IDENTITY)      
	@Column(name="paymentid")                                       
	long paymentid;   
	@Column(name="method")
	String method;
	@Column(name="amountDue")
	double amountDue;
	public Payment(long paymentid, String method, double amountDue) {
		super();
		this.paymentid = paymentid;
		this.method = method;
		this.amountDue = amountDue;
	}
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getPaymentid() {
		return paymentid;
	}
	public void setPaymentid(long paymentid) {
		this.paymentid = paymentid;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public double getAmountDue() {
		return amountDue;
	}
	public void setAmountDue(double amountDue) {
		this.amountDue = amountDue;
	}
	@Override
	public String toString() {
		return "Payment [paymentid=" + paymentid + ", method=" + method + ", amountDue=" + amountDue + "]";
	}
	
}