package com.baluybs.lms.CommonController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.baluybs.lms.dto.BookDTO;
import com.baluybs.lms.dto.StudentRegisterDTO;
import com.baluybs.lms.model.dao.BookDAO;

@Controller
public class BookController {
	@Autowired
	 private BookDAO bookDAO;
	@PostMapping("/book")
	public ModelAndView addBook(BookDTO bookDTO) {
		StudentRegisterDTO dto=bookDAO.isValidStudent(bookDTO);
		if(dto!=null) {
			return new ModelAndView("book","bookMsg","Book Added Successfully");
		}else {
			return new ModelAndView("book","bookMsg","Invalid Student id");
		}
	}

}
