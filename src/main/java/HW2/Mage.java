package HW2;

public class Mage  extends Hero{
    public Mage(String name) {
        super(name, 50);
    }
    public void attackEnemy(Enemy ...enemyArr){
        for (Enemy enemy : enemyArr)
            enemy.takeDamage(10);
        System.out.println("Mage attack");
    }
}
