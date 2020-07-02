package com.baluybs.lms.utils;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomIdGenarator implements IdentifierGenerator{
	static int count=0;
	static String year="Y2020";

	@Override
	public Serializable generate(SessionImplementor arg0, Object arg1) throws HibernateException {
		final String id;
		id="STD"+year+count+"";
		count++;
		return id;
	}
	
}
