package pbo25.week_5;

public class Archer extends Hero {
    public Archer(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    public int getHealth() {
        return this.health;
    }
}