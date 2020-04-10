package com.mfu.MFU_intern_work.gamesController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mfu.MFU_intern_work.gamesService.GamesService;
import com.mfu.MFU_intern_work.modelGames.ModelGames;

@RestController
@RequestMapping("/games")
public class GamesController {

	 @Autowired
     private GamesService gamesService;
	
	 @GetMapping("/listall")
     public List<ModelGames> findAll() {
	
		return gamesService.getAllGames();
	}
	 
	 @PostMapping("/save")
		public ModelGames newGames(@RequestBody ModelGames request) {
			                        
	                return gamesService.postGames(request);
		} 
	
	 
	 
	 
}
