package com.example.kishore.entity;


import java.util.ArrayList;
import java.util.List;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer {
      
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
	private String firstname;
	private String lastname;
	
	
	private String address;
	
	private String contact;
	private String email;
	
	private String gender;
	
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(Long id, String firstname, String lastname, String address, String contact, String email,
			String gender, List<Orders> orders, List<Cartitem> cart, String cartItems, String username,
			String password) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.contact = contact;
		this.email = email;
		this.gender = gender;
		this.orders = orders;
		this.cart = cart;
		this.cartItems = cartItems;
		this.username = username;
		this.password = password;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	public List<Cartitem> getCart() {
		return cart;
	}
	public void setCart(List<Cartitem> cart) {
		this.cart = cart;
	}
	public String getCartItems() {
		return cartItems;
	}
	public void setCartItems(String cartItems) {
		this.cartItems = cartItems;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", address=" + address
				+ ", contact=" + contact + ", email=" + email + ", gender=" + gender + ", orders=" + orders + ", cart="
				+ cart + ", cartItems=" + cartItems + ", username=" + username + ", password=" + password + "]";
	}


	@OneToMany(mappedBy = "customer" ,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Orders> orders = new ArrayList<>();
	
	@OneToMany(mappedBy="customer",fetch=FetchType.LAZY)
	private List<Cartitem> cart = new ArrayList<>();
	private String cartItems;
	
	private String username;
	private String password;
	
	}
