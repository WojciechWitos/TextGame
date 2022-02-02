package Monsters;
import java.util.Random;
public class Eagle extends Monster {
    int lvlEnemy;
    Random random = new Random();
    public Eagle(String name, int currentHealth, int maxHealth, int attack, int armor, int magicResistance, int lvlStage) {
        super(name, currentHealth, maxHealth, attack, armor, magicResistance);
        this.lvlEnemy=lvlStage;


    }
    @Override
        public int getSkills(){
            int randomAttack = random.nextInt(1,4);
            if (randomAttack ==1){
                System.out.println("Ptak atakuje Cię z powietrza, lekko zadrapując Cię zadajć "+this.attack);
                return 4;
            }
            else if (randomAttack ==1){
                System.out.println("Ptak wznosi się wysoko, regenerując swoje rany i zwiększając swoje obrażeni. ");
                this.attack+=10;
                this.currentHealth+=40;
                return 0;
            }
            else{
                System.out.println("Robak napina swoją pierś i przywraca sobie 10 zdrowia.");
                this.currentHealth += 10;
                return 0;
            }


        }


}
