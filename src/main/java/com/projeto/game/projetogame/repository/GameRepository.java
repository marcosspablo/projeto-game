package com.projeto.game.projetogame.repository;

import com.projeto.game.projetogame.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
