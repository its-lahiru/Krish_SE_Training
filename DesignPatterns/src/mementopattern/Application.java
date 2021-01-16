package mementopattern;

public class Application {

    // Item reverse is not depend on the songs in the Playlist
    // It depend only on the version of the saved playlist

    public static void main(String[] args) {

        CareTaker careTaker = new CareTaker();
        Playlist playlist = new Playlist();

        playlist.addSong(new Song("Kuweni"));
        playlist.addSong(new Song("Pandama"));
        careTaker.save(playlist);
        System.out.println(playlist);

        playlist.addSong(new Song("Swarnapaliye"));
        careTaker.save(playlist);
        System.out.println(playlist);

        playlist.addSong(new Song("Ciao Malli"));
        careTaker.save(playlist);
        System.out.println(playlist);

        playlist.addSong(new Song("Memories"));
        careTaker.save(playlist);
        System.out.println(playlist);

        System.out.println("Revert starts..");

        careTaker.revert(playlist);
        System.out.println(playlist);

        careTaker.revert(playlist);
        System.out.println(playlist);

        careTaker.revert(playlist);
        System.out.println(playlist);

        careTaker.revert(playlist);
        System.out.println(playlist);

        careTaker.revert(playlist);
        System.out.println(playlist);

        careTaker.revert(playlist);
        System.out.println(playlist);

        System.out.println("Add new song");
        playlist.addSong(new Song("Heal the world!"));
        careTaker.save(playlist);
        System.out.println(playlist);

        careTaker.revert(playlist);
        System.out.println(playlist);

        careTaker.revert(playlist);
        System.out.println(playlist);




    }

}
