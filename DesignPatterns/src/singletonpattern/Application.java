package singletonpattern;

public class Application {

    // Singleton means one instance per container/JVM
    // Time saving with DB connections

    public static void main(String[] args) {

        long start;
        long end;

        start = System.currentTimeMillis();
        Human human = Human.getHuman();
        end = System.currentTimeMillis();
        System.out.println(human);
        System.out.println(end - start);

        start = System.currentTimeMillis();
        Human human1 = Human.getHuman();
        end = System.currentTimeMillis();
        System.out.println(human1);
        System.out.println(end - start);

    }

}
