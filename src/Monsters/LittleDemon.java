package Monsters;
import Monsters.Monster;

public class LittleDemon extends Monster {
    int lvlEnemy;
    public LittleDemon(String name, int currentHealth, int maxHealth, int attack, int armor, int magicResistance, int lvlStage) {
        super(name, currentHealth, maxHealth, attack, armor, magicResistance);
        this.lvlEnemy=lvlStage;


    }
    public LittleDemon(String name,int currentHealth, int maxHealth, int attack, int armor, int magicResistance) {
        super(name, currentHealth, maxHealth, attack, armor, magicResistance);



    }


}
