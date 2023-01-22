package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    List<String> songs = new ArrayList<>();

    {
        songs.add("rock song 1");
        songs.add("rock song 2");
        songs.add("rock song 3");
    }
    @Override
    public List<String> getSong() {
        return songs;
    }
}
