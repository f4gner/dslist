package com.fagnerdias.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fagnerdias.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}
