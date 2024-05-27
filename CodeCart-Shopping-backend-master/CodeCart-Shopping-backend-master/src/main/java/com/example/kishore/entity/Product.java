package com.example.kishore.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties({"handler","productOrders"})
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String features;
	private Integer price;
	private Integer count;
	private String image;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Product(Long id, String name, String features, Integer price, Integer count, String image,
			List<Orders> productOrders) {
		super();
		this.id = id;
		this.name = name;
		this.features = features;
		this.price = price;
		this.count = count;
		this.image = image;
		this.productOrders = productOrders;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getFeatures() {
		return features;
	}


	public void setFeatures(String features) {
		this.features = features;
	}


	public Integer getPrice() {
		return price;
	}


	public void setPrice(Integer price) {
		this.price = price;
	}


	public Integer getCount() {
		return count;
	}


	public void setCount(Integer count) {
		this.count = count;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public List<Orders> getProductOrders() {
		return productOrders;
	}


	public void setProductOrders(List<Orders> productOrders) {
		this.productOrders = productOrders;
	}
	
	


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", features=" + features + ", price=" + price + ", count="
				+ count + ", image=" + image + ", productOrders=" + productOrders + "]";
	}




	@OneToMany(mappedBy="product",cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Orders> productOrders = new ArrayList<>();
}
