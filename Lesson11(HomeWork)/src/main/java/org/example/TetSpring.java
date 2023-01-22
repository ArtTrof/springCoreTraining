package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TetSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic(MusicGenre.ROCK);
        musicPlayer.playMusic(MusicGenre.CLASSICAL);
        context.close();
    }
}
