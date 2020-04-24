package com.mfu.MFU_intern_work.gamesController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mfu.MFU_intern_work.gamesService.GamesService;
import com.mfu.MFU_intern_work.modelGames.ModelGames;

@RestController
@RequestMapping(value = "games")
public class GamesController {		
	
	 @Autowired
     private GamesService gamesService;
	
	 @GetMapping("/list")	 
     	public List<ModelGames> findAll() {
	
		return gamesService.getAllGames();
	}
	 
	 @GetMapping("/list/{id}")
     	public ModelGames findOne(@PathVariable int id) {
		
		return gamesService.findOnegame(id);
	}
	 
	 @PostMapping("/add")
		public ModelGames newGames(@RequestBody ModelGames request) {
			                        
	                return gamesService.postGames(request);
		} 
	
	 @CrossOrigin(origins = "http://localhost:4200")
	 @PostMapping("/edit/{id}")
		public String postUpdateGames(@RequestBody ModelGames newGames) {
	         
	                return gamesService.postUpdateGames(newGames);
		}
	 
	 @CrossOrigin(origins = "http://localhost:4200")
	 @DeleteMapping("/delete/{id}")
		public String deleteGame(@PathVariable int id) {
			
	                return gamesService.deleteGame(id);
		}
}
