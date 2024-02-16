package com.theKiranAkademy.hms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.theKiranAkademy.hms.entitey.DoctoreStaff;
import com.theKiranAkademy.hms.service.DoctoreService;
@CrossOrigin
@RestController
public class DoctoreController {

	@Autowired
	private DoctoreService ds;

	@GetMapping("getalldoctore")
	public List<DoctoreStaff> getAllDoctores() {
		return ds.getAllDoctores();
	}
	@PostMapping("insertdoctore")
	public String insertDoctoreDetailes(@RequestBody DoctoreStaff doctorestaff) {
		return ds.insertDoctoreDetailes(doctorestaff);
	}
	@PutMapping("updatedoctore")
	public String updateDoctore(@RequestBody DoctoreStaff doctorestaff) {
		return ds.updateDoctore(doctorestaff);

	}
	@GetMapping("getdoctore/{staffid}")
	public DoctoreStaff getDoctore(@PathVariable("staffid")int staffId) {
		return ds.getDoctore(staffId);
	}
	@DeleteMapping("deletedoctore/{id}")
	public String deleteDoctoreInfo(@PathVariable("id") int staffId) {
		return ds.deleteDoctoreInfo(staffId);
	}
	@PostMapping("saveupdatedoctore")
	public String save_updateDoctore(@RequestBody DoctoreStaff doctorestaff) {
		return ds.save_updateDoctore(doctorestaff);
	}
	@GetMapping("getdoctore1")
	public List<DoctoreStaff> getDoctoreLastNameStartWith_U_experience_freshore_branch_Chikhali_salaryGreterThan_35K() {
		return ds.getDoctoreLastNameStartWith_U_experience_freshore_branch_Chikhali_salaryGreterThan_35K();
	}
	@GetMapping("doctore")
	public List<DoctoreStaff> getDoctoreNameStartWith_R() {
		return ds.getDoctoreNameStartWith_R();
	}
	@GetMapping("doctoreBHMS")
	public List<DoctoreStaff> getDoctoreSalaryGreterThan20k_degreeBHMS_experianceFreshor__branchBuldhana() {
		return ds.getDoctoreSalaryGreterThan20k_degreeBHMS_experianceFreshor__branchBuldhana();
	}
	@GetMapping("salarynullvalue")
	public List<DoctoreStaff> getNullValueSalary() {
		return ds.getNullValueSalary();
	}
	@GetMapping("dscorder")
	public List<DoctoreStaff> getDoctorestaffDscOrder() {
		return ds.getDoctorestaffDscOrder();
	}
	@GetMapping("maxsalary")
	public List<DoctoreStaff> countMaxSalary(){
		return ds.countMaxSalary();
	}
	@GetMapping("name")
	public List<DoctoreStaff> getNameStartWith_D_endWith_i_sizeIs_7() {
		return ds.getNameStartWith_D_endWith_i_sizeIs_7();
	}
	@GetMapping("name2")
	public List<DoctoreStaff> getAllLastNameStartWith_J_Or_endWith_o() {
		return ds.getAllLastNameStartWith_J_Or_endWith_o();
	}
	@GetMapping("row")
	public List<DoctoreStaff> getDoctoreStaffNameEqualTo_Radha_salary50kGreterThan_experianceGreterThan1year() {
		return ds.getDoctoreStaffNameEqualTo_Radha_salary50kGreterThan_experianceGreterThan1year();
	}
	@GetMapping("uppercase")
	public List<DoctoreStaff> getAllDoctoresNameIsUpperCase() {
		return ds.getAllDoctoresNameIsUpperCase();
	}
	@GetMapping("rowcountdoctore")
	public List<DoctoreStaff> countRowDoctoreStaff() {
		return ds.countRowDoctoreStaff();
	}
	@GetMapping("countdistinctlastname")
	public List<DoctoreStaff> countDistinctLastName() {
		return ds.countDistinctLastName();
	}
	@GetMapping("avgsalarydocters")
	public List<DoctoreStaff> getDoctoreStaffAvgSalary() {
		return ds.getDoctoreStaffAvgSalary();
	}
	@GetMapping("minimum")
	public List<DoctoreStaff> getDocterStaffMinSalary() {
		return ds.getDocterStaffMinSalary();
	}
	@GetMapping("row1_7")
	public List<DoctoreStaff> getDoctoreStaffRow_1_7() {
		return ds.getDoctoreStaffRow_1_7();
	}
	@GetMapping("mbbs_md")
	public List<DoctoreStaff> getDoctoreStaffDegreeMBBS_MD() {
		return ds.getDoctoreStaffDegreeMBBS_MD();
	}
	@GetMapping("mumbai")
	public List<DoctoreStaff> getAllDoctoreStaffBranchMumbai() {
		return ds.getAllDoctoreStaffBranchMumbai();
	}
	@GetMapping("salary35k")
	public List<DoctoreStaff> getDoctoreStaffSalaryIsGreterThan35k() {
		return ds.getDoctoreStaffSalaryIsGreterThan35k();
	}
	@GetMapping("mbbs_25k")
	public List<DoctoreStaff> getDoctoreStaffSalaryGt25k_nameStartWith_r_degreeMBBS() {
		return ds.getDoctoreStaffSalaryGt25k_nameStartWith_r_degreeMBBS();
	}
	@GetMapping("s")
	public List<DoctoreStaff> getDocterNameStartWithS(){
		return ds.getDocterNameStartWithS();
		
	}

}
