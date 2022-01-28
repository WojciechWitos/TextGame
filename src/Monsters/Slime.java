package Monsters;
import Monsters.Monster;

class Slime extends Monster {
    int lvlEnemy;
    public Slime(String name, int currentHealth, int maxHealth, int attack, int armor, int magicResistance, int lvlStage) {
        super(name, currentHealth, maxHealth, attack, armor, magicResistance);
        this.lvlEnemy=lvlStage;


    }
    public Slime(String name,int currentHealth, int maxHealth, int attack, int armor, int magicResistance) {
        super(name, currentHealth, maxHealth, attack, armor, magicResistance);



    }
    public void set_currentHealth(int health){
        this.currentHealth = health;
    }

}


