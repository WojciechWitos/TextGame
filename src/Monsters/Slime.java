package Monsters;
import java.util.Random;
public class Slime extends Monster {
    Random random = new Random();
    int lvlEnemy;
    public Slime(String name, int currentHealth, int maxHealth, int attack, int armor, int magicResistance, int lvlStage) {
        super(name, currentHealth, maxHealth, attack, armor, magicResistance);
        this.lvlEnemy=lvlStage;


    }
    public int getSkills(){
        int randomAttack = random.nextInt(1,3);
        if (randomAttack ==1){
            System.out.println("Slime gryzie Cię w piętę zadając 2 obrażenia.");
            return 2;
        }
        else{
            System.out.println("Slime napina się i uderza Cię całą swoją siłą zadając 5 obrażeń.");
            return 5;
        }


    }

}


