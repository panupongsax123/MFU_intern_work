package com.mfu.MFU_intern_work.listRepository;

import java.util.List;

import com.mfu.MFU_intern_work.model.games_list.ModelGames_list;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListRepository extends JpaRepository<ModelGames_list, Integer>{

	List<ModelGames_list> findAll(); 
}
