package com.myspring.demos;

import java.util.Date;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


//@Controller
//public class HomeController {
//
//@RequestMapping(value="/")
//public String myMeth()
//{
//return "Design";
//}
//
//
//@RequestMapping(value="/getdata")
//public String myMeth(Model model,@RequestParam("userName") String name)
//{
//model.addAttribute("refName", name);
//return "Display";
//}
//
//
//
//}

import com.myspring.bean.Customer;


@Controller
public class HomeController {

@RequestMapping(value="/signup")
public String myMeth()
{
return "Design";
}


@RequestMapping(value="/getdata")
public String myMeth1(Model model,@ModelAttribute Customer cust)
{
	model.addAttribute("customer",cust);

	return "Display";
}



	/* 2nd method
	 * public String myMeth(Model model,@RequestParam Map<String,String> map) {
	 * 
	 * this is using request parameters, fetching from form nd setting Customer
	 * cust=new Customer(); cust.setName(map.get("name"));
	 * cust.setPassword(map.get("password")); cust.setEmail(map.get("email"));
	 * cust.setPhone(Integer.parseInt(map.get("phone")));
	 * 
	 * model.addAttribute("customer",cust);
	 * 
	 * return "Display"; }
	 */


@RequestMapping(value="/getdatanew")
public String myMeth(Model model,@ModelAttribute Customer cust)
{
model.addAttribute("customer",cust);
return "Display";
}




}

