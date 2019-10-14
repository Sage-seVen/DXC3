package com.myspring.control;


import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.myspring.bean.Car;
import com.myspring.bean.Showroom;

@Controller
public class ShowroomController {

	ArrayList<Showroom> slist= new ArrayList<Showroom>();
	@RequestMapping(value="/")
	public String myMeth()
	{
	return "showdesign";
	}

	boolean var=false;

	@RequestMapping(value="/addcar")
	public String myMeth(Model model,@ModelAttribute Showroom cust)
	{
		//model.addAttribute("kamina",cust);
		
		
		slist.add(cust);
		///button disable code
		var=true;
		model.addAttribute("var",var);
		model.addAttribute("sname", cust.getSname());
		//..
		return "showdesign";
	}
	
	@RequestMapping(value="/viewcar")
	public String myMeth1(Model model)
	{
		model.addAttribute("Car",slist);
		return "showdisplay";
	}
}
