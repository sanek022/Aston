package HW2;

public class Archer extends Hero{
    public Archer(String name) {
        super(name, 80);
    }
    public void attackEnemy(Enemy ...enemyArr){
        for (Enemy enemy : enemyArr)
            enemy.takeDamage(20);
        System.out.println("Archer attack");
    }
}
