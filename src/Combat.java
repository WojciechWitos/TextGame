import Heroes.Hero;
import Monsters.Monster;

public class Combat {
    Hero Postac;
    Monster Potwor;

    Combat(Hero Postac, Monster Potwor){
        this.Postac = Postac;
        this.Potwor = Potwor;
    }

    public int Fight(){
        int humanDMG, monsterDMG;
        while ((Postac.getHealth() >0) && (Potwor.getHealth() >0)){
            humanDMG = Postac.getSkills();
            monsterDMG = Potwor.getSkills();
            Postac.setCurrentHealth(monsterDMG);
            Potwor.setCurrentHealth(humanDMG);
            System.out.println(Postac.getHealth());
            System.out.println(Potwor.getHealth());
        }
        if (Postac.getHealth()>0) {
            return 2;
        }
        else if (Postac.getHealth()<=0 && Potwor.getHealth()<=0){
            return 1;
            }
        else{
            return 0;
        }
    }
}
