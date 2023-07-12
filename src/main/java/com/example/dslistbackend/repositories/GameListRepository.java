package com.example.dslistbackend.repositories;

import com.example.dslistbackend.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
