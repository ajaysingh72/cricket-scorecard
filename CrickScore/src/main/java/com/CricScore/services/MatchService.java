package com.CricScore.services;

import com.CricScore.entites.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {

    //get all matches

    List<Match> getAllMatches();
    //get live matches
    List<Match> getLiveMatches();

    //get point table
    List<Map<String,String>> getPointTable();
}
