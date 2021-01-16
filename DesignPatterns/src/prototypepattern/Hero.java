package prototypepattern;

public class Hero extends Character {

    private int level;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "level=" + level +
                '}';
    }
}
