package Heroes;

public class Casual extends Hero {
    public Casual(String name){
        this.name =name;
        this.inteligencja = 4;
        this.zrecznosc = 4;
        this.witalnosc = 4;
        this.sila = 4;
        this.exp = 0;
        this.phisicalDamage = this.sila*2;
        this.magicDamage = this.inteligencja*2;
        this.maxHealth = this.witalnosc*3;
        this.currentHealth = this.witalnosc*3;
        this.tworzenie();

    }
    public void setMaxHealth(){
        this.maxHealth = this.witalnosc*3;
        System.out.println("Twoje Max HP wzrosło do:" +this.maxHealth);
    }
}