package com.v4s.insurance.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegistrationUtil {
	
	
		
		public static Date getDtae(String date) {
			
			String pattern = "yyyy-MM-dd"; 
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern); 
			Date d = null;
			try {
				 d = simpleDateFormat.parse(date);
			} catch (ParseException e) {
				e.printStackTrace();
			} 
			
			return d;
		}




}
