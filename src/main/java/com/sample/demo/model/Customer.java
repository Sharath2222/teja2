package com.sample.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
    @Column(name="custid")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	
    private Integer custId;
    
    @Column(name="cname")
    private String name;
    
    @Column(name="phone1")
    private String phone1;
    
    @Column(name="phone2")
    private String phone2;
    
    @Column(name="email")
    private String email;
    
    @Column(name="address")
    private String address;
    
    @Column(name="state")
    private String state;
    
    @Column(name="country")
    private String country;
    
    @Column(name="district")
    private String district;

    @Column(name="username")
    private String username;
    
    @Column(name="pass")
    private String pass;

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	
	public Customer()
	{
		
	}
	public Customer(Integer custId, String name, String phone1, String phone2, String email, String address,
			String state, String country, String district, String username, String pass) {
		super();
		this.custId = custId;
		this.name = name;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.email = email;
		this.address = address;
		this.state = state;
		this.country = country;
		this.district = district;
		this.username = username;
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", phone1=" + phone1 + ", phone2=" + phone2
				+ ", email=" + email + ", address=" + address + ", state=" + state + ", country=" + country
				+ ", district=" + district + ", username=" + username + ", pass=" + pass + "]";
	}
    
    

}
