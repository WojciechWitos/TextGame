import Heroes.Hero;
import Monsters.Monster;

public class Combat {
    Hero Postac;
    Monster Potwor;
    Combat(Hero Postac, Monster Potwor){
        this.Postac = Postac;
        this.Potwor = Potwor;
        this.Postac.tworzenie();


    }
}
