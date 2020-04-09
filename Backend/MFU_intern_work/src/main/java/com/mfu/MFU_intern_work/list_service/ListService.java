package com.mfu.MFU_intern_work.list_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mfu.MFU_intern_work.listRepository.ListRepository;
import com.mfu.MFU_intern_work.model.games_list.ModelGames_list;

@Service("ListService")
public class ListService {

	@Autowired
    private ListRepository repository;
	
	public List<ModelGames_list> getAllGames() {
        
        System.out.println("List all games.");
        List<ModelGames_list> valueList = repository.findAll();
        return valueList;
    }
		
}
