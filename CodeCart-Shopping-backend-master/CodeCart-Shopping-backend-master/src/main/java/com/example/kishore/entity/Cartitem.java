package com.example.kishore.entity;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonIgnoreProperties({"handler","customer"})
public class Cartitem {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Long id;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="productid")
	private Product product;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customerid")
	private Customer customer;
	
	private int count;
	
	

	public Cartitem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Cartitem(Long id, Product product, Customer customer, int count) {
		super();
		this.id = id;
		this.product = product;
		this.customer = customer;
		this.count = count;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}



	@Override
	public String toString() {
		return "Cartitem [id=" + id + ", product=" + product + ", customer=" + customer + ", count=" + count + "]";
	}
	
	
	
	
	
}
