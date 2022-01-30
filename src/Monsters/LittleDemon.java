package Monsters;
import java.util.Random;

public class LittleDemon extends Monster {
    int lvlEnemy;
    Random random = new Random();
    public LittleDemon(String name, int currentHealth, int maxHealth, int attack, int armor, int magicResistance, int lvlStage) {
        super(name, currentHealth, maxHealth, attack, armor, magicResistance);
        this.lvlEnemy=lvlStage;


    }
    public int getSkills(){
        int randomAttack = random.nextInt(1,5);
        if (randomAttack ==1){
            System.out.println(this.name+" klaszcze w dłonie wywołując ogromną falę uderzeniową zadając Ci "+this.attack+" obrażeń.");
            return this.attack;
        }
        else if (randomAttack ==2){
            System.out.println(this.name+" przyzywa kulę ognia, która zadaje Ci "+(this.attack+10)+" obrażeń.");
            return (this.attack+10);
        }
        else if (randomAttack ==3){
            System.out.println(this.name+" przywraca sobie 30 zdrowia.");
            this.currentHealth+=30;
            return 0;
        }
        else{
            System.out.println(this.name + "składa modły zwiększajac swoje obrażenia o 15");
            this.attack += 15;
            return 0;
        }


    }



}
