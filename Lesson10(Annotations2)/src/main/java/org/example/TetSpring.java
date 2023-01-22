package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TetSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

//        Music music = context.getBean("rockMusicBean", RockMusic.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();
//
//        Music music2 = context.getBean("classicalMusic",ClassicalMusic.class);
//        MusicPlayer musicPlayer2 = new MusicPlayer(music2);
//        musicPlayer2.playMusic();

//        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//        musicPlayer.playMusic();

        Computer computer= context.getBean("computer",Computer.class);
        System.out.println(computer.toString());
        context.close();
    }
}
