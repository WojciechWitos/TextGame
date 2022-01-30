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
        this.magicDamage = this.inteligencja*2;
        this.maxHealth = this.witalnosc*3;
        this.currentHealth = this.witalnosc*3;
    }
    public void setMaxHealth(){
        this.maxHealth = this.witalnosc*3;
        this.currentHealth = this.maxHealth;
        System.out.println("Twoje Max HP wzrosło do: " +this.maxHealth);
    }
    public void setInteligencja(){
        this.inteligencja ++;
        this.magicDamage = this.inteligencja*5;
        System.out.println("Inteligencja wzrosla do: "+this.inteligencja);
    }

    public void setSila() {
        this.sila++;
        this.phisicalDamage = this.sila;
        System.out.println("Sila wzrosla do: " + this.sila);
    }

    public void setWitalnosc(){
        this.witalnosc++;
        this.maxHealth = this.witalnosc*3;
        System.out.println("Witalność wzrosla do: "+this.witalnosc);
        setMaxHealth();}

    public int getSkills(){
        if (this.inteligencja<=10){
            System.out.println("1. Dźgnięcie nożem: "+this.phisicalDamage);
            System.out.println("2. Pocisk ognia: " + (this.magicDamage+5));
            System.out.println("3. Lodowa kula: Zablokowane");
            System.out.println("4. Płonący kamień: Zablokowane");
            System.out.println("5. Armagedon: Zablokowane");
        }
        else if (this.inteligencja>10 && this.inteligencja < 15){
            System.out.println("1. Dźgnięcie nożem: "+this.phisicalDamage);
            System.out.println("2. Pocisk ognia: " + (this.magicDamage+5));
            System.out.println("3. Lodowa kula: " + (this.magicDamage+2*this.magicDamage));
            System.out.println("4. Płonący kamień: Zablokowane");
            System.out.println("5. Armagedon: Zablokowane");
        }
        else if (this.inteligencja>=15 && this.inteligencja < 20){
            System.out.println("1. Dźgnięcie nożem: "+this.phisicalDamage);
            System.out.println("2. Pocisk ognia: " + (this.magicDamage+5));
            System.out.println("3. Lodowa kula: " + (this.magicDamage+2*this.magicDamage));
            System.out.println("4. Płonący kamień: "+(this.magicDamage+4*this.magicDamage));
            System.out.println("5. Armagedon: Zablokowane");
        }
        else if (this.inteligencja>=20){
            System.out.println("1. Dźgnięcie nożem: "+this.phisicalDamage);
            System.out.println("2. Pocisk ognia: " + (this.magicDamage+5));
            System.out.println("3. Lodowa kula: " + (this.magicDamage+2*this.magicDamage));
            System.out.println("4. Płonący kamień: "+(this.magicDamage+4*this.magicDamage));
            System.out.println("5. Armagedon: "+(this.magicDamage+8*this.magicDamage));
        }
        int val;
        if (this.inteligencja<=10){
            val = odp2();
            switch (val){
                case 2:
                    return this.magicDamage+5;
                default:
                    return this.phisicalDamage;
            }
        }
        else if (this.inteligencja>10 & this.inteligencja <= 15) {
            val = odp3();
            return switch (val) {
                case 2 -> this.magicDamage + 5;
                case 3 -> this.magicDamage + 2 * this.magicDamage;
                default -> this.phisicalDamage;
            };
        }
        else if (this.inteligencja>15 & this.inteligencja <= 20) {
            val = odp4();
            return switch (val) {
                case 2 -> this.magicDamage + 5;
                case 3 -> this.magicDamage + 2 * this.magicDamage;
                case 4 -> this.magicDamage + 4 * this.magicDamage;
                default -> this.phisicalDamage;
            };
        }
        else if (this.inteligencja>20){
            val = odp5();
            return switch (val) {
                case 2 -> this.magicDamage + 5;
                case 3 -> this.magicDamage + 2 * this.magicDamage;
                case 4 -> this.magicDamage + 4 * this.magicDamage;
                case 5 -> this.magicDamage + 8 * this.magicDamage;
                default -> this.phisicalDamage;
            };
        }
    return 0;
    }

}
