package com.v4.insurance.daoimpl;

import java.util.List;
import java.util.ListIterator;
import org.hibernate.Query;
import org.hibernate.Session;
import com.v4s.insurance.dao.RegisterationDAO;
import com.v4s.insurance.domain.RegistrationDomain;
import com.v4s.insurance.entity.RegistrationEntity;
import com.v4s.insurance.hibernate.HibernateBase;
import com.v4s.insurance.model.RegistrationPOJO;

public class RegistrationDAOImpl extends HibernateBase implements RegisterationDAO{


	static RegistrationDomain domain = new RegistrationDomain();
	static RegistrationPOJO pojo = new RegistrationPOJO();
	public void register(RegistrationDomain domain) {


		Session session = getSessionFactoryObj().openSession();
		session.beginTransaction();
		RegistrationEntity register = new RegistrationEntity();

		System.out.println("Errror");
			if(domain.getRegister().getId() != 0) {
			register.setId(domain.getRegister().getId());
		}
		System.out.println(domain.getRegister().getFirstName());
		if(domain.getRegister().getFirstName() !=null) {

			register.setFirstName(domain.getRegister().getFirstName());
		}
		if(domain.getRegister().getLastName() != null)
			register.setLastName(domain.getRegister().getLastName());
		if(domain.getRegister().getEmail() != null)	
			register.setEmail(domain.getRegister().getEmail());
		if(domain.getRegister().getPassword()!=null)
			register.setPassword(domain.getRegister().getPassword());
		if(domain.getRegister().getRetype()!=null)
			register.setRetype(domain.getRegister().getRetype());


		session.save(register);
		session.getTransaction().commit();
		session.close();
	}
/*
	public boolean getUser(String email) {
		Session session = getSessionFactoryObj().openSession();

		RegistrationEntity entity = (RegistrationEntity) session.load(RegistrationEntity.class, email);
		if(entity.getFirstName() != null)
			pojo.setFirstName(entity.getFirstName());
		if(entity.getLastName()!= null)
			pojo.setLastName(entity.getLastName());
		if(entity.getEmail() != null)
			pojo.setEmail(entity.getEmail());
		if(entity.getPassword() != null)
			pojo.setPassword(entity.getPassword());
		if(entity.getRetype() != null)
			pojo.setRetype(entity.getRetype());

		domain.setRegister(pojo);
		System.out.println(domain.getRegister().getFirstName());
		return true;
	}*/

	public boolean emailMatch(String email) {
		
		Session session = getSessionFactoryObj().openSession();
		String hql = "from RegistrationEntity";
		Query query = session.createQuery(hql);
		List<RegistrationEntity> results = query.list();
		ListIterator<RegistrationEntity> r = results.listIterator();
		while(r.hasNext()) {
			if(r.next().getEmail().equals(email)) {
				return true;
			}
			
		}
		return false;
	}
	
	public boolean passwordMatch(String password) {
		
		Session session = getSessionFactoryObj().openSession();
		String hql = "from RegistrationEntity";
		Query query = session.createQuery(hql);
		List<RegistrationEntity> results = query.list();
		ListIterator<RegistrationEntity> r = results.listIterator();
		while(r.hasNext()) {
			if(r.next().getPassword().equals(password)) {
				return true;
			}
			
		}
		return false;
	}
	
	
}
