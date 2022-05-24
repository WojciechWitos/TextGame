package Heroes;
import java.util.Scanner;
public abstract class Hero {
    static Scanner scanner = new Scanner(System.in);
    String name;
    public int inteligencja, zrecznosc, witalnosc, sila, exp, purity,phisicalDamage,magicDamage,maxHealth,currentHealth;
    public Hero(){
        this.name ="NoName";
        this.inteligencja = 0;
        this.zrecznosc = 0;
        this.witalnosc = 0;
        this.sila = 0;
        this.exp = 0;
        this.purity = 0;
    }

    public String getName(){
        return this.name;
    }
    public void setCurrentHealth(int dmg){
        this.currentHealth=this.currentHealth-dmg;
    }
    public void setInteligencja(){
        this.inteligencja ++;
        System.out.println("Inteligencja wzrosla do: "+this.inteligencja);
    }
    public void setZrecznosc(){
        this.zrecznosc++;
        System.out.println("Zrecznosc wzrosla do: "+this.zrecznosc);
    }
    public void setWitalnosc(){
        System.out.println("Not implemented yet");}

    public void setSila(){
        this.sila++;
        System.out.println("Sila wzrosla do: "+this.sila);

    }
    public void setExp(int exp){
        this.exp=this.exp+exp;
        System.out.println("Otrzymałeś "+exp+" doświadczenia.");
        System.out.println("Teraz posiadasz " + this.exp);
    }
    public int getHealth(){
        return this.currentHealth;
    }

    public int getSkills(){
        System.out.println("Skills not defined");
        return 0;
    }
    public void setPurity(int pur){
        this.purity += pur;
    }
    public void tworzenie(){
        System.out.println("Stworzyles postac o imieniu: " +this.name);
        System.out.println("Oto jej statystyki: ");
        this.stats();
    }
    private void stats(){
        System.out.println("Sila: " +this.sila);
        System.out.println("Witalnosc: " +this.witalnosc);
        System.out.println("Inteligencja: " +this.inteligencja);
        System.out.println("Zrecznosc: " + this.zrecznosc);
    }
    public static int odp2(){
        boolean creator = true;
        while (creator) {
            String odp = scanner.nextLine();
            try {
                switch (Integer.parseInt(odp)) {
                    case 1:
                        creator = false;
                        return 1;
                    default:
                        creator = false;
                        return 2;
                }
            } catch(Exception X){
                System.out.println("Podaj wartość od 1 do 2");
            }

        }
        return 0;
    }
    public static int odp3(){
        boolean creator = true;
        while (creator) {
            String odp = scanner.nextLine();
            try {
                switch (Integer.parseInt(odp)) {
                    case 1:
                        creator = false;
                        return 1;
                    case 2:
                        creator = false;
                        return 2;
                    default:
                        creator = false;
                        return 3;
                }
            } catch(Exception X){
                System.out.println("Podaj wartość od 1 do 3");
            }

        }
        return 0;
    }
    public static int odp4(){
        boolean creator = true;
        while (creator) {
            String odp = scanner.nextLine();
            try {
                switch (Integer.parseInt(odp)) {
                    case 1:
                        creator = false;
                        return 1;
                    case 2:
                        creator = false;
                        return 2;
                    case 3:
                        creator = false;
                        return 3;
                    default:
                        creator = false;
                        return 4;
                }
            } catch(Exception X){
                System.out.println("Podaj wartość od 1 do 4");
            }

        }
        return 0;
    }
    public static int odp5(){
        boolean creator = true;
        while (creator) {
            String odp = scanner.nextLine();
            try {
                switch (Integer.parseInt(odp)) {
                    case 1:
                        creator = false;
                        return 1;
                    case 2:
                        creator = false;
                        return 2;
                    case 3:
                        creator = false;
                        return 3;
                    case 4:
                        creator = false;
                        return 4;
                    default:
                        creator = false;
                        return 5;
                }
            } catch(Exception X){
                System.out.println("Podaj wartość od 1 do 5");
            }

        }
        return 0;
    }

}
