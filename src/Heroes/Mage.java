package Heroes;

public class Mage extends Hero{
    public Mage(String name){
        this.name =name;
        this.inteligencja = 8;
        this.zrecznosc = 4;
        this.witalnosc = 4;
        this.sila = 2;
        this.exp = 0;
        this.tworzenie();
        this.phisicalDamage = this.sila;
        this.magicDamage = this.inteligencja*5;
        this.maxHealth = this.witalnosc*5;
        this.currentHealth = this.witalnosc*5;
    }
    public void setMaxHealth(){
        this.maxHealth = this.witalnosc*5;
        System.out.println("Twoje Max HP wzrosło do:" +this.maxHealth);
    }
    public void setWitalnosc(){
        this.witalnosc++;
        System.out.println("Witalność wzrosla do: "+this.witalnosc);
        setMaxHealth();}
}
