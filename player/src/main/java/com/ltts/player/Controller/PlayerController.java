package com.ltts.player.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.player.Dao.PlayerDao;
import com.ltts.player.Model.Player;



@RestController
public class PlayerController {
	@Autowired
	PlayerDao pd;
	
	@GetMapping("/players")
	public List<Player>getPlayer()
	{
		return pd.getAllPlayer();
	}

}