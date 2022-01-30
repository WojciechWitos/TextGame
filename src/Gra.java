import Heroes.Barbarian;
import Heroes.Elf;
import Heroes.Hero;
import Heroes.Mage;
import Heroes.Casual;
import java.util.Scanner;
import Monsters.Slime;
import Monsters.Worm;


public class Gra{
    static Hero Postac;
    static Scanner scanner = new Scanner(System.in);
    int result;

    public static void main(String[] args) {
        int lvl = poziom_Trudnosci();
        kreator();
        dodajPunkty(lvl);
        stage1();
    }
    public static void stage2(){
        Worm secondEnemy = new Worm("Potężny robak", 50,100,50,0,0,0);
        System.out.println("");
        System.out.println("Na jego końcu czeka Cię wielka nagroda, ale strzeż się.");
        System.out.println("Labirynt jest wypełniony wszelakiej maści silnymi potworami,");
        System.out.println("Którym musisz stawić czoła.");
        System.out.println("Czy jesteś gotów na tę przygodę?");
        System.out.println("1. Tak!");
        System.out.println("2. Nie! Chcę do domu!");
        System.out.println("3. Nie wiem, ale spróbuję się jej podjąć! Ahoj przygodo!");
        int question = Hero.odp3();
        System.out.println(question);
        switch (question){
            case 1:
                Postac.setWitalnosc();
                System.out.println("Pewny siebie wchodzisz, po czym drzwi zamykają się, a Ty ochoczo idziesz dalej. ");
            case 2:
                Postac.setZrecznosc();
                System.out.println("Drzwi zatrzaskują się za Tobą i pozostajesz tylko Ty i otchłań labiryntu.");
            default:
                Postac.setInteligencja();
                System.out.println("Lekki podmuch przesuwa Cię do przodu a drzwi zamykają się.");
        }
        System.out.println("Po kilku minutach podróży natrafiasz na pierwszego przeciwnika.");
        System.out.println("Jest to mały, niewinny slime, który nagle postanawia się przedstawić");
        System.out.println("Blub... Jestem "+secondEnemy.getName()+" bój się!");
        System.out.println("Co zamierzasz zrobić?");
        System.out.println("1. Wyciągasz miecz i rzucasz się na przeciwnika!");
        System.out.println("2. Zachowujesz ostrożnośc, przygotowując się do walki.");
        question = Hero.odp3();
        switch (question){
            case 1:
                Postac.setPurity(1);
            case 2:
                Postac.setPurity(2);
            default:
                Postac.setPurity(1);
        }
        System.out.println("Slime rzuca się na Ciebie i rozpoczyna się walka!");
        System.out.println("Niech rozpocznie się walka!");
        Combat combat2= new Combat(Postac,secondEnemy);

        int result = combat2.Fight();
        if (result==2){
            addPoint();
            Postac.currentHealth = Postac.maxHealth;
            System.out.println("Jeszcze tu wrócę! BLOOOOP!");
            System.out.println("Slime rozpływa się i znika w powietrzu.");
        }
        else if (result == 1){
            System.out.println("Ty i twój przeciwnik leżycie na przeciw siebie, wydajecie ostatnie tchnienie.");
            System.out.println("Wielki bohater poległ już na pierwszej przeszkodzie.");

        }
        else{
            System.out.println("Jako bohater, który dopiero zaczął swoją przygodę odchodzisz w zaświaty bez sławy i chwały.");
            System.out.println("Aż prosi się o słowa 'Tak bardzo się starałeś, lecz z gry wyleciałeś :) '");
            System.exit(0);
        }

    }




    public static void stage1(){
        Slime firstEnemy = new Slime("Mała Bestia",20,2,0,0,0,0);
        System.out.println("Cześć " + Postac.getName() + " witaj w wielkim labiryncie,");
        System.out.println("Na jego końcu czeka Cię wielka nagroda, ale strzeż się.");
        System.out.println("Labirynt jest wypełniony wszelakiej maści silnymi potworami,");
        System.out.println("Którym musisz stawić czoła.");
        System.out.println("Czy jesteś gotów na tę przygodę?");
        System.out.println("1. Tak!");
        System.out.println("2. Nie! Chcę do domu!");
        System.out.println("3. Nie wiem, ale spróbuję się jej podjąć! Ahoj przygodo!");
        int question = Hero.odp3();
        System.out.println(question);
        switch (question){
            case 1:
                Postac.setWitalnosc();
                System.out.println("Pewny siebie wchodzisz, po czym drzwi zamykają się, a Ty ochoczo idziesz dalej. ");
            case 2:
                Postac.setZrecznosc();
                System.out.println("Drzwi zatrzaskują się za Tobą i pozostajesz tylko Ty i otchłań labiryntu.");
            default:
                Postac.setInteligencja();
                System.out.println("Lekki podmuch przesuwa Cię do przodu a drzwi zamykają się.");
        }
        System.out.println("Po kilku minutach podróży natrafiasz na pierwszego przeciwnika.");
        System.out.println("Jest to mały, niewinny slime, który nagle postanawia się przedstawić");
        System.out.println("Blub... Jestem "+firstEnemy.getName()+" bój się!");
        System.out.println("Co zamierzasz zrobić?");
        System.out.println("1. Wyciągasz miecz i rzucasz się na przeciwnika!");
        System.out.println("2. Zachowujesz ostrożnośc, przygotowując się do walki.");
        question = Hero.odp3();
        switch (question){
            case 1:
                Postac.setPurity(1);
            case 2:
                Postac.setPurity(2);
            default:
                Postac.setPurity(1);
        }
        System.out.println("Slime rzuca się na Ciebie i rozpoczyna się walka!");
        System.out.println("Niech rozpocznie się walka!");
        Combat combat1= new Combat(Postac,firstEnemy);

        int result = combat1.Fight();
        if (result==2){
            addPoint();
            Postac.currentHealth = Postac.maxHealth;
            System.out.println("Jeszcze tu wrócę! BLOOOOP!");
            System.out.println("Slime rozpływa się i znika w powietrzu.");
        }
        else if (result == 1){
            System.out.println("Ty i twój przeciwnik leżycie na przeciw siebie, wydajecie ostatnie tchnienie.");
            System.out.println("Wielki bohater poległ już na pierwszej przeszkodzie.");

        }
        else{
            System.out.println("Jako bohater, który dopiero zaczął swoją przygodę odchodzisz w zaświaty bez sławy i chwały.");
            System.out.println("Aż prosi się o słowa 'Tak bardzo się starałeś, lecz z gry wyleciałeś :) '");
            System.exit(0);
        }

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
        System.out.println("1. Mage (int+++ hp++)");
        System.out.println("2. Barbarzyńca (sila++ hp+)");
        System.out.println("3. Elf (zwinnosc+++)");
        System.out.println("4. Casual (witalnosc+++++");

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


