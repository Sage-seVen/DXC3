package com.mysprhib.demos.dao;

import java.io.Console;
import java.util.ArrayList;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
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
	 
	
	@Transactional
	 public Games viewGamesbyid(String id)
	{ 
		Session session=sessionFactory.getCurrentSession(); 
		Games game=(Games)session.get(Games.class, id);
		return game;
	 }
	
	@Transactional
	 public void updateGamesbyid(Games game)
	{ 
		Session session=sessionFactory.getCurrentSession(); 
		session.update(game);
	 }
	
	@Transactional
	 public void deleteGamesbyid(String id)
	{ 
		try {
			Session session=sessionFactory.getCurrentSession(); 
			Games game=(Games)session.get(Games.class, id);
			session.delete(game);
			}
			catch (Exception e) {
				System.out.println("Error, data not found");;
			}
		
	 }
}
