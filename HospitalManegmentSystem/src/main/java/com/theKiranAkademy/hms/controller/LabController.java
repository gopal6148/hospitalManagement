package com.theKiranAkademy.hms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.theKiranAkademy.hms.entitey.LabStaff;
import com.theKiranAkademy.hms.service.LabService;

@RestController
public class LabController {
	
	@Autowired
	LabService ls;
	
	@GetMapping("labstaff")
	public List<LabStaff> getAllLabStaff() {
		return ls.getAllLabStaff();
	}
	@PostMapping("labstaff")
	public String insertLabStaff(@RequestBody LabStaff labStaff) {
		return ls.insertLabStaff(labStaff); 
	}
	@PutMapping("labstaff")
	public String updateLabStaff(@RequestBody LabStaff labStaff) {
		return ls.updateLabStaff(labStaff);
	}
	@GetMapping("salary20kfristnameS")
	public List<LabStaff> getLabStaffFristNameStartWith_S_salaryIs20k() {
		return ls.getLabStaffFristNameStartWith_S_salaryIs20k();
	}

}
