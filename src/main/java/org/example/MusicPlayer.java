package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    public MusicPlayer() {
    }

    //IoC
    public MusicPlayer(Music musicList) {
        this.musicList = (List<Music>) musicList;
    }



    public void playMusic() {
        for(Music music:musicList){
            System.out.println(music.getSong());
        }
    }

//    public Music getMusic() {
//        return music;
//    }
//    public void setMusic(Music music) {
//        this.music = music;
//    }
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public  void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
//        musicList.add((Music) this.musicList);
    }
}
