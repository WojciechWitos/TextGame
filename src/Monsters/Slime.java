package Monsters;
import Monsters.Monster;

public class Slime extends Monster {
    int lvlEnemy;
    public Slime(String name, int currentHealth, int maxHealth, int attack, int armor, int magicResistance, int lvlStage) {
        super(name, currentHealth, maxHealth, attack, armor, magicResistance);
        this.lvlEnemy=lvlStage;


    }
    public Slime(String name,int currentHealth, int maxHealth, int attack, int armor, int magicResistance) {
        super(name, currentHealth, maxHealth, attack, armor, magicResistance);



    }


}


