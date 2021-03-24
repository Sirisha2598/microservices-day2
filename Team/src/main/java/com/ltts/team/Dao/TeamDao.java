package com.ltts.team.Dao;
  

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ltts.team.model.Team;



@Repository
public class TeamDao {
   
	public List<Team> getAllTeam(){
		 
		List<Team>li =new ArrayList<Team>();
		li.add(new Team(1,"csk","Srini"));
		li.add(new Team(1,"mi","ambani"));
		li.add(new Team(1,"rcb","mallaya"));
		return li;
	}
	
	
	
}
