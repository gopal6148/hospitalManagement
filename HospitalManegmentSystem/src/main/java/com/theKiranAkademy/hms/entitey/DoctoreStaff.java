package com.theKiranAkademy.hms.entitey;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DoctoreStaff {
	private int staffId;
	private String staffName;
	private String staffLastName;
	private String staffDegree;
	private String staffSalary;
	private String staffExperience;
	private String staffBranch;
	@Id
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getStaffLastName() {
		return staffLastName;
	}
	public void setStaffLastName(String staffLastName) {
		this.staffLastName = staffLastName;
	}
	public String getStaffDegree() {
		return staffDegree;
	}
	public void setStaffDegree(String staffDegree) {
		this.staffDegree = staffDegree;
	}
	public String getStaffSalary() {
		return staffSalary;
	}
	public void setStaffSalary(String staffSalary) {
		this.staffSalary = staffSalary;
	}
	public String getStaffExperience() {
		return staffExperience;
	}
	public void setStaffExperience(String staffExperience) {
		this.staffExperience = staffExperience;
	}
	public String getStaffBranch() {
		return staffBranch;
	}
	public void setStaffBranch(String staffBranch) {
		this.staffBranch = staffBranch;
	}
	@Override
	public String toString() {
		return "DoctoreStaff [staffId=" + staffId + ", staffName=" + staffName + ", staffLastName=" + staffLastName
				+ ", staffDegree=" + staffDegree + ", staffSalary=" + staffSalary + ", staffExperience="
				+ staffExperience + ", staffBranch=" + staffBranch + "]";
	}
	

}
