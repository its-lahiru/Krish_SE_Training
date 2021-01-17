package com.lahiru.training.mementopattern;

public class Song {

    String name;

    public Song(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                '}';
    }
}
