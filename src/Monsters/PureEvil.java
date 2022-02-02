package Monsters;
import Monsters.Monster;

import java.util.Random;

public class PureEvil extends Monster {
    int lvlEnemy;
    Random random = new Random();
    public PureEvil(String name, int currentHealth, int maxHealth, int attack, int armor, int magicResistance, int lvlStage) {
        super(name, currentHealth, maxHealth, attack, armor, magicResistance);
        this.lvlEnemy=lvlStage;
    }
    @Override
    public int getSkills(){
        int randomAttack = random.nextInt(1,3);
        if (randomAttack ==1){
            System.out.println("Przerażająca kreatura uśmiecha się złowrogo, po czym mówi:");
            return 0;
        }
        else{
            System.out.println("Kreatura krzyczy w twoim kierunku, po czym mówi:");
            this.currentHealth += 10;
            return 0;
        }


    }


}
