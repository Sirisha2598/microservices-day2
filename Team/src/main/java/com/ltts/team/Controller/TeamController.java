package com.ltts.team.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.ltts.team.Dao.TeamDao;
import com.ltts.team.model.Team;



 
	@RestController
	public class TeamController {
		
	@Autowired
	TeamDao td;
	@GetMapping("/teams")
	public List<Team> getTeams()
	{
		return td.getAllTeam();
	}
	}

