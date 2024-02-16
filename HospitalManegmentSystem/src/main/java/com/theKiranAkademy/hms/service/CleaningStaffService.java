package com.theKiranAkademy.hms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theKiranAkademy.hms.dao.CleaningStaffDao;
import com.theKiranAkademy.hms.entitey.CleaningStaff;


@Service
public class CleaningStaffService {
	
	@Autowired
	CleaningStaffDao cd ;
	
	public List<CleaningStaff> getAllCleaningStaff() {
		return cd.getAllCleaningStaff();
	}

	public String insertCleaningStaff(CleaningStaff cleaningstaff) {
		return cd.insertCleaningStaff(cleaningstaff);
		
	}

	public String save_updateCleaningStaff(CleaningStaff cleaningstaff) {
		return cd.save_updateCleaningStaff(cleaningstaff);
		
	}
	public List<CleaningStaff> getCleaningStaffNameIs_5Letter_SalaryGreterThan13k() {
		List<CleaningStaff> list = cd.getCleaningStaffNameIs_5Letter_SalaryGreterThan13k();
		List<CleaningStaff> al = new ArrayList<>();
		for (CleaningStaff cs : list) {
			if(cs.getFristName().length()==5) {
				al.add(cs);
			}
		}
		return al;
	}

	public String deleteCleaningStaff(Integer id) {
		return cd.deleteCleaningStaff(id);
		
	}
	public List<CleaningStaff> getCleaningStaffAgeIsGreterThan_24BranchNameStartWith_B() {
		List<CleaningStaff> list = cd.getCleaningStaffAgeIsGreterThan_24BranchNameStartWith_B();
		List<CleaningStaff> al = new ArrayList<>();
		for (CleaningStaff cleaningStaff : list) {
			if(cleaningStaff.getAge() > 24) {
				al.add(cleaningStaff);
			}
		}
		return al;
	}
	public List<CleaningStaff> getCleaningStaffworkGenralWard() {
		return cd.getCleaningStaffworkGenralWard();
	}
	public List<CleaningStaff> countDistinctWork(){
		return cd. countDistinctWork();
	}
	public List<CleaningStaff> countFristName() {
		return cd.countFristName();
	}
	public List<CleaningStaff> getCleainingStaffId_1_5() {
		return cd.getCleainingStaffId_1_5();
	}
	public List<CleaningStaff> getAllStaffCleaningBranchBuldhana() {
		return cd.getAllStaffCleaningBranchBuldhana();
	}
	public List<CleaningStaff> getCleaningStaffWorkNameStartWith_c_endWith_u_salaryGreterThan15k() {
		List<CleaningStaff> list = cd.getCleaningStaffWorkNameStartWith_c_endWith_u_salaryGreterThan15k();
		List<CleaningStaff> al = new ArrayList<>();
		for (CleaningStaff cs : list) {
			if(cs.getWork().endsWith("U") && Integer.parseInt(cs.getSalary()) > Integer.parseInt("15000")) {
				al.add(cs);
			}
		}
		return al;
	}
	public List<CleaningStaff> getAllCleaningStaffBranchNamePune() {
		return cd.getAllCleaningStaffBranchNamePune();
	}
	public List<CleaningStaff> getCleaningStaffSalaryLessThanEqule15k() {
		return cd.getCleaningStaffSalaryLessThanEqule15k();
	}
	public List<CleaningStaff> getCleaningStaffAgeGreterThan_23_work_cleaningGenralward() {
		List<CleaningStaff> list = cd.getCleaningStaffAgeGreterThan_23_work_cleaningGenralward();
		List<CleaningStaff> al = new ArrayList<>();
		for (CleaningStaff cleaningStaff : list) {
			if(cleaningStaff.getWork().contains("CleaningGenralWard")) {
				al.add(cleaningStaff);
			}
		}
		return al;
	}
	public List<CleaningStaff> getAllCleaningStaffLastNameStartWith_M() {
		return cd.getAllCleaningStaffLastNameStartWith_M();
	}
	public List<CleaningStaff> getCleaningStaffLastNameEndWith_o_startWithJ() {
		List<CleaningStaff> list = cd.getCleaningStaffLastNameEndWith_o_startWithJ();
		List<CleaningStaff> al = new ArrayList<>();
		for (CleaningStaff cleaningStaff : list) {
			if(cleaningStaff.getLastName().startsWith("J")) {
				al.add(cleaningStaff);
			}
		}
		return al;
	}
	public List<CleaningStaff> CleaningStaffCountRow() {
		return cd.CleaningStaffCountRow();
	}
	public List<CleaningStaff> getCleaningStaffAvgSalary() {
		return cd.getCleaningStaffAvgSalary();
	}
	public List<CleaningStaff> getCleaningStaffMaxSalary() {
		return cd.getCleaningStaffMaxSalary();
	}
	public List<CleaningStaff> getCleaningStaffMinAge(){
		return cd.getCleaningStaffMinAge();
	}
	public List<CleaningStaff> getCleaningStaffRow1_6() {
		return cd.getCleaningStaffRow1_6();
	}
	public List<CleaningStaff> getAllCleaningStaffFristNameLetterIs5() {
		List<CleaningStaff> list = cd.getAllCleaningStaffFristNameLetterIs5();
		List<CleaningStaff> al = new ArrayList<>();
		for (CleaningStaff cleaningStaff : list) {
			if(cleaningStaff.getFristName().length() == 5) {
				al.add(cleaningStaff);
			}
		}
		return al;
	}
	public List<CleaningStaff> getCleaningStaffBranchMumbaiSalaryGreterThan15kAgeGretethanEquleTo22() {
		List<CleaningStaff> list = cd.getCleaningStaffBranchMumbaiSalaryGreterThan15kAgeGretethanEquleTo22();
		List<CleaningStaff> al = new ArrayList<>();
		for (CleaningStaff cleaningStaff : list) {
			if(Integer.parseInt(cleaningStaff.getSalary()) > Integer.parseInt("15000") && cleaningStaff.getAge() >= 22) {
				al.add(cleaningStaff);
			}
		}
		return al;
	}
	public List<CleaningStaff> getAllCleaningStaffFristNameStartWith_S() {
		return cd.getAllCleaningStaffFristNameStartWith_S();
	}
	
}
