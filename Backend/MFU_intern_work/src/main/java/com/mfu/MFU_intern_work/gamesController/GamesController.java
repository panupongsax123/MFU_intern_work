package com.mfu.MFU_intern_work.gamesController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	 
	 @GetMapping("/list/{id}")
     	public Optional<ModelGames> findOne(@PathVariable int id) {
		
		return gamesService.findOnebook(id);
	}
	 
	 @PostMapping("/save")
		public ModelGames newGames(@RequestBody ModelGames request) {
			                        
	                return gamesService.postGames(request);
		} 
	
	 @PatchMapping("/update/{id}")
		public String patchUpdateGames(@RequestBody ModelGames newGames) {
	         
	                return gamesService.patchUpdateBook(newGames);
		}
	 
	 @DeleteMapping("/delete/{id}")
		public String deleteGame(@PathVariable int id) {
			
	                return gamesService.deleteGame(id);
		}
}
