package com.mfu.MFU_intern_work.listController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mfu.MFU_intern_work.list_service.ListService;
import com.mfu.MFU_intern_work.model.games_list.ModelGames_list;

@RestController
@RequestMapping("/games")
public class ListController {

	 @Autowired
     private ListService listService;
	
	 @GetMapping("/listall")
     public List<ModelGames_list> findAll() {
	
		return listService.getAllGames();
	}
}
