package com.baluybs.lms.model.dao;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.baluybs.lms.dto.BookDTO;

@Repository
public class BookSubmitDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public List<BookDTO> bookSubmitDetails(String id) {
		Session session=sessionFactory.openSession();
		String hql="from BookDTO where studentid=:newId";
		Query query=session.createQuery(hql);
		query.setParameter("newId", id);
		List<BookDTO> dto=query.list();
		return dto;
	}
}
