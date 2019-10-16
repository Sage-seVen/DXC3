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
import org.springframework.web.bind.annotation.RequestParam;

import com.mysprhib.demos.model.Games;
import com.mysprhib.demos.dao.GameDao;

@Controller
public class GameController {
	
	ArrayList<Games> glist= new ArrayList<Games>();
	@Autowired
	GameDao gameDao;
	
	@RequestMapping(value = "/")
	public String home(Locale locale, Model model) {
		return "index2";
	}
	
	@RequestMapping(value = "/savedata")
	public String saveRest(@ModelAttribute Games game) {
		gameDao.saveGames(game);
		return "index2";
	}
	
	@RequestMapping(value="/viewdata")
	public String viewRest(Model model)//view all data
	{
		glist=gameDao.viewGames();
		model.addAttribute("ref",glist);
		return "result";
	}
	
	@RequestMapping(value="/viewdataid")
	public String viewRestid(Model model,@RequestParam("name") String id)
	{
		Games game=gameDao.viewGamesbyid(id);
		model.addAttribute("ref1",game);//
		return "result2";
	}
	
	@RequestMapping(value="/deleteid")
	public String deleteid(Model model,@RequestParam("name") String id)
	{
		gameDao.deleteGamesbyid(id);
		return "index2";
	}
	
	@RequestMapping(value="/updateid")
	public String updateid(@ModelAttribute Games game)
	{
		gameDao.updateGamesbyid(game);
		return "index2";
	}
	
	
}


