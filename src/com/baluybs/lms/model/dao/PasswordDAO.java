package com.baluybs.lms.model.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.baluybs.lms.dto.StudentRegisterDTO;

@Repository
public class PasswordDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public StudentRegisterDTO getByEmail(String email) {
		StudentRegisterDTO dto=null;
		Session session=sessionFactory.openSession();
		String hql = "from StudentRegisterDTO where email=:newEmail";
		try {
			Query query=session.createQuery(hql);
			query.setParameter("newEmail", email);
			dto=(StudentRegisterDTO) query.uniqueResult();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return dto;
	}
}
