package com.customer.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMERFORM")

public class CustomerForm {
	
	@Id
	@Column(name="CUSTOMER_ID")
	private int customer_ID;
	
	@Column(name="CUSTOMER_NAME")
	private String customer_name;
	
	@Column(name="CUSTOMER_ADD")
	private String customer_add;
	
	@Column(name="CUSTOMER_STATUS")
	private String customer_status;
	
	public int getCustomer_ID() {
		return customer_ID;
	}
	public void setCustomer_ID(int customer_ID) {
		this.customer_ID = customer_ID;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_add() {
		return customer_add;
	}
	public void setCustomer_add(String customer_add) {
		this.customer_add = customer_add;
	}
	public String getCustomer_status() {
		return customer_status;
	}
	public void setCustomer_status(String customer_status) {
		this.customer_status = customer_status;
	}
	public CustomerForm(int customer_ID, String customer_name, String customer_add, String customer_status) {
		super();
		this.customer_ID = customer_ID;
		this.customer_name = customer_name;
		this.customer_add = customer_add;
		this.customer_status = customer_status;
	}
	public CustomerForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
