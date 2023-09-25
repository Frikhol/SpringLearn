package ru.shil.springlearn;

public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music){
        this.music = music;
    }

    public String playMusic(){
        System.out.println(music.getSong());
        return music.getSong();
    }

    public String stopMusic(){
        System.out.println("Music stopped");
        return "Music stopped";
    }
}
