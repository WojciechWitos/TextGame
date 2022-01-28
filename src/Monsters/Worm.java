package Monsters;
import Monsters.Monster;
class Worm extends Monster {
    int lvlStage;

    Worm(String name, int currentHealth, int maxHealth, int attack, int armor, int magicResistance) {
        super(name, currentHealth, maxHealth, attack, armor, magicResistance);
    }

    Worm(String name, int currentHealth, int maxHealth, int attack, int armor, int magicResistance, int lvlStage) {
        super(name, currentHealth, maxHealth, attack, armor, magicResistance);
        this.lvlStage = lvlStage;
    }

}
