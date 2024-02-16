package com.theKiranAkademy.hms.entitey;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CleaningStaff {
	private int id;
	private String fristName;
	private String lastName;
	private int age;
	private String work;
	private String salary;
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
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	@Override
	public String toString() {
		return "CleaningStaff [id=" + id + ", fristName=" + fristName + ", lastName=" + lastName + ", age=" + age
				+ ", work=" + work + ", salary=" + salary + ", branchName=" + branchName + "]";
	}
	

}
