package com.baluybs.lms.model.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baluybs.lms.dto.LibRegDTO;
import com.baluybs.lms.model.dao.LibRegDAO;

@Service
public class LibRegService {
	
	@Autowired
	private LibRegDAO libRegDAO;
	
	public void libRegister(LibRegDTO libRegDTO) {
		libRegDAO.libRegister(libRegDTO);
	}
}
