package com.soft.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="family_details")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String surname;
	private String fathername;
	private String mothername;
	private String brothername;
	private int howmanychild;
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", surname=" + surname + ", fathername=" + fathername
				+ ", mothername=" + mothername + ", brothername=" + brothername + ", howmanychild=" + howmanychild
				+ "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	public String getBrothername() {
		return brothername;
	}
	public void setBrothername(String brothername) {
		this.brothername = brothername;
	}
	public int getHowmanychild() {
		return howmanychild;
	}
	public void setHowmanychild(int howmanychild) {
		this.howmanychild = howmanychild;
	}
	public User(int id, String name, String surname, String fathername, String mothername, String brothername,
			int howmanychild) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.fathername = fathername;
		this.mothername = mothername;
		this.brothername = brothername;
		this.howmanychild = howmanychild;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
}