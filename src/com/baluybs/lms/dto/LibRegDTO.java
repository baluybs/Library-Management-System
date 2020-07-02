package com.baluybs.lms.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "LibraryRegister")
public class LibRegDTO implements Serializable{
	@Id
	@GenericGenerator(name = "l_auto",strategy = "increment")
	@GeneratedValue(generator = "l_auto")
	@Column(name = "id")
	private Long id;
	@Column(name = "Name")
	private String name;
	@Column(name = "Email")
	private String email;
	@Column(name = "Password")
	private String password;
	@Column(name = "City")
	private String city;
	@Column(name = "Contact_Number")
	private Long number;
	@Column(name = "Departement")
	private String department;
	public LibRegDTO() {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "LibRegDTO [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", city="
				+ city + ", number=" + number + ", department=" + department + "]";
	}
	
}
