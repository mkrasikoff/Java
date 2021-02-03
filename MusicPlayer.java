package ru.mkrasikoff.springproject;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer() { }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        System.out.println("Playing: ");
        for(int i = 0; i < musicList.size(); i++) {
            System.out.println(musicList.get(i).getSong());
        }
    }

    public void init() {
        System.out.println("doing my initialization in musicplayer");
    }

    public void destroy() {
        System.out.println("doing my destroying in musicplayer");
    }
}
