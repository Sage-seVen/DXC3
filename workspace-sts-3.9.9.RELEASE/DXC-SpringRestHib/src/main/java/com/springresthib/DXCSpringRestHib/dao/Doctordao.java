package com.springresthib.DXCSpringRestHib.dao;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springresthib.DXCSpringRestHib.model.Doctor;

@Transactional
@Component	
public class Doctordao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public void saveDoctor(Doctor doc)
	{
	Session session=	sessionFactory.getCurrentSession();
	session.save(doc);	
	}
	
	public  ArrayList<Doctor> getDoctors()
	{
	Session session=sessionFactory.getCurrentSession();
	ArrayList<Doctor> doctors=(ArrayList<Doctor>) session.createQuery("from Doctor").list();	//from doctor is a class.
	return doctors;
	}
	
	
	public  Doctor getDoctor(int Id)
	{
	Session session=sessionFactory.getCurrentSession();
	Doctor resturant=session.get(Doctor.class, Id);	//get only fetches by primary key id
	return resturant;
	}
	
	
	public  String updateDoctor(Doctor doctor)
	{
	Session session=sessionFactory.getCurrentSession();
	session.update(doctor);	
	return "Doctor Updated";
	}
	
	public  String deleteDoctor(int Id)
	{
	Session session=sessionFactory.getCurrentSession();
	Doctor doc=getDoctor(Id);
	session.delete(doc);
	return "Doctor Deleted";
	}
}
