package com.baluybs.lms.model.dao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.baluybs.lms.dto.BookDTO;
import com.baluybs.lms.dto.StudentRegisterDTO;

@Repository
public class BookDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public StudentRegisterDTO isValidStudent(BookDTO bookDTO) {
		StudentRegisterDTO registerDTO=null;
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		String hql="from StudentRegisterDTO where id=:newId";
		Query query=session.createQuery(hql);
		query.setParameter("newId", bookDTO.getStudentid());
		try {
			registerDTO=(StudentRegisterDTO) query.uniqueResult();
			if(registerDTO!=null) {
				session.save(bookDTO);
				transaction.commit();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return registerDTO;
	}
}
