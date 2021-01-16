package prototypepattern;

public class Application {

    // Cloning has two options
    // Shallow copy and Deep copy

    public static void main(String[] args) {

        Registry registry = new Registry();
        Enemy enemy = (Enemy) registry.getCharacter(CharacterType.ENEMY);
        System.out.println(enemy);

        enemy.setType("Z-Animal");
        System.out.println(enemy);

        Enemy enemy1 = (Enemy) registry.getCharacter(CharacterType.ENEMY);
        System.out.println(enemy1);

    }

}
