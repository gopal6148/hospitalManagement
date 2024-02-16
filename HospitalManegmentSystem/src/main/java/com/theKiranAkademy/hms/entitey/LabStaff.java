package com.theKiranAkademy.hms.entitey;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LabStaff {
	private int id;
	private String fristName;
	private String lastName;
	private int age;
	private String degree;
	private double salary;
	private String experience;
	private String branchName;
	
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	@Override
	public String toString() {
		return "LabStaff [id=" + id + ", fristName=" + fristName + ", lastName=" + lastName + ", age=" + age
				+ ", degree=" + degree + ", salary=" + salary + ", experience=" + experience + ", branchName="
				+ branchName + "]";
	}
	

}
