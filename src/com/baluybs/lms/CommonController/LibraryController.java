package com.baluybs.lms.CommonController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.baluybs.lms.dto.LibLoginDTO;
import com.baluybs.lms.dto.LibRegDTO;
import com.baluybs.lms.model.service.LibLoginService;
import com.baluybs.lms.model.service.LibRegService;

@Controller
public class LibraryController {
	@Autowired
	private LibRegService libRegService;
	@PostMapping("/libregister")
	public ModelAndView register(LibRegDTO dto) {
		libRegService.libRegister(dto);
		return new ModelAndView("library","responseMsg","Registered Successfully");
	}
	@Autowired
	private LibLoginService libLoginService;
	@PostMapping("/liblogin")
	public ModelAndView logIn(LibLoginDTO dto) {
		LibRegDTO dto2=libLoginService.isValidUser(dto);
		if(dto2!=null) {
			String[] name= {dto2.getName(),dto2.getCity(),dto2.getDepartment()};
			String name1="Welcome "+name[0]+" from "+name[1]+" to the "+name[2];
			return new ModelAndView("libraryhome","msg",name1);
		}else {
			return new ModelAndView("library","responseMsg","Invalid Credentials");
		}
	}
}
