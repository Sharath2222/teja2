package com.sample.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class Admin {
	
	@Id
    @Column(name="id")
    private Integer id;
    
    @Column(name="username")
    private String username;
    
    @Column(name="phone")
    private String phone;
    
    @Column(name="email")
    private String email;
    
    @Column(name="pass")
    private String pass;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	public Admin()
	{
		
	}

	public Admin(Integer id, String username, String phone, String email, String pass) {
		super();
		this.id = id;
		this.username = username;
		this.phone = phone;
		this.email = email;
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", username=" + username + ", phone=" + phone + ", email=" + email + ", pass=" + pass
				+ "]";
	}
    
    

}
