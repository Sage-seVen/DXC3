package com.springresthib.DXCSpringRestHib.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springresthib.DXCSpringRestHib.dao.Doctordao;
import com.springresthib.DXCSpringRestHib.model.Doctor;

@Service
public class Doctorservice {

	@Autowired
	Doctordao doctorDao;
	
	public String saveDoctor(Doctor doc)
	{
		try {
		doctorDao.saveDoctor(doc);
		return "Success";
		}
		catch (Exception e) {
		return  "Error "+e;
		}
	}
	
	
	public ArrayList<Doctor> getDoctors()
	{
		try {
		return 	doctorDao.getDoctors();
		}
		catch (Exception e) {
		return  null;
		}
	}
	

	public Object getDoctor(int docId)
	{
		try {
		return 	doctorDao.getDoctor(docId);
		}
		catch (Exception e) {
		return  e;
		}
	}
	

	public String deleteDoctor(int Id)
	{
		try {
		return 	doctorDao.deleteDoctor(Id);
		}
		catch (Exception e) {
		return  "Error"+e;
		}
	}
	
	
	public String updateDoctor(Doctor doc)
	{
		try {
		return 	doctorDao.updateDoctor(doc);
		}
		catch (Exception e) {
		return  "Error"+e;
		}
	}
	
}

