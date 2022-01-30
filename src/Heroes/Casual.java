package Heroes;

public class Casual extends Hero {
    public Casual(String name){
        this.name =name;
        this.inteligencja = 4;
        this.zrecznosc = 4;
        this.witalnosc = 6;
        this.sila = 4;
        this.exp = 0;
        this.phisicalDamage = this.sila*2;
        this.magicDamage = this.inteligencja*2;
        this.maxHealth = this.witalnosc*10;
        this.currentHealth = this.witalnosc*10;
        this.tworzenie();

    }
    public void setWitalnosc(){
        this.witalnosc++;
        System.out.println("Witalność wzrosla do: "+this.witalnosc);
        setMaxHealth();
    }
    public void setInteligencja(){
        this.inteligencja ++;
        this.magicDamage = this.inteligencja*2;
        System.out.println("Inteligencja wzrosla do: "+this.inteligencja);
    }
    public void setSila() {
        this.sila++;
        this.phisicalDamage = this.sila * 2;
        System.out.println("Sila wzrosla do: " + this.sila);
    }
    public void setMaxHealth(){
        this.maxHealth = this.witalnosc*10;
        this.currentHealth = this.maxHealth;
        System.out.println("Twoje Max HP wzrosło do: " +this.maxHealth);
    }

    public int getSkills(){
        if (this.witalnosc<=10){
            System.out.println("1. Dźgnięcie nożem: "+this.phisicalDamage);
            System.out.println("2. Egzystencja: " + (this.phisicalDamage+this.magicDamage));
            System.out.println("3. Plujący podmuch: Zablokowane");
            System.out.println("4. Szybki atak: Zablokowane");
            System.out.println("5. Śmietnikowy atak: Zablokowane");
        }
        else if (this.witalnosc>10 && this.witalnosc < 15){
            System.out.println("1. Dźgnięcie nożem: "+this.phisicalDamage);
            System.out.println("2. Egzystencja: " + (this.phisicalDamage+this.magicDamage));
            System.out.println("3. Plujący podmuch: " + (this.magicDamage + 2 * this.phisicalDamage));
            System.out.println("4. Szybki atak: Zablokowane");
            System.out.println("5. Śmietnikowy atak: Zablokowane");
        }
        else if (this.witalnosc>=15 && this.witalnosc < 20){
            System.out.println("1. Dźgnięcie nożem: "+this.phisicalDamage);
            System.out.println("2. Egzystencja: " + (this.phisicalDamage+this.magicDamage));
            System.out.println("3. Plujący podmuch: " + (this.magicDamage + 2 * this.phisicalDamage));
            System.out.println("4. Szybki atak: "+(this.phisicalDamage * 3 + 3 * this.magicDamage));
            System.out.println("5. Śmietnikowy atak: Zablokowane");
        }
        else if (this.witalnosc>=20){
            System.out.println("1. Dźgnięcie nożem: "+this.phisicalDamage);
            System.out.println("2. Egzystencja: " + (this.phisicalDamage+this.magicDamage));
            System.out.println("3. Plujący podmuch: " + (this.magicDamage + 2 * this.phisicalDamage));
            System.out.println("4. Szybki atak: "+(this.phisicalDamage * 3 + 3 * this.magicDamage));
            System.out.println("5. Śmietnikowy atak: "+(this.phisicalDamage*4 + 4 * this.phisicalDamage));
        }
        int val;
        if (this.witalnosc<=10){
            val = odp2();
            switch (val){
                case 2:
                    return this.phisicalDamage+this.magicDamage;
                default:
                    return this.phisicalDamage;
            }
        }
        else if (this.witalnosc>10 & this.witalnosc <= 15) {
            val = odp3();
            return switch (val) {
                case 2 -> this.phisicalDamage+this.magicDamage;
                case 3 -> this.magicDamage + 2 * this.phisicalDamage;
                default -> this.phisicalDamage;
            };
        }
        else if (this.witalnosc>15 & this.witalnosc <= 20) {
            val = odp4();
            return switch (val) {
                case 2 -> this.phisicalDamage+this.magicDamage;
                case 3 -> this.magicDamage + 2 * this.phisicalDamage;
                case 4 -> this.phisicalDamage *3 + 3 * this.magicDamage;
                default -> this.phisicalDamage;
            };
        }
        else if (this.witalnosc>20){
            val = odp5();
            return switch (val) {
                case 2 -> this.phisicalDamage+this.magicDamage;
                case 3 -> this.magicDamage + 2 * this.phisicalDamage;
                case 4 -> this.phisicalDamage *3 + 3 * this.magicDamage;
                case 5 -> this.phisicalDamage*4 + 4 * this.phisicalDamage;
                default -> this.phisicalDamage;
            };
        }
        return 0;
    }
}