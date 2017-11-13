package com.v4s.insurance.apltimpl;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.v4.insurance.daoimpl.RegistrationDAOImpl;
import com.v4s.insurance.aplt.User;
import com.v4s.insurance.dao.RegisterationDAO;
import com.v4s.insurance.domain.RegistrationDomain;
import com.v4s.insurance.model.RegistrationPOJO;

public class UserImpl implements User{
	RegisterationDAO dao = new RegistrationDAOImpl();
	RegistrationDomain d = new RegistrationDomain();
	
	public boolean register(HttpServletRequest request, HttpServletResponse response) {

		RegistrationPOJO pojo = new RegistrationPOJO();

		pojo.setFirstName(request.getParameter("fName"));
		pojo.setLastName(request.getParameter("lName"));
		if(dao.emailMatch(request.getParameter("email"))) {
			JOptionPane.showMessageDialog(null, "Email Already Present");
			return false;
		}
		else {
			pojo.setEmail(request.getParameter("email"));
		}
		pojo.setPassword(request.getParameter("password"));
		pojo.setRetype(request.getParameter("retype"));

		if(request.getParameter("password").equals(request.getParameter("retype"))) {
			d.setRegister(pojo);
			dao.register(d);

			return true;
		}
		else {
			return false;
		}
	}

	public boolean login(HttpServletRequest request, HttpServletResponse response) {

		if(dao.emailMatch(request.getParameter("email")) && dao.passwordMatch(request.getParameter("password"))) {
			
			return true;
		}

		else {
			JOptionPane.showMessageDialog(null, "Email or Password Incorrect");
			return false;}

	}

}