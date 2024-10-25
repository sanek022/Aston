package HW2;

public class Dragon  extends Enemy{
    public Dragon(int health) {
        super(health);
    }

    @Override
    public void attackEnemy(Hero enemy) {
        enemy.takeDamage(50);
    }
}
