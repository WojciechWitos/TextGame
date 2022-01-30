package Heroes;

public class Barbarian extends Hero{
    public Barbarian(String name){
        this.name =name;
        this.inteligencja = 1;
        this.zrecznosc = 4;
        this.witalnosc = 4;
        this.sila = 8;
        this.exp = 0;
        this.phisicalDamage = this.sila*3;
        this.magicDamage = this.inteligencja;
        this.maxHealth = this.witalnosc*3;
        this.currentHealth = this.witalnosc*3;
        this.tworzenie();

    }
    public void setInteligencja(){
        this.inteligencja ++;
        this.magicDamage = this.inteligencja;
        System.out.println("Inteligencja wzrosla do: "+this.inteligencja);
    }
    public void setMaxHealth(){
        this.maxHealth = this.witalnosc*3;
        this.currentHealth = this.maxHealth;
        System.out.println("Twoje Max HP wzrosło do: " +this.maxHealth);
    }
    public void setWitalnosc(){
        this.witalnosc++;
        System.out.println("Witalność wzrosla do: "+this.witalnosc);
        setMaxHealth();
    }

    public void setSila(){
        this.sila++;
        this.phisicalDamage = this.sila*3;
        System.out.println("Sila wzrosla do: "+this.sila);
    }
    public int getSkills(){
        if (this.sila<=10){
            System.out.println("1. Dźgnięcie nożem: "+this.phisicalDamage);
            System.out.println("2. Podwójny zamach: " + (this.phisicalDamage+5));
            System.out.println("3. Bitewny ryk: Zablokowane");
            System.out.println("4. Wir toporów: Zablokowane");
            System.out.println("5. Krwiożerczy szał: Zablokowane");
        }
        else if (this.sila>10 && this.inteligencja < 15){
            System.out.println("1. Dźgnięcie nożem: "+this.phisicalDamage);
            System.out.println("2. Podwójny zamach: " + (this.phisicalDamage+5));
            System.out.println("3. Bitewny ryk: " + (this.phisicalDamage + 2 * this.phisicalDamage));
            System.out.println("4. Wir toporów: Zablokowane");
            System.out.println("5. Krwiożerczy szał: Zablokowane");
        }
        else if (this.sila>=15 && this.sila < 20){
            System.out.println("1. Dźgnięcie nożem: "+this.phisicalDamage);
            System.out.println("2. Podwójny zamach: " + (this.phisicalDamage+5));
            System.out.println("3. Bitewny ryk: " + this.phisicalDamage + 2 * this.phisicalDamage);
            System.out.println("4. Wir toporów: "+(this.phisicalDamage + 4 * this.phisicalDamage));
            System.out.println("5. Krwiożerczy szał: Zablokowane");
        }
        else if (this.sila>=20){
            System.out.println("1. Dźgnięcie nożem: "+this.phisicalDamage);
            System.out.println("2. Podwójny zamach: " + (this.phisicalDamage+5));
            System.out.println("3. Bitewny ryk: " + (this.phisicalDamage + 2 * this.phisicalDamage));
            System.out.println("4. Wir toporów: "+(this.phisicalDamage + 4 * this.phisicalDamage));
            System.out.println("5. Krwiożerczy szał: "+(this.phisicalDamage + 8 * this.phisicalDamage));
        }
        int val;
        if (this.sila<=10){
            val = odp2();
            switch (val){
                case 2:
                    return this.phisicalDamage+5;
                default:
                    return this.phisicalDamage;
            }
        }
        else if (this.sila>10 & this.sila <= 15) {
            val = odp3();
            return switch (val) {
                case 2 -> this.phisicalDamage+5;
                case 3 -> this.phisicalDamage + 2 * this.phisicalDamage;
                default -> this.phisicalDamage;
            };
        }
        else if (this.sila>15 & this.sila <= 20) {
            val = odp4();
            return switch (val) {
                case 2 -> this.phisicalDamage+5;
                case 3 -> this.phisicalDamage + 2 * this.phisicalDamage;
                case 4 -> this.phisicalDamage + 4 * this.phisicalDamage;
                default -> this.phisicalDamage;
            };
        }
        else if (this.sila>20){
            val = odp5();
            return switch (val) {
                case 2 -> this.phisicalDamage+5;
                case 3 -> this.phisicalDamage + 2 * this.phisicalDamage;
                case 4 -> this.phisicalDamage + 4 * this.phisicalDamage;
                case 5 -> this.phisicalDamage + 8 * this.phisicalDamage;
                default -> this.phisicalDamage;
            };
        }
        return 0;
    }

}
