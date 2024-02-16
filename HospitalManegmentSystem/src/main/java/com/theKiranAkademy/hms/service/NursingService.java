package com.theKiranAkademy.hms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theKiranAkademy.hms.dao.NursingDao;
import com.theKiranAkademy.hms.entitey.NursingStaff;

@Service
public class NursingService {
	@Autowired
	private NursingDao nd;

	public List<NursingStaff> getAllNursingStaff() {
		return nd.getAllNursingStaff();
	}
	public String insertNursingStaff(NursingStaff nursingstaff) {
		return nd.insertNursingStaff(nursingstaff);
		
	}
	public List<NursingStaff> getNursigSalary30k_nameStartWithS() {
		List<NursingStaff> list = nd.getNursigSalary30k_nameStartWithS();
		List<NursingStaff> al = new ArrayList<>();
		for (NursingStaff ns : list) {
			if(Integer.parseInt(ns.getSalary()) > Integer.parseInt("30000") && ns.getBrancheName().equals("Mumbai")) {
				al.add(ns);
			}
		}
		return al;
	}
	public List<NursingStaff> getNursingStaffSalaryGretarThanEqu30k() {
		return nd.getNursingStaffSalaryGretarThanEqu30k();
	}
	public List<NursingStaff> getNursingStaffBranchName_Pune_Degree_BSCNursing_Experiance_4Year() {
		List<NursingStaff> list = nd.getNursingStaffBranchName_Pune_Degree_BSCNursing_Experiance_4Year();
		List<NursingStaff> al = new ArrayList<>();
		for (NursingStaff ns : list) {
			if(ns.getDegree().equals("BSC_Nursing") && ns.getExperience().equals("4_year")) {
				al.add(ns);
			}
		}
		return al;
	}
	public List<NursingStaff> getNursingStaffNameStart_P_lastNameEndWith_e_ageGrethan22_work_paisentCare_salaryequalTo_18000() {
		List<NursingStaff> list = nd.getNursingStaffNameStart_P_lastNameEndWith_e_ageGrethan22_work_paisentCare_salaryequalTo_18000();
		List<NursingStaff> al = new ArrayList<>();
		for(NursingStaff nt:list) {
			if(nt.getLastName().endsWith("e") && Integer.parseInt(nt.getAge()) > Integer.parseInt("22") && nt.getSalary().equals("18000")) {
				al.add(nt);
			}
		}
		return al;
	}
	public List<NursingStaff> getNursingStaffSalaryGreterThan27k_firstNameLetter_5() {
		List<NursingStaff> list = nd.getNursingStaffSalaryGreterThan27k_firstNameLetter_5();
		List<NursingStaff> al = new ArrayList<>();
		for (NursingStaff ns : list) {
			if(ns.getFirstName().length()==5) {
				al.add(ns);
			}
		}
		return al;
	}
	public List<NursingStaff> getNursingStaffAgeInBetween26_50_degree_BSCNursing_BranchName_Mumbai() {
		List<NursingStaff> list = nd.getNursingStaffAgeInBetween26_50_degree_BSCNursing_BranchName_Mumbai();
		List<NursingStaff> al = new ArrayList<>();
		for (NursingStaff ns : list) {
			if(ns.getDegree().equals("BSC_Nursing") && ns.getBrancheName().equals("Mumbai")) {
				al.add(ns);
			}
		}
		return al;
	}
	public String save_updateNursingStaff(NursingStaff nursingstaff) {
		return nd.save_updateNursingStaff(nursingstaff);
		
	}
	public List<NursingStaff> getNursing_avgSalary() {
		return nd.getNursing_avgSalary();
	}
	public List<NursingStaff> getNursingStaffSalarySum() {
		return nd.getNursingStaffSalarySum();
	}
	public String deleteNursingStaff(int id) {
		return nd.deleteNursingStaff(id);
		
	}
	public NursingStaff getNursingSingleRow(int id) {
		return nd.getNursingSingleRow(id);
	}
	public List<NursingStaff> getNursingStaffAgeGreterThan24() {
		return nd.getNursingStaffAgeGreterThan24();
	}
	public List<NursingStaff> getNursingStaffBranchBuldhana_degreeBSCNursing_ageAbove20_year() {
		List<NursingStaff> list = nd.getNursingStaffBranchBuldhana_degreeBSCNursing_ageAbove20_year();
		List<NursingStaff> al = new ArrayList<>();
		for (NursingStaff ns : list) {
			if(ns.getDegree().equals("BSC_Nursing") && Integer.parseInt(ns.getAge()) > Integer.parseInt("20")) {
				al.add(ns);
			}
		}
		return al;
	}
	public List<NursingStaff> countDistinctDegreeNursingStaff() {
		return nd.countDistinctDegreeNursingStaff();
	}
	public List<NursingStaff> countFristNameNursingStaff() {
		return nd.countFristNameNursingStaff();
	} 
	public List<NursingStaff> getMaxAgeNursingStaff() {
		return nd.getMaxAgeNursingStaff();
	}
	public List<NursingStaff> getMinSalaryNursingStaff() {
		return nd.getMinSalaryNursingStaff();
	}
	public List<NursingStaff> getNursingStaffDescOrder() {
		return nd.getNursingStaffDescOrder();
	}
	public List<NursingStaff> getNursingStaffRow_5_7() {
		return nd.getNursingStaffRow_5_7();
	}
	public List<NursingStaff> getNursingStaffAgeGreterThan28() {
		return nd.getNursingStaffAgeGreterThan28();
	}
	public List<NursingStaff> getAllNursingStaffBranchBuldhana() {
		return nd.getAllNursingStaffBranchBuldhana();
	}
	public List<NursingStaff> getAllNursingStaffSalaryGreterThanEqualTo40k() {
		return nd.getAllNursingStaffSalaryGreterThanEqualTo40k();
	}
	public List<NursingStaff> getNursingStaffWorkInBuldhana_Pune() {
		List<NursingStaff> list = nd.getNursingStaffWorkInBuldhana_Pune();
		List<NursingStaff> al = new ArrayList<>();
		for (NursingStaff nursingStaff : list) {
			if(nursingStaff.getBrancheName().equals("Buldhana") || nursingStaff.getBrancheName().equals("Pune")) {
				al.add(nursingStaff);
			}
		}
		return al;
	}
	public List<NursingStaff> getNursingStaffWorkPaisentCare() {
		return nd.getNursingStaffWorkPaisentCare();
	}
}
