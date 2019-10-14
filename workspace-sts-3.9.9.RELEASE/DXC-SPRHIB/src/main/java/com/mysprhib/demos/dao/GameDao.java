package com.mysprhib.demos.dao;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mysprhib.demos.model.Games;

@Component
public class GameDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public void saveGames(Games game){	
	Session session=	sessionFactory.getCurrentSession();
	session.save(game);
	}
	
	
	@Transactional
	 public ArrayList<Games> viewGames(){ 
		 Session session=sessionFactory.getCurrentSession(); 
		 ArrayList<Games> list = (ArrayList<Games>) session.createQuery("from Games").list();
		 return list;
	 }
	 
}
