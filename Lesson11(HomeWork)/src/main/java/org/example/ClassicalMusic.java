package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    List<String> songs = new ArrayList<>();
    {
        songs.add("classical song1");
        songs.add("classical song2");
        songs.add("classical song3");
    }
    @Override
    public List<String> getSong() {
        return songs;
    }
}
