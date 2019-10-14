package com.mysprhib.demos;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mysprhib.demos.model.Games;
import com.mysprhib.demos.dao.GameDao;

@Controller
public class GameController {
	
	ArrayList<Games> glist= new ArrayList<Games>();
	@Autowired
	GameDao gameDao;
	
	@RequestMapping(value = "/")
	public String home(Locale locale, Model model) {
		return "index";
	}
	
	@RequestMapping(value = "/savedata")
	public String saveRest(@ModelAttribute Games game) {
		gameDao.saveGames(game);
		return "index";
	}
	
	@RequestMapping(value="/viewdata")
	public String viewRest(Model model)
	{
		glist=gameDao.viewGames();
		model.addAttribute("Car",glist);
		return "result";
	}
	
	
}


