package com.baluybs.lms.dto;
import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Book")
public class BookDTO implements Serializable{
	@Id
	@GenericGenerator(name = "b_id",strategy = "increment")
	@GeneratedValue(generator = "b_id")
	@Column(name = "Book_Id")
	private long id;
	@Column(name = "Student_Id")
	private String studentid;
	@Column(name = "Book_Name")
	private String bookname;
	@Column(name = "Book_Author")
	private String author;
	@Column(name = "Book_Number")
	private long number;
	@ManyToMany
	@JoinTable(name = "Book_student",joinColumns= {@JoinColumn(name = "Book_Id")},inverseJoinColumns= {@JoinColumn(name = "id")})
	private List<StudentRegisterDTO> dto;
	public BookDTO() {
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public List<StudentRegisterDTO> getDto() {
		return dto;
	}
	public void setDto(List<StudentRegisterDTO> dto) {
		this.dto = dto;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", bookname=" + bookname + ", author=" + author
				+ ", number=" + number + ", dto=" + dto + "]";
	}
	
}