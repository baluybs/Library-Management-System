package com.baluybs.lms.model.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.baluybs.lms.dto.LibRegDTO;
import com.baluybs.lms.dto.StudentRegisterDTO;

@Repository
public class StdUpdateDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public StudentRegisterDTO stdUpdate(StudentRegisterDTO dto) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		StudentRegisterDTO registerDTO=(StudentRegisterDTO) session.merge(dto);
		transaction.commit();
		return registerDTO;
	}
}
