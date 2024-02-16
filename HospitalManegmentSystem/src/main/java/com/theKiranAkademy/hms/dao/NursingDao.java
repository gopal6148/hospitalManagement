package com.theKiranAkademy.hms.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.theKiranAkademy.hms.entitey.NursingStaff;

@Repository
public class NursingDao {
	@Autowired
	private SessionFactory sf;
	
	public List<NursingStaff> getAllNursingStaff() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(NursingStaff.class);
		List<NursingStaff> ns = cr.list();
		return ns;
	}

	public String insertNursingStaff(NursingStaff nursingstaff) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(nursingstaff);
		tr.commit();
		return "nursing staff inserted.....";
	}

	public List<NursingStaff> getNursigSalary30k_nameStartWithS() {
		Session ss = sf.openSession();
		Criteria cr = ss.createCriteria(NursingStaff.class);
		cr.add(Restrictions.ilike("firstName", "r%"));
		List<NursingStaff> list = cr.list();
		return list;
	}
	public List<NursingStaff> getNursingStaffSalaryGretarThanEqu30k() {
		Session ss = sf.openSession();
		Criteria cr = ss.createCriteria(NursingStaff.class);
		cr.add(Restrictions.ge("salary", "30000"));
		List<NursingStaff> list = cr.list();
		return list;
	}
	public List<NursingStaff> getNursingStaffBranchName_Pune_Degree_BSCNursing_Experiance_4Year() {
		Session ss = sf.openSession();
		Criteria cr = ss.createCriteria(NursingStaff.class);
		cr.add(Restrictions.eq("brancheName", "Pune"));
		List<NursingStaff> list = cr.list();
		return list;
	}
	public List<NursingStaff> getNursingStaffNameStart_P_lastNameEndWith_e_ageGrethan22_work_paisentCare_salaryequalTo_18000() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(NursingStaff.class);
		cr.add(Restrictions.ilike("firstName", "p%"));
		List<NursingStaff> list = cr.list();
		return list;
	}
	public List<NursingStaff> getNursingStaffSalaryGreterThan27k_firstNameLetter_5() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(NursingStaff.class);
		cr.add(Restrictions.gt("salary", "27000"));
		List<NursingStaff> list = cr.list();
		return list;
	}
	public List<NursingStaff> getNursingStaffAgeInBetween26_50_degree_BSCNursing_BranchName_Mumbai() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(NursingStaff.class);
		cr.add(Restrictions.between("age", "26", "50"));
		List<NursingStaff> list = cr.list();
		return list;
	}

	public String save_updateNursingStaff(NursingStaff nursingstaff) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.saveOrUpdate(nursingstaff);
		tr.commit();
		return "save update sucessfully";
	}
	public List<NursingStaff> getNursing_avgSalary() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(NursingStaff.class);
		cr.setProjection(Projections.avg("salary"));
		List<NursingStaff> list = cr.list();
		return list;
	}
	public List<NursingStaff> getNursingStaffSalarySum() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(NursingStaff.class);
		cr.setProjection(Projections.sum("salary"));
		List<NursingStaff> list = cr.list();
		return list;
	}

	public String deleteNursingStaff(int id) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		NursingStaff ns = session.get(NursingStaff.class, id);
		session.delete(ns);
		tr.commit();
		return "data delete sucessfully";
	}
	public NursingStaff getNursingSingleRow(int id) {
		Session session = sf.openSession();
		NursingStaff ns = session.load(NursingStaff.class, id);
		return ns;
	}
	public List<NursingStaff> getNursingStaffAgeGreterThan24() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(NursingStaff.class);
		cr.add(Restrictions.gt("age", "24"));
		List<NursingStaff> list = cr.list();
		return list;
	}
	public List<NursingStaff> getNursingStaffBranchBuldhana_degreeBSCNursing_ageAbove20_year() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(NursingStaff.class);
		cr.add(Restrictions.eq("brancheName", "Buldhana"));
		List<NursingStaff> list = cr.list();
		return list;
	}
	public List<NursingStaff> countDistinctDegreeNursingStaff() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(NursingStaff.class);
		cr.setProjection(Projections.countDistinct("degree"));
		List<NursingStaff> list = cr.list();
		return list;
	}
	public List<NursingStaff> countFristNameNursingStaff() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(NursingStaff.class);
		cr.setProjection(Projections.count("firstName"));
		List<NursingStaff> list = cr.list();
		return list;
	}
	public List<NursingStaff> getMaxAgeNursingStaff() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(NursingStaff.class);
		cr.setProjection(Projections.max("age"));
		List<NursingStaff> list = cr.list();
		return list;
	}
	public List<NursingStaff> getMinSalaryNursingStaff() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(NursingStaff.class);
		cr.setProjection(Projections.min("salary"));
		List<NursingStaff> list = cr.list();
		return list;
	}
	public List<NursingStaff> getNursingStaffDescOrder() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(NursingStaff.class);
		cr.addOrder(Order.desc("id"));
		List<NursingStaff> list = cr.list();
		return list;
	}
	public List<NursingStaff> getNursingStaffRow_5_7() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(NursingStaff.class);
		cr.add(Restrictions.between("id", 5, 7));
		List<NursingStaff> list = cr.list();
		return list;
	}
	public List<NursingStaff> getNursingStaffAgeGreterThan28() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(NursingStaff.class);
		cr.add(Restrictions.gt("age", "28"));
		List<NursingStaff> list = cr.list();
		return list;
	}
	public List<NursingStaff> getAllNursingStaffBranchBuldhana() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(NursingStaff.class);
		cr.add(Restrictions.eq("brancheName", "Buldhana"));
		List<NursingStaff> list = cr.list();
		return list;
	}
	public List<NursingStaff> getAllNursingStaffSalaryGreterThanEqualTo40k() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(NursingStaff.class);
		cr.add(Restrictions.ge("salary", "40000"));
		List<NursingStaff> list = cr.list();
		return list;
	}
	public List<NursingStaff> getNursingStaffWorkInBuldhana_Pune() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(NursingStaff.class);
		List<NursingStaff> list = cr.list();
		return list;
	}
	public List<NursingStaff> getNursingStaffWorkPaisentCare() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(NursingStaff.class);
		cr.add(Restrictions.eq("work", "Patient_Care"));
		List<NursingStaff> list = cr.list();
		return list;
	} 

}
