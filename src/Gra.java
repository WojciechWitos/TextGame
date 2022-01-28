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
        stage1();




    }
    public static void stage1(){
        System.out.println();




    }




    public static void dodajPunkty(int punkty){
        System.out.println("Punkty do rozdania: " + punkty);
        for (int i=0; i<punkty;i++){
            addPoint();
        }
    }
    public static void addPoint() {
        System.out.println("1. Sila: " + Postac.sila);
        System.out.println("2. Witalnosc: " + Postac.witalnosc);
        System.out.println("3. Inteligencja: " + Postac.inteligencja);
        System.out.println("4. Zrecznosc: " + Postac.zrecznosc);
        boolean wyjsc = true;
        while (wyjsc) {
            int odp = scanner.nextInt();
            switch (odp) {
                case 1:
                    Postac.setSila();
                    wyjsc = false;
                    break;
                case 2:
                    Postac.setWitalnosc();
                    wyjsc = false;
                    break;
                case 3:
                    Postac.setInteligencja();
                    wyjsc = false;
                    break;
                case 4:
                    Postac.setZrecznosc();
                    wyjsc = false;
                    break;
                default:
                    break;

            }
        }
    }

    public static void kreator(){
        System.out.println("Podaj imie dla swojej postaci: ");
        String pusty = scanner.nextLine();
        String nazwa = scanner.nextLine();

        System.out.println("Wybierz swoją postać: ");
        System.out.println("1. Mage (int+++)");
        System.out.println("2. Barbarzyńca (sila++ hp+)");
        System.out.println("3. Elf (zwinnosc+++)");
        System.out.println("4. Normalna");

        boolean creator = true;
        while (creator) {
            String odp = scanner.nextLine();
            try {
                switch (Integer.parseInt(odp)) {
                    case 1:
                        createMage(nazwa);
                        creator = false;
                        break;

                    case 2:
                        createBarbarian(nazwa);
                        creator = false;
                        break;
                    case 3:
                        createElf(nazwa);
                        creator = false;
                        break;
                    default:
                        creator = false;
                        createCasual(nazwa);
                }
            } catch(Exception X){
                System.out.println("Podaj wartość od 1 do 4");
            }

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


