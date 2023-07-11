package com.projeto.game.projetogame.services;

import com.projeto.game.projetogame.dto.GameMinDto;
import com.projeto.game.projetogame.entities.Game;
import com.projeto.game.projetogame.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;
    public List<GameMinDto> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDto> dto = result.stream().map(x -> new GameMinDto(x)).toList();
        return dto;
    }
}
