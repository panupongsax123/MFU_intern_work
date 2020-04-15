package com.mfu.MFU_intern_work.gamesService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.mfu.MFU_intern_work.gamesRepository.GamesRepository;
import com.mfu.MFU_intern_work.modelGames.ModelGames;

@Service("GamesService")
public class GamesService {

	@Autowired
    private GamesRepository repository;
	
	public List<ModelGames> getAllGames() {
        
        System.out.println("List all games.");
        List<ModelGames> valueList = repository.findAll();
        return valueList;
    }
	
	public Optional<ModelGames> findOnebook(@PathVariable int id) {
		
        System.out.println("list 1 game.");
        Optional<ModelGames> value = repository.findById(id);
        return value;
	}
		
	public ModelGames postGames (@RequestBody ModelGames request) {
		
		ModelGames newGames = new ModelGames();            
        
		newGames.setId(request.getId());
		newGames.setName(request.getName());             
		newGames.setCategory(request.getCategory());
		newGames.setRelease_date(request.getRelease_date());
		newGames.setPrice(request.getPrice());
		newGames.setProduce_by(request.getProduce_by());
      
        repository.save(request);
        
        System.out.println(request.getId());
        System.out.println(request.getName());
        
        return newGames;     
}
	
	public String patchUpdateBook(@RequestBody ModelGames newGames) {
        
            System.out.println("Updated game completely.");
            ModelGames updateGame = repository.getOne(newGames.getId());
            System.out.println(newGames.getName());
            repository.save(newGames);
            return "Updated game completely.";

       
    }

	public String deleteGame(@PathVariable int id) {
		
			System.out.println("Deleted game completely.");
			repository.deleteById(id);
<<<<<<< HEAD
            return "Deleted game completely.";
=======
            return "Deleted game.";
>>>>>>> 44cfa5c5f75394a665fde722d7f8a87f4b1eb319
	}
}

