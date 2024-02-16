package com.theKiranAkademy.hms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.theKiranAkademy.hms.entitey.NursingStaff;
import com.theKiranAkademy.hms.service.NursingService;

@RestController
public class NursingController {
	@Autowired
	private NursingService ns;
	
	@GetMapping("getallnursing")
	public List<NursingStaff> getAllNursingStaff() {
		return ns.getAllNursingStaff();
	}
	@PostMapping("insertnursingstaff")
	public String insertNursingStaff(@RequestBody NursingStaff nursingstaff) {
		return ns.insertNursingStaff(nursingstaff);
	}
	@GetMapping("salary30000&namestartS&branchMumbai")
	public List<NursingStaff> getNursigSalary30k_nameStartWithS() {
		return ns.getNursigSalary30k_nameStartWithS();
		
	}
	@GetMapping("salary30k")
	public List<NursingStaff> getNursingStaffSalaryGretarThanEqu30k() {
		return ns.getNursingStaffSalaryGretarThanEqu30k();
	}
	@GetMapping("experiane4year_branch_pune")
	public List<NursingStaff> getNursingStaffBranchName_Pune_Degree_BSCNursing_Experiance_4Year() {
		return ns.getNursingStaffBranchName_Pune_Degree_BSCNursing_Experiance_4Year();
	}
	@GetMapping("startwith_p_lnew_e_s_18000")
	public List<NursingStaff> getNursingStaffNameStart_P_lastNameEndWith_e_ageGrethan22_work_paisentCare_salaryequalTo_18000() {
		return ns.getNursingStaffNameStart_P_lastNameEndWith_e_ageGrethan22_work_paisentCare_salaryequalTo_18000();
	}
	@GetMapping("salaryGT_27_fristnameletter_5")
	public List<NursingStaff> getNursingStaffSalaryGreterThan27k_firstNameLetter_5() {
		return ns.getNursingStaffSalaryGreterThan27k_firstNameLetter_5();
	}
	@GetMapping("ageBT26_50_De_BSCNu_Bran_Mumbai")
	public List<NursingStaff> getNursingStaffAgeInBetween26_50_degree_BSCNursing_BranchName_Mumbai() {
		return ns.getNursingStaffAgeInBetween26_50_degree_BSCNursing_BranchName_Mumbai();
	}
	@PostMapping("saveupdate")
	public String save_updateNursingStaff(@RequestBody NursingStaff nursingstaff) {
		return ns.save_updateNursingStaff(nursingstaff);
	}
	@GetMapping("avgsalary")
	public List<NursingStaff> getNursing_avgSalary() {
		return ns.getNursing_avgSalary();
	}
	@GetMapping("sumsalary")
	public List<NursingStaff> getNursingStaffSalarySum() {
		return ns.getNursingStaffSalarySum();
	}
	@DeleteMapping("delete")
	public String deleteNursingStaff(@RequestBody int id) {
		return ns.deleteNursingStaff(id);
	}
	@GetMapping("load/{id}")
	public NursingStaff getNursingSingleRow(@PathVariable("id") int id) {
		return ns.getNursingSingleRow(id);
	}
	@GetMapping("ageabove24")
	public List<NursingStaff> getNursingStaffAgeGreterThan24() {
		return ns.getNursingStaffAgeGreterThan24();
	}
	@GetMapping("buldhanaage")
	public List<NursingStaff> getNursingStaffBranchBuldhana_degreeBSCNursing_ageAbove20_year() {
		return ns.getNursingStaffBranchBuldhana_degreeBSCNursing_ageAbove20_year();
	}
	@GetMapping("coundistinctnursing")
	public List<NursingStaff> countDistinctDegreeNursingStaff() {
		return ns.countDistinctDegreeNursingStaff();
	}
	@GetMapping("countfristname")
	public List<NursingStaff> countFristNameNursingStaff() {
		return ns.countFristNameNursingStaff();
	}
	@GetMapping("getmaxage")
	public List<NursingStaff> getMaxAgeNursingStaff() {
		return ns.getMaxAgeNursingStaff();
	}
	@GetMapping("getminsalary")
	public List<NursingStaff> getMinSalaryNursingStaff() {
		return ns.getMinSalaryNursingStaff();
	}
	@GetMapping("descordernursing")
	public List<NursingStaff> getNursingStaffDescOrder() {
		return ns.getNursingStaffDescOrder();
	}
	@GetMapping("row5_7")
	public List<NursingStaff> getNursingStaffRow_5_7() {
		return ns.getNursingStaffRow_5_7();
	}
	@GetMapping("age28above")
	public List<NursingStaff> getNursingStaffAgeGreterThan28() {
		return ns.getNursingStaffAgeGreterThan28();
	}
	@GetMapping("branchBuldhana")
	public List<NursingStaff> getAllNursingStaffBranchBuldhana() {
		return ns.getAllNursingStaffBranchBuldhana();
	}
	@GetMapping("salary40kGreter")
	public List<NursingStaff> getAllNursingStaffSalaryGreterThanEqualTo40k() {
		return ns.getAllNursingStaffSalaryGreterThanEqualTo40k();
		
	}
	@GetMapping("buldhana_pune")
	public List<NursingStaff> getNursingStaffWorkInBuldhana_Pune() {
		return ns.getNursingStaffWorkInBuldhana_Pune();
	}
	@GetMapping("paisent_care")
	public List<NursingStaff> getNursingStaffWorkPaisentCare() {
		return ns.getNursingStaffWorkPaisentCare(); 
	}

}
