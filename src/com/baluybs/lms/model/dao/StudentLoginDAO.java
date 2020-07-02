package com.baluybs.lms.model.dao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.baluybs.lms.dto.StudentLoginDTO;
import com.baluybs.lms.dto.StudentRegisterDTO;

@Repository
public class StudentLoginDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public StudentRegisterDTO getUserByEmailAndPassword(StudentLoginDTO studentLoginDTO) {
		StudentRegisterDTO studentRegisterDTO=null;
		Session session=sessionFactory.openSession();
		String hql="from StudentRegisterDTO where email=:newEmail and password=:newPassword";
		Query query=session.createQuery(hql);
		query.setParameter("newEmail", studentLoginDTO.getEmail());
		query.setParameter("newPassword", studentLoginDTO.getPassword());
		try {
			studentRegisterDTO=(StudentRegisterDTO) query.uniqueResult();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return studentRegisterDTO;
	}
}
