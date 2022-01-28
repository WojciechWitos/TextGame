import Heroes.Barbarian;
import Heroes.Elf;
import Heroes.Hero;
import Heroes.Mage;
import Heroes.Casual;
import java.util.Scanner;

public class Gra{
    static Hero Postac;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int lvl = poziom_Trudnosci();
        kreator();
        dodajPunkty(lvl);





    }

    public static void dodajPunkty(int punkty){
        for (int i=0; i<punkty;i++){
            System.out.println("Punkty do rozdania: " + punkty);
            addPoint();
        }
    }
    public static void addPoint(){
        System.out.println("1. Sila: "+Postac.sila);
        System.out.println("2. Witalnosc: " +Postac.witalnosc);
        System.out.println("3. Inteligencja: " +Postac.inteligencja);
        System.out.println("4. Zrecznosc: " + Postac.zrecznosc);
        int odp = scanner.nextInt();
        switch(odp){
            case 1:
                Postac.setSila();
            case 2:
        }
    }

    public static void kreator(){
        System.out.println("Wybierz swoją postać: ");
        System.out.println("1. Mage (int+++)");
        System.out.println("2. Barbarzyńca (sila++ hp+)");
        System.out.println("3. Elf (zwinnosc+++)");
        System.out.println("4. Normalna");
        int odp = scanner.nextInt();
        System.out.println("Podaj imie dla swojej postaci: ");
        String nazwa = scanner.nextLine();
        switch (odp) {
            case 1 -> createMage(nazwa);
            case 2 -> createBarbarian(nazwa);
            case 3 -> createElf(nazwa);
            default -> createCasual(nazwa);
        }

    }


    private static void createMage(String nazwa){
        Postac = new Mage(nazwa);
    }
    private static void createBarbarian(String nazwa){
        Postac = new Barbarian(nazwa);
    }
    private static void createElf(String nazwa){
        Postac = new Elf(nazwa);
    }
    private static void createCasual(String nazwa){
        Postac = new Casual(nazwa);
    }


    private static int poziom_Trudnosci() {
        System.out.println("Wybierz pozioom trudności(default easy):");
        System.out.println("1. Easy (10)");
        System.out.println("2. Normal (5)");
        System.out.println("3. Hard (2)");
        int odp = scanner.nextInt();
        return switch (odp) {
            case 2 -> 5;
            case 3 -> 2;
            default -> 10;
        };

    }
}


