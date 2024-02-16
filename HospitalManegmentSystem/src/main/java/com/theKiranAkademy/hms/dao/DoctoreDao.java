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

import com.theKiranAkademy.hms.entitey.DoctoreStaff;

@Repository
public class DoctoreDao {
	@Autowired
	private SessionFactory sf;

	public List<DoctoreStaff> getAllDoctores() {
		Session ss = sf.openSession();
		Criteria criteria = ss.createCriteria(DoctoreStaff.class);
		List<DoctoreStaff> list = criteria.list();
		return list;
	}

	public String insertDoctoreDetailes(DoctoreStaff doctorestaff) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(doctorestaff);
		tr.commit();
		return "doctore detail inserted.....";
	}
	public String updateDoctore(DoctoreStaff doctorestaff) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.update(doctorestaff);
		tr.commit();
		return "update sucsessfully....";
	}
	public DoctoreStaff getDoctore(int staffId) {
		Session session = sf.openSession();
		DoctoreStaff ds = session.get(DoctoreStaff.class, staffId);
		return ds;
	}

	public String deleteDoctoreInfo(int staffId) {
		boolean deleted = false;
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		DoctoreStaff ds = session.get(DoctoreStaff.class, staffId);
		session.delete(ds);
		tr.commit();
		return "data delete";
	}

	public String save_updateDoctore(DoctoreStaff doctorestaff) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.saveOrUpdate(doctorestaff);
		tr.commit();
		return "save update sucessfully";
		
	}
	public List<DoctoreStaff> getDoctoreLastNameStartWith_U_experience_freshore_branch_Chikhali_salaryGreterThan_35K() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(DoctoreStaff.class);
		cr.add(Restrictions.ilike("staffLastName", "u%"));
		List<DoctoreStaff> list = cr.list();
		return list;
	}
	public List<DoctoreStaff> getDoctoreNameStartWith_R() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(DoctoreStaff.class);
		cr.add(Restrictions.ilike("staffName", "r%"));
		List<DoctoreStaff> list = cr.list();
		return list;
	}
	public List<DoctoreStaff> getDoctoreSalaryGreterThan20k_degreeBHMS_experianceFreshor__branchBuldhana() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(DoctoreStaff.class);
		cr.add(Restrictions.gt("staffSalary", "20000"));
		List<DoctoreStaff> list = cr.list();
		return list;
	}
	public List<DoctoreStaff> getNullValueSalary() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(DoctoreStaff.class);
		cr.add(Restrictions.isNull("staffSalary"));
		List<DoctoreStaff> list = cr.list();
		return list;
	}
	public List<DoctoreStaff> getDoctorestaffDscOrder() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(DoctoreStaff.class);
		cr.addOrder(Order.asc("staffName"));
		List<DoctoreStaff> list = cr.list();
		return list;
	}
	public List<DoctoreStaff> countMaxSalary() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(DoctoreStaff.class);
		cr.setProjection(Projections.max("staffSalary"));
		List<DoctoreStaff> list = cr.list();
		return list;
	}
	public List<DoctoreStaff> getNameStartWith_D_endWith_i_sizeIs_7() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(DoctoreStaff.class);
		cr.add(Restrictions.ilike("staffName", "d%"));
		List<DoctoreStaff> list = cr.list();
		return list;
	}
	public List<DoctoreStaff> getAllLastNameStartWith_J_Or_endWith_o() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(DoctoreStaff.class);
		cr.add(Restrictions.ilike("staffLastName", "j%"));
		List<DoctoreStaff> list = cr.list();
		return list;
	}
	public List<DoctoreStaff> getDoctoreStaffNameEqualTo_Radha_salary50kGreterThan_experianceGreterThan1year() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(DoctoreStaff.class);
		cr.add(Restrictions.eq("staffName", "Radha"));
		List<DoctoreStaff> list = cr.list();
		return list;
	}
	public List<DoctoreStaff> countRowDoctoreStaff() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(DoctoreStaff.class);
		cr.setProjection(Projections.rowCount());
		List<DoctoreStaff> list = cr.list();
		return list;
	}
	public List<DoctoreStaff> countDistinctLastName() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(DoctoreStaff.class);
		cr.setProjection(Projections.countDistinct("staffLastName"));
		List<DoctoreStaff> list = cr.list();
		return list;
	}
	public List<DoctoreStaff> getDoctoreStaffAvgSalary() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(DoctoreStaff.class);
		cr.setProjection(Projections.avg("staffSalary"));
		List<DoctoreStaff> list = cr.list();
		return list;
	}
	public List<DoctoreStaff> getDocterStaffMinSalary() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(DoctoreStaff.class);
		cr.setProjection(Projections.min("staffSalary"));
		List<DoctoreStaff> list = cr.list();
		return list;
	}
	public List<DoctoreStaff> getDoctoreStaffRow_1_7() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(DoctoreStaff.class);
		cr.add(Restrictions.between("staffId", 1, 8));
		List<DoctoreStaff> list = cr.list();
		return list;
	}
	public List<DoctoreStaff> getDoctoreStaffDegreeMBBS_MD() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(DoctoreStaff.class);
		cr.add(Restrictions.eq("staffDegree","MBBS_MD"));
		List<DoctoreStaff> list = cr.list();
		return list;
	}
	public List<DoctoreStaff> getAllDoctoreStaffBranchMumbai() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(DoctoreStaff.class);
		cr.add(Restrictions.eq("staffBranch", "Mumbai"));
		List<DoctoreStaff> list = cr.list();
		return list;
	}
	public List<DoctoreStaff> getDoctoreStaffSalaryIsGreterThan35k() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(DoctoreStaff.class);
		cr.add(Restrictions.gt("staffSalary", "35000"));
		List<DoctoreStaff> list = cr.list();
		return list;
	}
	public List<DoctoreStaff> getDoctoreStaffSalaryGt25k_nameStartWith_r_degreeMBBS() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(DoctoreStaff.class);
		cr.add(Restrictions.gt("staffSalary", "25000"));
		List<DoctoreStaff> list = cr.list();
		return list;
	}
	public List<DoctoreStaff> getDocterNameStartWithS() {
		Session ss = sf.openSession();
		Criteria cr = ss.createCriteria(DoctoreStaff.class);
		cr.add(Restrictions.ilike("staffName", "r%"));
		List<DoctoreStaff> ll = cr.list();
		return ll;
		
	}
	
}
