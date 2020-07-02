package com.baluybs.lms.model.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baluybs.lms.dto.StudentLoginDTO;
import com.baluybs.lms.dto.StudentRegisterDTO;
import com.baluybs.lms.model.dao.StudentLoginDAO;

@Service
public class StudentLoginService {
	
	@Autowired
	private StudentLoginDAO studentLoginDAO;
	
	public StudentRegisterDTO getUserByEmailAndPassword(StudentLoginDTO dto) {
		return studentLoginDAO.getUserByEmailAndPassword(dto);
	}
}
