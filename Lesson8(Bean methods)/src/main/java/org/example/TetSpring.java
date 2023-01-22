package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TetSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

//        MusicPlayer firstMusicPlayer= context.getBean("musicPlayer",MusicPlayer.class);
//        MusicPlayer secondMusicPlayer= context.getBean("musicPlayer",MusicPlayer.class);
//
//        firstMusicPlayer.setVolume(20);
//        boolean comparison = firstMusicPlayer == secondMusicPlayer;
//        System.out.println(comparison);
//
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());

        ClassicalMusic classicalMusic= context.getBean("musicBean",ClassicalMusic.class);
        ClassicalMusic classicalMusic2= context.getBean("musicBean",ClassicalMusic.class);

        boolean comparsion = classicalMusic==classicalMusic2;
        System.out.println(comparsion);
        System.out.println(classicalMusic.getSong());
        System.out.println(classicalMusic2.getSong());
        context.close();
    }
}
