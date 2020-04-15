package com.Udemy;

import java.util.ArrayList;

public class Song {
    private String title;
    private double duration;
    private ArrayList<Song> arrayListOfSongs;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
        createNewAlbum();
    }
    public void createNewAlbum(){
        this.arrayListOfSongs.add(new Song(this.title,this.duration));

    }
    public String getTitle() {
        return title;
    }

    public  double getDuration() {
        return duration;
    }



}
