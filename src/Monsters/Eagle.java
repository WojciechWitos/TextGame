package Monsters;
import Monsters.Monster;

class Eagle extends Monster {
    int lvlEnemy;
    public Eagle(String name, int currentHealth, int maxHealth, int attack, int armor, int magicResistance, int lvlStage) {
        super(name, currentHealth, maxHealth, attack, armor, magicResistance);
        this.lvlEnemy=lvlStage;


    }
    public Eagle(String name,int currentHealth, int maxHealth, int attack, int armor, int magicResistance) {
        super(name, currentHealth, maxHealth, attack, armor, magicResistance);



    }


}
