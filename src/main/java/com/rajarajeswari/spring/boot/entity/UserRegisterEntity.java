package com.rajarajeswari.spring.boot.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "register")
public class UserRegisterEntity {

	@Id
	private String email;
	private String password;
	private String name;
	private long phonenumber;
	private String address;

	public UserRegisterEntity() {

	}

	public UserRegisterEntity(String email, String password, String name, long phonenumber, String address) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.phonenumber = phonenumber;
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserRegisterEntity [email=" + email + ", password=" + password + ", name=" + name + ", phonenumber="
				+ phonenumber + ", address=" + address + "]";
	}

	
	

}
