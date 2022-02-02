package Monsters;
import Monsters.Monster;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Worm extends Monster {
    Random random = new Random();
    int lvlEnemy, lvlStage;
    public Worm(String name, int currentHealth, int maxHealth, int attack, int armor, int magicResistance, int lvlStage) {
        super(name, currentHealth, maxHealth, attack, armor, magicResistance);
        this.lvlEnemy = lvlStage;
    }

    @Override
    public int getSkills(){
        int randomAttack = random.nextInt(1,3);
        if (randomAttack ==1){
            System.out.println("Robak uderza Cię ogonem zadajac 3 obrażenia");
            return 4;
        }
        else{
            System.out.println("Robak napina swoją pierś i przywraca sobie 10 zdrowia.");
            this.currentHealth += 10;
            return 0;
        }


    }
}
