package com.CricScore.repositories;

import com.CricScore.entites.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match,Integer> {

    Optional<Match> findByTeamHeading(String teamHeading);

}
