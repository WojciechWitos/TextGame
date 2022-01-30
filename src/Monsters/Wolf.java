package Monsters;
import java.util.Random;



public class Wolf extends Monster {
    Random random = new Random();
    int lvlEnemy;
    public Wolf(String name, int currentHealth, int maxHealth, int attack, int armor, int magicResistance, int lvlStage) {
        super(name, currentHealth, maxHealth, attack, armor, magicResistance);
        this.lvlEnemy=lvlStage;


    }
    public int getSkills(){
        int randomAttack = random.nextInt(1,4);
        if (randomAttack ==1){
            System.out.println("Wilk lekko zadrapuje Cię, zadając 5 obrażeń");
            return this.attack+4;
        }
        else if (randomAttack ==2){
            System.out.println("Gryzie Cię w nogę, zadając "+(this.attack+5)+" obrażeń.");
            return this.attack+4;
        }
        else{
            System.out.println("Wilk wyje do księżyca, zwiększając swoje obrażenia o 10");
            this.attack += 10;
            return 0;
        }


    }


}
