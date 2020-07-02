package com.baluybs.lms.model.dao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.baluybs.lms.dto.LibLoginDTO;
import com.baluybs.lms.dto.LibRegDTO;

@Repository
public class LibLoginDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public LibRegDTO isValidUser(LibLoginDTO libLoginDTO) {
		LibRegDTO dto=null;
		Session session=sessionFactory.openSession();
		String hql="from LibRegDTO where email=:newEmail and password=:newPassword";
		Query query=session.createQuery(hql);
		query.setParameter("newEmail",libLoginDTO.getEmail() );
		query.setParameter("newPassword", libLoginDTO.getPassword());
		try {
			dto=(LibRegDTO) query.uniqueResult();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return dto;
	}
}
