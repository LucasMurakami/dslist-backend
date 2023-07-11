package com.example.dslistbackend.repositories;

import com.example.dslistbackend.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
