package com.theKiranAkademy.hms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.theKiranAkademy.hms.entitey.CleaningStaff;
import com.theKiranAkademy.hms.service.CleaningStaffService;


@RestController
public class CleaningStaffController {
	@Autowired
	CleaningStaffService cs;
	
	@GetMapping("getcleaning")
	public List<CleaningStaff> getAllCleaningStaff() {
		return cs.getAllCleaningStaff();
	}
	@PostMapping("cleaningstaff")
	public String insertCleaningStaff(@RequestBody CleaningStaff cleaningstaff ) {
		return cs.insertCleaningStaff(cleaningstaff);
	}
	@PutMapping("saveupdate")
	public String save_updateCleaningStaff(@RequestBody CleaningStaff cleaningstaff) {
		return cs.save_updateCleaningStaff(cleaningstaff);
	}
	@GetMapping("salaryname")
	public List<CleaningStaff> getCleaningStaffNameIs_5Letter_SalaryGreterThan13k() {
		return cs.getCleaningStaffNameIs_5Letter_SalaryGreterThan13k();
	}
	@DeleteMapping("deletecleaning")
	public String deleteCleaningStaff(@RequestBody Integer id) {
		return cs.deleteCleaningStaff(id);
	}
	@GetMapping("age24_branchstartB")
	public List<CleaningStaff> getCleaningStaffAgeIsGreterThan_24BranchNameStartWith_B() {
		return cs.getCleaningStaffAgeIsGreterThan_24BranchNameStartWith_B();
	}
	@GetMapping("genralward")
	public List<CleaningStaff> getCleaningStaffworkGenralWard() {
		return cs.getCleaningStaffworkGenralWard();
	}
	@GetMapping("countdistinct")
	public List<CleaningStaff> countDistinctWork(){
		return cs.countDistinctWork();
	}
	@GetMapping("countname")
	public List<CleaningStaff> countFristName() {
		return cs.countFristName();
	}
	@GetMapping("row1_5")
	public List<CleaningStaff> getCleainingStaffId_1_5() {
		return cs.getCleainingStaffId_1_5();
	}
	@GetMapping("buldhana")
	public List<CleaningStaff> getAllStaffCleaningBranchBuldhana() {
		return cs.getAllStaffCleaningBranchBuldhana();
	}
	@GetMapping("cleaningsa")
	public List<CleaningStaff> getCleaningStaffWorkNameStartWith_c_endWith_u_salaryGreterThan15k() {
		return cs.getCleaningStaffWorkNameStartWith_c_endWith_u_salaryGreterThan15k();
	}
	@GetMapping("pune")
	public List<CleaningStaff> getAllCleaningStaffBranchNamePune() {
		return cs.getAllCleaningStaffBranchNamePune();
	}
	@GetMapping("salaryless15k")
	public List<CleaningStaff> getCleaningStaffSalaryLessThanEqule15k() {
		return cs.getCleaningStaffSalaryLessThanEqule15k();
	}
	@GetMapping("age23cleaninggenralward")
	public List<CleaningStaff> getCleaningStaffAgeGreterThan_23_work_cleaningGenralward() {
		return cs.getCleaningStaffAgeGreterThan_23_work_cleaningGenralward();
	}
	@GetMapping("lastnamestart_m")
	public List<CleaningStaff> getAllCleaningStaffLastNameStartWith_M() {
		return cs.getAllCleaningStaffLastNameStartWith_M();
	}
	@GetMapping("lastnamest_j_end_o")
	public List<CleaningStaff> getCleaningStaffLastNameEndWith_o_startWithJ() {
		return cs.getCleaningStaffLastNameEndWith_o_startWithJ();
	}
	@GetMapping("countrow")
	public List<CleaningStaff> CleaningStaffCountRow() {
		return cs.CleaningStaffCountRow();
	}
	@GetMapping("avgsalarycleaning")
	public List<CleaningStaff> getCleaningStaffAvgSalary() {
		return cs.getCleaningStaffAvgSalary();
	}
	@GetMapping("cleaningmaxsalary")
	public List<CleaningStaff> getCleaningStaffMaxSalary() {
		return cs.getCleaningStaffMaxSalary();
	}
	@GetMapping("agemin")
	public List<CleaningStaff> getCleaningStaffMinAge() {
		return cs.getCleaningStaffMinAge();
	}
	@GetMapping("row1_6")
	public List<CleaningStaff> getCleaningStaffRow1_6() {
		return cs.getCleaningStaffRow1_6();
	} 
	@GetMapping("5letter")
	public List<CleaningStaff> getAllCleaningStaffFristNameLetterIs5() {
		return cs.getAllCleaningStaffFristNameLetterIs5();
	}
	@GetMapping("staff-age22-mumbai")
	public List<CleaningStaff> getCleaningStaffBranchMumbaiSalaryGreterThan15kAgeGretethanEquleTo22() {
		return cs.getCleaningStaffBranchMumbaiSalaryGreterThan15kAgeGretethanEquleTo22();
	}
	@GetMapping("fristname_s")
	public List<CleaningStaff> getAllCleaningStaffFristNameStartWith_S() {
		return cs.getAllCleaningStaffFristNameStartWith_S();
	}
	

}
