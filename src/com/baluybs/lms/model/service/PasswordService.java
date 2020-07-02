package com.baluybs.lms.model.service;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baluybs.lms.dto.StudentRegisterDTO;
import com.baluybs.lms.model.dao.PasswordDAO;
import com.baluybs.lms.model.dao.StdUpdateDAO;

@Service
public class PasswordService {
	@Autowired
	private PasswordDAO dao;
	@Autowired
	private StdUpdateDAO updateDAO;
	static String newPassword;
	
	public StudentRegisterDTO getByEmail(String email) {
		return dao.getByEmail(email);
	}
	public StudentRegisterDTO chnagePassword(StudentRegisterDTO registerDTO) {
		Random random = new Random();
		newPassword = String.format("%04d", random.nextInt(1001));
		registerDTO.setPassword(newPassword);
		sendSms(registerDTO.getNumber());
		return updateDAO.stdUpdate(registerDTO);
	}
	public static void sendSms(long num) {
		try {
			String apiKey="apiKey="+"8e6t13Ky5H4-HdNDdUvfbCLcJHw0Fames2KzE8NHqY";
			String message="&message=" + URLEncoder.encode("Your NewPassword is "+newPassword, "UTF-8");
			String number="&numbers="+num+"";
			String apiURL="https://api.textlocal.in/send/?"+apiKey+message+number;
			URL url=new URL(apiURL);
			URLConnection connection=url.openConnection();
			connection.setDoOutput(true);
			BufferedReader reader=new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String line="";
			StringBuilder sb=new StringBuilder();
			while((line=reader.readLine())!=null) {
				sb.append(line).append("\n");
			}
			System.out.println(sb.toString());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
