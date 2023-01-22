package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TetSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        MusicPlayer firstMusicPlayer= context.getBean("musicPlayer",MusicPlayer.class);
        MusicPlayer secondMusicPlayer= context.getBean("musicPlayer",MusicPlayer.class);

        firstMusicPlayer.setVolume(20);
        boolean comparison = firstMusicPlayer == secondMusicPlayer;
        System.out.println(comparison);

        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());
        context.close();
    }
}
