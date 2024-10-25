package HW2;

public class Warrior extends Hero{
    public Warrior(String name) {
        super(name, 100);
    }

    public void attackEnemy(Enemy ...enemyArr){
        for (Enemy enemy : enemyArr)
            enemy.takeDamage(30);
        System.out.println("Warrior attack");
    }
}
