package com.cybage;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int custId;
	private String custName;
	private String custPass;
	private String custConfPass;
	private String email;
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "emp_phone", joinColumns = @JoinColumn(referencedColumnName = "custId"))
	private List<String> phones;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int custId, String custName, String custPass, String custConfPass, String email,
			List<String> phones) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custPass = custPass;
		this.custConfPass = custConfPass;
		this.email = email;
		this.phones = phones;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustPass() {
		return custPass;
	}

	public void setCustPass(String custPass) {
		this.custPass = custPass;
	}

	public String getCustConfPass() {
		return custConfPass;
	}

	public void setCustConfPass(String custConfPass) {
		this.custConfPass = custConfPass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custPass=" + custPass + ", custConfPass="
				+ custConfPass + ", email=" + email + ", phones=" + phones + "]";
	}

	
}
