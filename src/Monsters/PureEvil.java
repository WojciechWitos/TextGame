package Monsters;
import Monsters.Monster;

class PureEvil extends Monster {
    int lvlEnemy;
    public PureEvil(String name, int currentHealth, int maxHealth, int attack, int armor, int magicResistance, int lvlStage) {
        super(name, currentHealth, maxHealth, attack, armor, magicResistance);
        this.lvlEnemy=lvlStage;


    }
    public PureEvil(String name,int currentHealth, int maxHealth, int attack, int armor, int magicResistance) {
        super(name, currentHealth, maxHealth, attack, armor, magicResistance);



    }


}
