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
            System.out.println("Pokonałeś " + Potwor.getName() + " otrzymując skill point.");
            return 1;
        }
        else if (Postac.getHealth()<=0 && Potwor.getHealth()<=0){
            System.out.println("W ferworze walki upadasz wraz ze swoim przeciwnikiem.");
            System.out.println("Oboje wydajecie ostatnie tchnienie i odchodzicie z tego świata.");
            return 0;
            }
        else{
            System.out.println(Potwor.getName()+" spogląda na Ciebie, przegranego.");
            System.out.println("Pożera Cię, a Ty odchodzisz z tego świata.");
            return 0;
        }
    }
}
