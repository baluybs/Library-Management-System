package com.baluybs.lms.model.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baluybs.lms.dto.LibLoginDTO;
import com.baluybs.lms.dto.LibRegDTO;
import com.baluybs.lms.model.dao.LibLoginDAO;
@Service
public class LibLoginService {
	@Autowired
	private LibLoginDAO dao;
	public LibRegDTO isValidUser(LibLoginDTO dto) {
		return dao.isValidUser(dto);
	}
}
