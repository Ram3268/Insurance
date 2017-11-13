package com.v4s.insurance.aplt;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface User {

	public boolean register(HttpServletRequest request, HttpServletResponse response);
	public boolean login(HttpServletRequest request, HttpServletResponse response);
}
