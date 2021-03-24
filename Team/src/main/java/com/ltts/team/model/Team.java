package com.ltts.team.model;

public class Team { 
	private int teamid;
	private String teamname;
	private String ownername;
	
	
	public Team() {
		super();
	}
	public Team(int teamid, String teamname, String ownername) {
		super();
		this.teamid = teamid;
		this.teamname = teamname;
		this.ownername = ownername;
	}
	public int getTeamid() {
		return teamid;
	}
	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	

}
