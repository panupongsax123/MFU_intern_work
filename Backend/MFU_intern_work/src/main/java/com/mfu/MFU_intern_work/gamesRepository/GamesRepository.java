package com.mfu.MFU_intern_work.gamesRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mfu.MFU_intern_work.modelGames.ModelGames;

public interface GamesRepository extends JpaRepository<ModelGames, Integer>{

	List<ModelGames> findAll();
	ModelGames findById(int id);
}
