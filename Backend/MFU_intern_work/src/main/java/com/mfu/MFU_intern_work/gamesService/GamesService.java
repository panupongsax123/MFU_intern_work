package com.mfu.MFU_intern_work.gamesService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
	
	
		
}
