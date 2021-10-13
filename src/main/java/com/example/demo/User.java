package com.example.demo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.sun.istack.NotNull;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Integer age;
	
	@NotNull
	String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	Address address;
	
//	@OneToMany(cascade = CascadeType.ALL)
//	Set<Address> addresses;
//	
//	public Set<Address> getAddresses() {
//		return addresses;
//	}
//
//	public void setAddresses(Set<Address> addresses) {
//		this.addresses = addresses;
//	}
	
	
	public Integer getId() {
		return id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		

}
