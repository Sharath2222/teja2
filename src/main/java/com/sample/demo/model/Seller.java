package com.sample.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Seller")
public class Seller {
	
	@Id
    @Column(name="sellid")
    private Integer sellId;
    
    @Column(name="sellname")
    private String sellName;
    
    @Column(name="phone1")
    private String phone1;
    
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

    @Column(name="licenceid")
    private String licenceId;
    
    @Column(name="gstno")
    private String gstNo;

	public Integer getSellId() {
		return sellId;
	}

	public void setSellId(Integer sellId) {
		this.sellId = sellId;
	}

	public String getSellName() {
		return sellName;
	}

	public void setSellName(String sellName) {
		this.sellName = sellName;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
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

	public String getLicenceId() {
		return licenceId;
	}

	public void setLicenceId(String licenceId) {
		this.licenceId = licenceId;
	}

	public String getGstNo() {
		return gstNo;
	}

	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}

	public Seller()
	{
		
	}
	
	public Seller(Integer sellId, String sellName, String phone1, String email, String address, String state,
			String country, String district, String username, String pass, String licenceId, String gstNo) {
		super();
		this.sellId = sellId;
		this.sellName = sellName;
		this.phone1 = phone1;
		this.email = email;
		this.address = address;
		this.state = state;
		this.country = country;
		this.district = district;
		this.username = username;
		this.pass = pass;
		this.licenceId = licenceId;
		this.gstNo = gstNo;
	}

	@Override
	public String toString() {
		return "Seller [sellId=" + sellId + ", sellName=" + sellName + ", phone1=" + phone1 + ", email=" + email
				+ ", address=" + address + ", state=" + state + ", country=" + country + ", district=" + district
				+ ", username=" + username + ", pass=" + pass + ", licenceId=" + licenceId + ", gstNo=" + gstNo + "]";
	}
    
    

	

}
