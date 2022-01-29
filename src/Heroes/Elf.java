package Heroes;

public class Elf extends Hero{
    public Elf(String name){
        this.name =name;
        this.inteligencja = 8;
        this.zrecznosc = 4;
        this.witalnosc = 4;
        this.sila = 2;
        this.exp = 0;
        this.phisicalDamage = this.sila*3;
        this.magicDamage = this.inteligencja*2;
        this.maxHealth = this.witalnosc*3;
        this.currentHealth = this.witalnosc*3;
        this.tworzenie();
    }
    public void setWitalnosc(){
        this.witalnosc++;
        System.out.println("Witalność wzrosla do: "+this.witalnosc);
        setMaxHealth();}

    public void setMaxHealth(){
        this.maxHealth = this.witalnosc*3;
        System.out.println("Twoje Max HP wzrosło do:" +this.maxHealth);
    }

}
