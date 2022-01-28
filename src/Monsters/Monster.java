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
    public void setCurrentHealth(int health){
        this.currentHealth=health;
        System.out.println("HP na poziomie: "+this);
    }
}
