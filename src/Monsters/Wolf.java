package Monsters;
import Monsters.Monster;

class Wolf extends Monster {
    int lvlEnemy;
    public Wolf(String name, int currentHealth, int maxHealth, int attack, int armor, int magicResistance, int lvlStage) {
        super(name, currentHealth, maxHealth, attack, armor, magicResistance);
        this.lvlEnemy=lvlStage;


    }
    public Wolf(String name,int currentHealth, int maxHealth, int attack, int armor, int magicResistance) {
        super(name, currentHealth, maxHealth, attack, armor, magicResistance);



    }


}
