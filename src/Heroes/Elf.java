package Heroes;

public class Elf extends Hero{
    public Elf(String name){
        this.name =name;
        this.inteligencja = 4;
        this.zrecznosc = 8;
        this.witalnosc = 4;
        this.sila = 2;
        this.exp = 0;
        this.phisicalDamage = this.sila*2;
        this.magicDamage = this.inteligencja*2;
        this.maxHealth = this.witalnosc*2;
        this.currentHealth = this.witalnosc*3;
        this.tworzenie();
    }
    public void setSila(){
        this.sila++;
        this.phisicalDamage = this.sila*2;
        System.out.println("Sila wzrosla do: "+this.sila);
    }
    public void setInteligencja(){
        this.inteligencja ++;
        this.magicDamage = this.inteligencja*2;
        System.out.println("Inteligencja wzrosla do: "+this.inteligencja);
    }

    public void setWitalnosc(){
        this.witalnosc++;
        System.out.println("Witalność wzrosla do: "+this.witalnosc);
        setMaxHealth();}

    public void setMaxHealth(){
        this.maxHealth = this.witalnosc*2;
        this.currentHealth = this.maxHealth;
        System.out.println("Twoje Max HP wzrosło do: " +this.maxHealth);
    }
    public int getSkills(){
        if (this.zrecznosc<=10){
            System.out.println("1. Dźgnięcie nożem: "+this.phisicalDamage);
            System.out.println("2. Zew natury: " + (this.phisicalDamage+5));
            System.out.println("3. Dzikie pnącza: Zablokowane");
            System.out.println("4. Atak z zaskoczenia: Zablokowane");
            System.out.println("5. Niebiańska strzała: Zablokowane");
        }
        else if (this.zrecznosc>10 && this.zrecznosc < 15){
            System.out.println("1. Dźgnięcie nożem: "+this.phisicalDamage);
            System.out.println("2. Zew natury: " + (this.magicDamage+5));
            System.out.println("3. Dzikie pnącza: " + (this.magicDamage+this.magicDamage+this.zrecznosc*2));
            System.out.println("4. Atak z zaskoczenia: Zablokowane");
            System.out.println("5. Niebiańska strzała: Zablokowane");
        }
        else if (this.zrecznosc>=15 && this.zrecznosc < 20){
            System.out.println("1. Dźgnięcie nożem: "+this.phisicalDamage);
            System.out.println("2. Zew natury: " + (this.magicDamage+5));
            System.out.println("3. Dzikie pnącza: " + (this.magicDamage+this.magicDamage+this.zrecznosc*2));
            System.out.println("4. Atak z zaskoczenia: "+(this.magicDamage+2*this.magicDamage+this.zrecznosc*4));
            System.out.println("5. Niebiańska strzała: Zablokowane");
        }
        else if (this.zrecznosc>=20){
            System.out.println("1. Dźgnięcie nożem: "+this.phisicalDamage);
            System.out.println("2. Zew natury: " + (this.magicDamage+5));
            System.out.println("3. Dzikie pnącza: " + (this.magicDamage+this.magicDamage+this.zrecznosc*2));
            System.out.println("4. Atak z zaskoczenia: "+(this.magicDamage+2*this.magicDamage+this.zrecznosc*4));
            System.out.println("5. Niebiańska strzała: "+(this.magicDamage+4*this.magicDamage+this.zrecznosc*5));
        }
        int val;
        if (this.zrecznosc<=10){
            val = odp2();
            switch (val){
                case 2:
                    return this.phisicalDamage+5;
                default:
                    return this.phisicalDamage;
            }
        }
        else if (this.zrecznosc>10 & this.zrecznosc <= 15) {
            val = odp3();
            return switch (val) {
                case 2 -> this.phisicalDamage+5;
                case 3 -> this.magicDamage+this.magicDamage+this.zrecznosc*2;
                default -> this.phisicalDamage;
            };
        }
        else if (this.zrecznosc>15 & this.zrecznosc <= 20) {
            val = odp4();
            return switch (val) {
                case 2 -> this.phisicalDamage+5;
                case 3 -> this.magicDamage+this.magicDamage+this.zrecznosc*2;
                case 4 -> this.magicDamage+2*this.magicDamage+this.zrecznosc*4;
                default -> this.phisicalDamage;
            };
        }
        else if (this.zrecznosc>20){
            val = odp5();
            return switch (val) {
                case 2 -> this.phisicalDamage+5;
                case 3 -> this.magicDamage+this.magicDamage+this.zrecznosc*2;
                case 4 -> this.magicDamage+2*this.magicDamage+this.zrecznosc*4;
                case 5 -> this.magicDamage+4*this.magicDamage+this.zrecznosc*5;
                default -> this.phisicalDamage;
            };
        }
        return 0;
    }

}
