package mementopattern;

import java.util.ArrayList;
import java.util.Stack;

public class CareTaker {

    Stack<Playlist.PlaylistMemento> history = new Stack<>();

    public void save(Playlist playlist){
        history.push(playlist.save());
    }

    public void revert(Playlist playlist){
        if (!history.isEmpty()){
            playlist.revert(history.pop());
        } else {
            System.out.println("Undo failed!");
        }
    }

}
