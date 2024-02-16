package com.theKiranAkademy.hms.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.theKiranAkademy.hms.entitey.LabStaff;

@Repository
public class LabDao {
	
	@Autowired
	SessionFactory sf;
	
	public List<LabStaff> getAllLabStaff() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(LabStaff.class);
		List<LabStaff> list = cr.list();
		return list;
	}

	public String insertLabStaff(LabStaff labStaff) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(labStaff);
		tr.commit();
		return "insert sucessfull";
	}

	public String updateLabStaff(LabStaff labStaff) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.update(labStaff);
		tr.commit();
		return "update sucessfull";
	}
	public List<LabStaff> getLabStaffFristNameStartWith_S_salaryIs20k() {
		Session session = sf.openSession();
		Criteria cr =session.createCriteria(LabStaff.class);
		cr.add(Restrictions.ilike("fristName", "s%"));
		List<LabStaff> list = cr.list();
		return list;
	}

}
