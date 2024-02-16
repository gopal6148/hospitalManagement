package com.theKiranAkademy.hms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theKiranAkademy.hms.dao.LabDao;
import com.theKiranAkademy.hms.entitey.LabStaff;

@Service
public class LabService {
	
	@Autowired
	LabDao ld;
	
	public List<LabStaff> getAllLabStaff() {
		return ld.getAllLabStaff();
		
	}

	public String insertLabStaff(LabStaff labStaff) {
		return ld.insertLabStaff(labStaff) ;
		
	}

	public String updateLabStaff(LabStaff labStaff) {
		return ld.updateLabStaff(labStaff);
		
	}
	public List<LabStaff> getLabStaffFristNameStartWith_S_salaryIs20k() {
		List<LabStaff> list = ld.getLabStaffFristNameStartWith_S_salaryIs20k();
		List<LabStaff> al = new ArrayList<>();
		for (LabStaff labStaff : list) {
			if(labStaff.getSalary() == 20000) {
			al.add(labStaff);
			}
		}
		return al;
	}

}
