package com.baluybs.lms.dto;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "studentregister")
public class StudentRegisterDTO implements Serializable{
	@Id
	@GenericGenerator(name = "s_auto",strategy = "com.baluybs.lms.utils.CustomIdGenarator")
	@GeneratedValue(generator = "s_auto")
	@Column(name="id")
	private String id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="number")
	private long number;
	
	@Column(name="department")
	private String department;
	
	@Column(name="city")
	private String city;
	
	public StudentRegisterDTO() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
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
		return "StudentRegisterDTO [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", number=" + number + ", department=" + department + ", city=" + city + "]";
	}
	
}