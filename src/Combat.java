import Heroes.Hero;
import Monsters.Monster;

public class Combat {
    Hero Postac;
    Monster Potwor;
    
    Combat(Hero Postac, Monster Potwor){
        this.Postac = Postac;
        this.Potwor = Potwor;
    }

    public void Fight(){
        while ((Postac.getHealth() >0) && (Potwor.getHealth() >0)){
            Postac.getSkills();

        }



    }
}
