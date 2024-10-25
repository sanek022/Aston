package HW2;

public class Zombie extends Enemy{
    private int health;
    private boolean wasDead = false;
    public Zombie(int health) {
        super(health);
    }

    @Override
    public void attackEnemy(Hero enemy) {
        enemy.takeDamage(10);
    }
    public void takeDamage(int damage) {
        health = this.getHealth() - damage;
        if(health <= 0 && !wasDead){
            health = 1;
            wasDead = true;
        }
        this.setHealth(health);
    }

}
