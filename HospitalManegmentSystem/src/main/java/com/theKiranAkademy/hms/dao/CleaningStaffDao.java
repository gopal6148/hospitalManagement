package com.theKiranAkademy.hms.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.theKiranAkademy.hms.entitey.CleaningStaff;

@Repository
public class CleaningStaffDao {
	
	@Autowired
	SessionFactory sf;
	
	public List<CleaningStaff> getAllCleaningStaff() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(CleaningStaff.class);
		List<CleaningStaff> list = cr.list();
		return list;
	}

	public String insertCleaningStaff(CleaningStaff cleaningstaff) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(cleaningstaff);
		tr.commit();
		return "insert sucessfully";
	}

	public String save_updateCleaningStaff(CleaningStaff cleaningstaff) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.saveOrUpdate(cleaningstaff);
		tr.commit();
		return "save update sucessfully";
	}
	public List<CleaningStaff> getCleaningStaffNameIs_5Letter_SalaryGreterThan13k() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(CleaningStaff.class);
		cr.add(Restrictions.ge("salary","13000"));
		List <CleaningStaff> list = cr.list();
		return list;
	}

	public String deleteCleaningStaff(Integer id) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		CleaningStaff cs = session.get(CleaningStaff.class, id);
		session.delete(cs);
		tr.commit();
	  return "delete sucessfull...";
	}
	public List<CleaningStaff> getCleaningStaffAgeIsGreterThan_24BranchNameStartWith_B() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(CleaningStaff.class);
		cr.add(Restrictions.ilike("branchName", "b%"));
		List <CleaningStaff> list = cr.list();
		return list;
	}
	public List<CleaningStaff> getCleaningStaffworkGenralWard() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(CleaningStaff.class);
		cr.add(Restrictions.eq("work", "CleaningGenralWard"));
		List <CleaningStaff> list = cr.list();
		return list;
	}
	public List<CleaningStaff> countDistinctWork() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(CleaningStaff.class);
		cr.setProjection(Projections.countDistinct("work"));
		List <CleaningStaff> list = cr.list();
		return list;
	}
	public List<CleaningStaff> countFristName() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(CleaningStaff.class);
		cr.setProjection(Projections.count("fristName"));
		List <CleaningStaff> list = cr.list();
		return list;
	}
	public List<CleaningStaff> getCleainingStaffId_1_5() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(CleaningStaff.class);
		cr.add(Restrictions.between("id", 1, 5));
		List <CleaningStaff> list = cr.list();
		return list;
	}
	public List<CleaningStaff> getAllStaffCleaningBranchBuldhana() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(CleaningStaff.class);
		cr.add(Restrictions.eq("branchName", "Buldhana"));
		List <CleaningStaff> list = cr.list();
		return list;
	}
	public List<CleaningStaff> getCleaningStaffWorkNameStartWith_c_endWith_u_salaryGreterThan15k() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(CleaningStaff.class);
		cr.add(Restrictions.ilike("work", "c%"));
		List <CleaningStaff> list = cr.list();
		return list;
	}
	public List<CleaningStaff> getAllCleaningStaffBranchNamePune() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(CleaningStaff.class);
		cr.add(Restrictions.eq("branchName", "Pune"));
		List <CleaningStaff> list = cr.list();
		return list;
	}
	public List<CleaningStaff> getCleaningStaffSalaryLessThanEqule15k() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(CleaningStaff.class);
		cr.add(Restrictions.le("salary", "15000"));
		List <CleaningStaff> list = cr.list();
		return list;
	}
	public List<CleaningStaff> getCleaningStaffAgeGreterThan_23_work_cleaningGenralward() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(CleaningStaff.class);
		cr.add(Restrictions.gt("age", 23));
		List <CleaningStaff> list = cr.list();
		return list;
	}
	public List<CleaningStaff> getAllCleaningStaffLastNameStartWith_M() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(CleaningStaff.class);
		cr.add(Restrictions.ilike("lastName", "m%"));
		List <CleaningStaff> list = cr.list();
		return list;
	}
	public List<CleaningStaff> getCleaningStaffLastNameEndWith_o_startWithJ() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(CleaningStaff.class);
		cr.add(Restrictions.ilike("lastName", "%o"));
		List <CleaningStaff> list = cr.list();
		return list;
	}
	public List<CleaningStaff> CleaningStaffCountRow() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(CleaningStaff.class);
		cr.setProjection(Projections.rowCount());
		List <CleaningStaff> list = cr.list();
		return list;
	}
	public List<CleaningStaff> getCleaningStaffAvgSalary() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(CleaningStaff.class);
		cr.setProjection(Projections.avg("salary"));
		List<CleaningStaff> list = cr.list();
		return list;
	}
	public List<CleaningStaff> getCleaningStaffMaxSalary() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(CleaningStaff.class);
		cr.setProjection(Projections.max("salary"));
		List<CleaningStaff> list = cr.list();
		return list;
	}
	public List<CleaningStaff> getCleaningStaffMinAge() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(CleaningStaff.class);
		cr.setProjection(Projections.min("age"));
		List<CleaningStaff> list = cr.list();
		return list;
	}
	public List<CleaningStaff> getCleaningStaffRow1_6() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(CleaningStaff.class);
		cr.setFirstResult(0);
		cr.setMaxResults(6);
		List<CleaningStaff> list = cr.list();
		return list;
	}
	public List<CleaningStaff> getAllCleaningStaffFristNameLetterIs5() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(CleaningStaff.class);
		List<CleaningStaff> list = cr.list();
		return list;
	}
	public List<CleaningStaff> getCleaningStaffBranchMumbaiSalaryGreterThan15kAgeGretethanEquleTo22() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(CleaningStaff.class);
		cr.add(Restrictions.eq("branchName", "Mumbai"));
		List<CleaningStaff> list = cr.list();
		return list;
	}
	public List<CleaningStaff> getAllCleaningStaffFristNameStartWith_S() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(CleaningStaff.class);
		cr.add(Restrictions.ilike("fristName", "s%"));
		List<CleaningStaff> list = cr.list();
		return list;
	}

}
