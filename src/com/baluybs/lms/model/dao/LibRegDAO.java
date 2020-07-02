package com.baluybs.lms.model.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.baluybs.lms.dto.LibRegDTO;

@Repository
public class LibRegDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void libRegister(LibRegDTO libRegDTO) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(libRegDTO);
		transaction.commit();
	}
}
