package com.springresthib.DXCSpringRestHib;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springresthib.DXCSpringRestHib.model.Doctor;
import com.springresthib.DXCSpringRestHib.service.Doctorservice;

@CrossOrigin
@RestController
public class Doctorcontrol {

	@Autowired
	Doctorservice docservice;
	
	@PostMapping(value="doctor")
	public String postRest(@RequestBody Doctor doc)
	{

		return docservice.saveDoctor(doc);
	}
	
	@GetMapping(value="doctor")
	public ArrayList<Doctor> getAllRest()
	{
		return docservice.getDoctors(); 
		
	}
	
	@GetMapping(value="doctor/{doctorId}")
	public Object getRest(@PathVariable int doctorId )
	{
		return docservice.getDoctor(doctorId); 
		
	}
	
	
	@DeleteMapping(value="doctor/{doctorId}")// this url path is linked to path variable below
	public String deleteRest(@PathVariable int doctorId )
	{
		return docservice.deleteDoctor(doctorId); 
		
	}
	
	@PutMapping(value="doctor")
	public String updateRest(@RequestBody Doctor doc )
	{
		return docservice.updateDoctor(doc); 

	}
	
	
	
}
