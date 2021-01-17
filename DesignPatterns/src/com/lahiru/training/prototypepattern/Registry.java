package com.lahiru.training.prototypepattern;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<CharacterType, Character> characters = new HashMap<>();

    public Registry(){
        this.initialize();
    }

    public Character getCharacter(CharacterType characterType) {
        Character character = null;
        try {
            character = (Character) characters.get(characterType).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return character;
    }

    private void initialize() {

        Hero hero = new Hero();
        hero.setName("SWAT Soldier");
        hero.setHealth(1000);
        hero.setLevel(5);

        Enemy enemy = new Enemy();
        enemy.setName("Human Zombie");
        enemy.setHealth(2500);
        enemy.setType("Zombie");

        characters.put(CharacterType.HERO, hero);
        characters.put(CharacterType.ENEMY, enemy);

    }

}
