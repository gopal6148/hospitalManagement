package com.theKiranAkademy.hms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theKiranAkademy.hms.dao.DoctoreDao;
import com.theKiranAkademy.hms.entitey.DoctoreStaff;

@Service
public class DoctoreService {

	@Autowired
	private DoctoreDao dd;

	public List<DoctoreStaff> getAllDoctores() {
		return dd.getAllDoctores(); 

	}
	public String insertDoctoreDetailes(DoctoreStaff doctorestaff) {
		return dd.insertDoctoreDetailes( doctorestaff);
	}

	public String updateDoctore(DoctoreStaff doctorestaff) {
		return dd.updateDoctore(doctorestaff);

	}
	public DoctoreStaff getDoctore(int staffId) {
		return dd.getDoctore(staffId);

	}
	public String deleteDoctoreInfo(int staffId) {
		return dd.deleteDoctoreInfo(staffId);

	}
	public String save_updateDoctore(DoctoreStaff doctorestaff) {
		return dd.save_updateDoctore(doctorestaff);

	}
	public List<DoctoreStaff> getDoctoreLastNameStartWith_U_experience_freshore_branch_Chikhali_salaryGreterThan_35K() {
		List<DoctoreStaff> list = dd.getDoctoreLastNameStartWith_U_experience_freshore_branch_Chikhali_salaryGreterThan_35K();
		List<DoctoreStaff> al = new ArrayList<>();
		for (DoctoreStaff ds : list) {
			if(ds.getStaffExperience().equals("Freshor") && ds.getStaffBranch().startsWith("C") ){
				al.add(ds);
			}
		}
		return al;
	}
	public List<DoctoreStaff> getDoctoreNameStartWith_R() {
		return dd.getDoctoreNameStartWith_R();
	}
	public List<DoctoreStaff> getDoctoreSalaryGreterThan20k_degreeBHMS_experianceFreshor__branchBuldhana() {
		List<DoctoreStaff> list =dd.getDoctoreSalaryGreterThan20k_degreeBHMS_experianceFreshor__branchBuldhana();
		List<DoctoreStaff> al = new ArrayList<>();
		for (DoctoreStaff ds : list) {
			if(ds.getStaffDegree().equals("BHMS") && ds.getStaffExperience().equals("Freshor") && ds.getStaffBranch().equals("Buldhana")) {
				al.add(ds);
			}
		}
		return al;
	}
	public List<DoctoreStaff> getNullValueSalary() {
		return dd.getNullValueSalary();
	}
	public List<DoctoreStaff> getDoctorestaffDscOrder() {
		return dd.getDoctorestaffDscOrder();
	}
	public List<DoctoreStaff> countMaxSalary(){
		return dd.countMaxSalary();
	}
	public List<DoctoreStaff> getNameStartWith_D_endWith_i_sizeIs_7() {
		List<DoctoreStaff> list = dd.getNameStartWith_D_endWith_i_sizeIs_7();
		List<DoctoreStaff> al = new ArrayList<>();
		for (DoctoreStaff ds : list) {
			if(ds.getStaffName().endsWith("i") && ds.getStaffName().length()==7) {
				al.add(ds);
			}
		}
		return al;
	}
	public List<DoctoreStaff> getAllLastNameStartWith_J_Or_endWith_o() {
		List<DoctoreStaff> list = dd.getAllLastNameStartWith_J_Or_endWith_o();
		List<DoctoreStaff> al = new ArrayList<>();
		for (DoctoreStaff ds : list) {
			if(ds.getStaffLastName().endsWith("o")) {
				al.add(ds);
			}
		}
		return al;
	}
	public List<DoctoreStaff> getDoctoreStaffNameEqualTo_Radha_salary50kGreterThan_experianceGreterThan1year() {
		List<DoctoreStaff> list =dd.getDoctoreStaffNameEqualTo_Radha_salary50kGreterThan_experianceGreterThan1year();
		List<DoctoreStaff> al = new ArrayList<>();
		for (DoctoreStaff ds : list) {
			if(Integer.parseInt(ds.getStaffSalary()) > Integer.parseInt("50000") && ds.getStaffExperience().contains("2_year")) {
				al.add(ds);
			}
	    }
		return al;
   }
	public List<DoctoreStaff> getAllDoctoresNameIsUpperCase() {
		List<DoctoreStaff> list = dd.getAllDoctores();
		List<DoctoreStaff> al = new ArrayList<>();
		for (DoctoreStaff ds : list) {
			if(ds.getStaffName().toUpperCase() != null) {
				al.add(ds);
			}
		}
		return al;
	}
	public List<DoctoreStaff> countRowDoctoreStaff() {
		return dd.countRowDoctoreStaff();
	}
	public List<DoctoreStaff> countDistinctLastName() {
		return dd.countDistinctLastName();
	}
	public List<DoctoreStaff> getDoctoreStaffAvgSalary() {
		return dd.getDoctoreStaffAvgSalary();
	}
	public List<DoctoreStaff> getDocterStaffMinSalary() {
		return dd.getDocterStaffMinSalary();
	}
	public List<DoctoreStaff> getDoctoreStaffRow_1_7() {
		return dd.getDoctoreStaffRow_1_7();
	}
	public List<DoctoreStaff> getDoctoreStaffDegreeMBBS_MD() {
		return dd.getDoctoreStaffDegreeMBBS_MD();
	}
	public List<DoctoreStaff> getAllDoctoreStaffBranchMumbai() {
		return dd.getAllDoctoreStaffBranchMumbai();
	}
	public List<DoctoreStaff> getDoctoreStaffSalaryIsGreterThan35k() {
		return dd.getDoctoreStaffSalaryIsGreterThan35k();
	}
	public List<DoctoreStaff> getDoctoreStaffSalaryGt25k_nameStartWith_r_degreeMBBS() {
		List<DoctoreStaff>  list = dd.getDoctoreStaffSalaryGt25k_nameStartWith_r_degreeMBBS();
		List<DoctoreStaff> al = new ArrayList<>();
		for (DoctoreStaff doctoreStaff : list) {
			if(doctoreStaff.getStaffName().startsWith("R") && doctoreStaff.getStaffDegree().equals("MBBS")) {
				al.add(doctoreStaff);
			}
		}
		return al;
	}
	public List<DoctoreStaff> getDocterNameStartWithS(){
		return dd. getDocterNameStartWithS();
	}

}
