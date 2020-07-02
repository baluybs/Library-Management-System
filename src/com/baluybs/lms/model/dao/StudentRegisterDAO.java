package com.baluybs.lms.model.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.baluybs.lms.dto.StudentRegisterDTO;

@Repository
public class StudentRegisterDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void register(StudentRegisterDTO dto) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(dto);
		transaction.commit();
		}
}
