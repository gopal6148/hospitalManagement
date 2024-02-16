package com.theKiranAkademy.hms.entitey;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NursingStaff {
	private int id;
	private String firstName;
	private String lastName;
	private String age;
	private String salary;
	private String work;
	private String experience;
	private String degree;
	private String brancheName;
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getBrancheName() {
		return brancheName;
	}
	public void setBrancheName(String brancheName) {
		this.brancheName = brancheName;
	}
	@Override
	public String toString() {
		return "NursingStaff [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", salary=" + salary + ", work=" + work + ", experience=" + experience + ", degree=" + degree
				+ ", brancheName=" + brancheName + "]";
	}
	

}
