package com.baluybs.lms.model.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baluybs.lms.dto.StudentRegisterDTO;
import com.baluybs.lms.model.dao.StudentRegisterDAO;

@Service
public class StudentRegisterService {
	
	@Autowired
	private StudentRegisterDAO studentRegisterDAO;
	
	public void register(StudentRegisterDTO dto) {
		studentRegisterDAO.register(dto);
	}
}
