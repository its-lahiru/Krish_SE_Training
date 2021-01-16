package singletonpattern;

import java.sql.Connection;

public class Human {

    private static volatile Human human; // = new Human();
    private static volatile Connection connection;

    private Human() {
        if (human != null){
            throw new RuntimeException("Please use getHuman method");
        }
    }

    public static Human getHuman() {
        if (human == null){
            // Double checking singleton
            // Enforce thread safety
            synchronized (Human.class){
                if (human == null){
                    human = new Human();
                }
            }
        }
        return human;
    }
}
