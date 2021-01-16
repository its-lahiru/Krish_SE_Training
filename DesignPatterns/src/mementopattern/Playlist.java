package mementopattern;

import java.util.ArrayList;

public class Playlist {

    ArrayList<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    public ArrayList<Song> getSongs() {
        return (ArrayList) songs.clone();
    }

    // return state of the PlaylistMemento to the CareTaker
    public PlaylistMemento save(){
        return new PlaylistMemento(getSongs());
    }

    // set current state of the cart to state of the PlaylistMemento
    public void revert(PlaylistMemento playlistMemento){
        songs = playlistMemento.getSongs();
    }

    @Override
    public String toString() {
        return "CareTaker{" +
                "songs=" + songs +
                '}';
    }

    static class PlaylistMemento {

        ArrayList<Song> songs;

        public PlaylistMemento(ArrayList<Song> songs) {
            this.songs = songs;
        }

        // private, enforce only cart to be able to access getSongs()
        private ArrayList<Song> getSongs() {
            return songs;
        }
    }

}
