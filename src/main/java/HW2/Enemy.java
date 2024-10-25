package HW2;


public abstract class Enemy implements Mortal{
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }
    public void takeDamage(int damage) {
        health -= damage;

    }
    public abstract void attackEnemy(Hero enemy);
    public String getType(){
        if(this instanceof Zombie)
            return "Zombie";
        if (this instanceof Dragon)
            return "Dragon";
        return "";
    }
    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
