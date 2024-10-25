package HW2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BattleGround {
    public static void main(String[] args) {

        Enemy dragon = new Dragon(100);
        Enemy zombie = new Zombie(20);
        Enemy zombie2 = new Zombie(20);
        Enemy zombie3 = new Zombie(20);
        Hero warrior = new Warrior("War1");
        Hero warrior2 = new Warrior("War2");
        Hero archer = new Archer("Archer");
        Hero archer2 = new Archer("Archer2");
        Hero mage = new Mage("Mage");
        Enemy []enemies = new Enemy[]{dragon, zombie, zombie2, zombie3};
        Hero []heroes = new Hero[]{warrior,warrior2, archer, archer2, mage};
        mage.attackEnemy(dragon);
        warrior.attackEnemy(zombie, zombie2);
        warrior2.attackEnemy(dragon,zombie3);
        dragon.attackEnemy(archer);
        archer2.attackEnemy(dragon, zombie2);
        dragon.attackEnemy(mage);

        for (Hero hero : heroes) {
            System.out.println(hero.getName() + " " + hero.isAlive() + "  " + hero.getHealth());
        }
        for (Enemy enemy : enemies) {
            System.out.println(enemy.getType() + " " + enemy.isAlive() + "  " + enemy.getHealth());
        }






    }
}
