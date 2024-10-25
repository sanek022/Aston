package HW2;

public abstract class Hero implements Mortal{
    private String name;
    private int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }
    public void takeDamage(int damage) {
        health -= damage;
    }
    public abstract void attackEnemy(Enemy ...enemy);
}
