package com.v4s.insurance.dao;

import com.v4s.insurance.domain.RegistrationDomain;

public interface RegisterationDAO {

	void register(RegistrationDomain domain);
	
	//boolean getUser(String email);
	boolean emailMatch(String email);
	boolean passwordMatch(String password);
}
