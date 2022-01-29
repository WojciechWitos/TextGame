package Monsters;

public class Monster {
    int currentHealth,maxHealth, attack, armor, magicResistance;
    String name;
    public Monster(String name,int currentHealth, int maxHealth, int attack, int armor, int magicResistance){
        this.name = name;
        this.currentHealth = currentHealth;
        this.maxHealth = maxHealth;
        this.attack = attack;
        this.armor = armor;
        this.magicResistance = magicResistance;
    }
    public int getHealth(){
        return this.currentHealth;
    }
    public int getSkills(){
        System.out.println("Skills not defined");
        return 0;
    }

    public void setCurrentHealth(int health){
        this.currentHealth=this.currentHealth-health;
        System.out.println("HP na poziomie: "+this.currentHealth);
    }
    public String getName(){
        return this.name;
    }
    public void skillset(){
        System.out.println("Not implemented in basic Monster");

    }
}
