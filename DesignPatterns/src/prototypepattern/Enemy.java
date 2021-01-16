package prototypepattern;

public class Enemy extends Character {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "type='" + type + '\'' +
                '}';
    }
}
