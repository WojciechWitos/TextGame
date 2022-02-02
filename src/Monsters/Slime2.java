package Monsters;
import java.util.Random;
public class Slime2 extends Monster {
    Random random = new Random();
    int lvlEnemy;
    public Slime2(String name, int currentHealth, int maxHealth, int attack, int armor, int magicResistance, int lvlStage) {
        super(name, currentHealth, maxHealth, attack, armor, magicResistance);
        this.lvlEnemy=lvlStage;


    }
    @Override
    public int getSkills(){
        int randomAttack = random.nextInt(1,3);
        if (randomAttack ==1){
            System.out.println(this.name + "atakuje Cię podmuchem płomieni, zadając 15 obrażeń");
            return 15;
        }
        else if (randomAttack ==2){
            System.out.println(this.name+" przyzywa chmarę robali, która zadaje Ci "+(this.attack+15)+" obrażeń.");
            return (this.attack+15);
        }
        else if (randomAttack ==3){
            System.out.println(this.name+" przywraca sobie 10 zdrowia.");
            this.currentHealth+=10;
            return 0;
        }
        else if (randomAttack ==4){
            System.out.println(this.name+" zwiększa sobie obrażenia o 10.");
            return (this.attack+10);
        }
        else{
            System.out.println("Zapada w sen.");
            return 0;
        }


    }

}


