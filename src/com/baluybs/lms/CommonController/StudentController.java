package com.baluybs.lms.CommonController;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.baluybs.lms.dto.BookDTO;
import com.baluybs.lms.dto.StudentLoginDTO;
import com.baluybs.lms.dto.StudentRegisterDTO;
import com.baluybs.lms.model.dao.BookSubmitDAO;
import com.baluybs.lms.model.dao.StdUpdateDAO;
import com.baluybs.lms.model.service.PasswordService;
import com.baluybs.lms.model.service.StudentLoginService;
import com.baluybs.lms.model.service.StudentRegisterService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentRegisterService registerService;
	
	@PostMapping("/stdregister")
	public ModelAndView register(StudentRegisterDTO dto) {
		registerService.register(dto);
		return new ModelAndView("student","responseMsg","Registration Successful");
	}
	
	@Autowired
	private StudentLoginService studentLoginService;
	
	@PostMapping("/stdlogin")
	public ModelAndView isValid(StudentLoginDTO studentLoginDTO,HttpServletRequest req) {
		StudentRegisterDTO dto=studentLoginService.getUserByEmailAndPassword(studentLoginDTO);
		if(dto!=null) {
			HttpSession session=req.getSession();
			session.setAttribute("dto", dto);
			String[] name= {dto.getName(),dto.getCity(),dto.getDepartment()};
			String name1="welcome "+name[0]+" from "+name[1]+" as a "+name[2];
			return new ModelAndView("studenthome","responseMsg",name1);
		}else {
			return new ModelAndView("student","responseMsg","Invalid Credentials");
		}
	}
	@Autowired
	private StdUpdateDAO dao;
	@PostMapping("/stdupdate")
	public ModelAndView update(StudentRegisterDTO dto,HttpServletRequest req) {
		HttpSession httpSession=req.getSession(false);
		StudentRegisterDTO registerdto=(StudentRegisterDTO) httpSession.getAttribute("dto");
		dto.setId(registerdto.getId());
		StudentRegisterDTO dto1=dao.stdUpdate(dto);
		httpSession.setAttribute("dto", dto1);
		String[] name= {dto1.getName(),dto1.getCity(),dto1.getDepartment()};
		String name1="welcome "+name[0]+" from "+name[1]+" as a "+name[2];
		return new ModelAndView("studenthome","responseMsg",name1);
	}
	
	@Autowired
	private PasswordService service;
	@GetMapping("/pwd")
	public ModelAndView genarateAndUpdatePassword(HttpServletRequest req) {
		String email=req.getParameter("email");
		StudentRegisterDTO dto=service.getByEmail(email);
		if(dto!=null) {
			StudentRegisterDTO dto2=service.chnagePassword(dto);
			return new ModelAndView("student","pwd","Password Changes Successfully");
		}else {
			return new ModelAndView("student","pwd","User Name Does Not Exist");
		}
		//Book Submit to the Student By Librarian
	}
	@Autowired
	private BookSubmitDAO bookSubmitDAO;
	@PostMapping("/det")
	public ModelAndView bookDetails(StudentRegisterDTO dto, HttpServletRequest req) {
		HttpSession httpSession=req.getSession(false);
		StudentRegisterDTO registerdto=(StudentRegisterDTO) httpSession.getAttribute("dto");
		List<BookDTO> dto2=bookSubmitDAO.bookSubmitDetails(registerdto.getId());
		return new ModelAndView("studenthome","bookMsg",dto2);
	}
}
