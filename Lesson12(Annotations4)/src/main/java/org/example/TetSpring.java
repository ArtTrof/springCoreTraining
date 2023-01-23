package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TetSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");


        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer.getName());

        ClassicalMusic classicalMusic = context.getBean("classicalMusic",ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic",ClassicalMusic.class);
        boolean comp = classicalMusic2==classicalMusic;
        System.out.println(comp);



        context.close();
    }
}
