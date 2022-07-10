package com.sample.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product {
	
	@Id
    @Column(name="proid")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Integer proId;
    
    @Column(name="price")
    private double price;
    
    @Column(name="title")
    private String title;
    
    @Column(name="specification")
    private String specification;
    
    public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getAvailableqty() {
		return availableqty;
	}

	public void setAvailableqty(int availableqty) {
		this.availableqty = availableqty;
	}

	@Column(name="availableqty")
    private int availableqty;
    
    @Column(name="totalqty")
    private int totalQty;
    
    @Column(name="sellid")
    private int sellid;

	public Integer getProId() {
		return proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public int getAvailableQty() {
		return availableqty;
	}

	public void setAvailableQty(int availability) {
		this.availableqty = availability;
	}

	public int getTotalQty() {
		return totalQty;
	}

	public void setTotalQty(int totalQty) {
		this.totalQty = totalQty;
	}

	public int getSellid() {
		return sellid;
	}

	public void setSellid(int sellid) {
		this.sellid = sellid;
	}

	public Product()
	{
		
	}
	

	@Override
	public String toString() {
		return "Product [proId=" + proId + ", price=" + price + ", specification=" + specification + ", availability="
				+availableqty + ", totalQty=" + totalQty + ", sellid=" + sellid + "]";
	}

	public Product(Integer proId, double price, String title, String specification, int availableqty, int totalQty,
			int sellid) {
		this.proId = proId;
		this.price = price;
		this.title = title;
		this.specification = specification;
		this.availableqty = availableqty;
		this.totalQty = totalQty;
		this.sellid = sellid;
	}
	
	
    
    

}
