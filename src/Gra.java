import Heroes.*;
import Monsters.*;
import java.util.Scanner;
import java.lang.Thread;

public class Gra {
    static Hero Postac;
    static Scanner scanner = new Scanner(System.in);
    int result;

    public static void main(String[] args) {
        int lvl = poziom_Trudnosci();
        kreator();
        dodajPunkty(lvl);
        stage1();
        stage2();
        stage3();
        stage4();
        stage5();
    }

    

    public static void stage5() {
        int question;
        LittleDemon thirdEnemy = new LittleDemon("Potężny robak", 120, 150, 20, 0, 0, 0);
        System.out.println("Po odejściu od zwłok nagle słyszysz jakby coś krązyło i skrzeczało pod sufitem.");
        System.out.println("Po chwili widzisz wielkiego orła pikującego w Twoim kierunku z wygłodniałym wściekłym wzrokiem.");
        System.out.println("Okazało się ze wilk którego spożywasz chwile wcześniej pożywił sie jajami orlicy,która nie jest zadowolona i obwinia Ciebie za skonsumowanie jej potomstywa.");
        System.out.println("Dodatkowo nie widziała świeżego mięsa od pół roku..");
        System.out.println("Bitwa od razu się rozpoczyna!");
        Combat combat4 = new Combat(Postac, thirdEnemy);

        int result = combat4.Fight();
        if (result == 2) {
            addPoint();
            Postac.currentHealth = Postac.maxHealth;
            System.out.println("Ptaszysko pada martwe u twych stóp");

            question = Hero.odp3();

            System.out.println("1. Postanawiasz wyrwac piura ze zwłok orła umieszczając je w swoim ubiorze.");
            System.out.println("2. Podpalasz kolejną ofiarę, nie chcąc aby zapach jej zwłok sprowadził kolejne kłopoty.");
            System.out.println("3. Uciekasz czym prędzej.");
            switch (question) {
                case 1:
                    Postac.setPurity(-2);
                    Postac.setSila();
                    Postac.setWitalnosc();
                case 2:
                    Postac.setPurity(5);
                    Postac.setInteligencja();
                    Postac.setWitalnosc();
                default:
                    Postac.setPurity(2);
                    Postac.setInteligencja();
                    Postac.setZrecznosc();
            }
        }
        else if (result == 1) {
            System.out.println("Ty i twój przeciwnik leżycie na przeciw siebie, wydajecie ostatnie tchnienie.");
            System.out.println("Wielki bohater poległ na czwartej przeszkodzie, niedaleko swego celu, widząc nieopodal drzwi.");

        } else {
            System.out.println("Zaszedłeś już tak daleko, wiedziałeś, że twoja podróż już miała się niedługo zakończyć.");
            System.out.println("Niestety, kończy się tu i teraz, odchodzisz z tego świata z łzami w oczach.");
            System.exit(0);
        }
    }


    public static void stage4() {
        int question;
        Eagle thirdEnemy = new Eagle("Potężny robak", 120, 150, 20, 0, 0, 0);
        System.out.println("Po odejściu od zwłok nagle słyszysz jakby coś krązyło i skrzeczało pod sufitem.");
        System.out.println("Po chwili widzisz wielkiego orła pikującego w Twoim kierunku z wygłodniałym wściekłym wzrokiem.");
        System.out.println("Okazało się ze wilk którego spożywasz chwile wcześniej pożywił sie jajami orlicy,która nie jest zadowolona i obwinia Ciebie za skonsumowanie jej potomstywa.");
        System.out.println("Dodatkowo nie widziała świeżego mięsa od pół roku..");
        System.out.println("Bitwa od razu się rozpoczyna!");
        Combat combat4 = new Combat(Postac, thirdEnemy);

        int result = combat4.Fight();
        if (result == 2) {
            addPoint();
            Postac.currentHealth = Postac.maxHealth;
            System.out.println("Ptaszysko pada martwe u twych stóp");

            question = Hero.odp3();

            System.out.println("1. Postanawiasz wyrwac piura ze zwłok orła umieszczając je w swoim ubiorze.");
            System.out.println("2. Podpalasz kolejną ofiarę, nie chcąc aby zapach jej zwłok sprowadził kolejne kłopoty.");
            System.out.println("3. Uciekasz czym prędzej.");
            wait(2000);
            switch (question) {
                case 1:
                    Postac.setPurity(-2);
                    Postac.setSila();
                    Postac.setWitalnosc();
                case 2:
                    Postac.setPurity(5);
                    Postac.setInteligencja();
                    Postac.setWitalnosc();
                default:
                    Postac.setPurity(2);
                    Postac.setInteligencja();
                    Postac.setZrecznosc();
            }
        }
        else if (result == 1) {
            System.out.println("Ty i twój przeciwnik leżycie na przeciw siebie, wydajecie ostatnie tchnienie.");
            System.out.println("Wielki bohater poległ na czwartej przeszkodzie, niedaleko swego celu, widząc nieopodal drzwi.");

        } else {
            System.out.println("Zaszedłeś już tak daleko, wiedziałeś, że twoja podróż już miała się niedługo zakończyć.");
            System.out.println("Niestety, kończy się tu i teraz, odchodzisz z tego świata z łzami w oczach.");
            System.exit(0);
        }
    }

    public static void stage3() {
        Wolf thirdEnemy = new Wolf("Potężny robak", 100, 100, 10, 0, 0, 0);
        System.out.println("Wychodzisz z walki zwycięsko, cieszysz się, że przeżyłeś, zastanawiając się, co czeka Cię dalej.");
        System.out.println("Wielki labirynt może zaskoczyć pod każdym względem.");
        System.out.println("Dopada Cię burczenie w brzuchu, a jedyne co może zostać przez Ciebie skonsumowane, to zwłoki wilka, który stoi tuż przed Tobą");
        System.out.println("Tak czy owak, musisz go pokonać, więc:");
        System.out.println("1. Szykujesz się do bitwy");
        System.out.println("2. Próbujesz wyminąć przeciwnika");
        int question = Hero.odp2();
        System.out.println(question);
        switch (question) {
            case 1:
                System.out.println("Wyjmujesz swoją broń, będąc gotowym do walki.");
                Postac.setWitalnosc();
            default:
                System.out.println("Próbujesz wyminąć przeciwnika, lecz nie jest to łatwe, zauważa Cie i rzuca się na Ciebie.");
                Postac.setZrecznosc();
        }


        System.out.println("Niech rozpocznie się walka!");
        Combat combat3 = new Combat(Postac, thirdEnemy);

        int result = combat3.Fight();
        if (result == 2) {
            addPoint();
            Postac.currentHealth = Postac.maxHealth;
            System.out.println("Wilk wyje po raz ostatni, a Ty dobijasz go ostatnim ciosem.");


            question = Hero.odp3();

            System.out.println("1. Postanawiasz zjeść zwłoki swego przeciwnika bez zastanowienia.");
            System.out.println("2. Opiekasz wilka, po czym konsumujesz go powoli zostawiając prowiant na później");
            System.out.println("3. Niegodne jest jedzenie takiej bestii, podpalasz ją dając jej godne odejście z tego świata.");
            switch (question) {
                case 1:
                    System.out.println("Nie mając zbyt dużego wyboru spożywasz surowe wilcze mięso.");
                    Postac.setPurity(-5);
                case 2:
                    Postac.setPurity(2);
                default:
                    Postac.setPurity(5);
            }
        }
        else if (result == 1) {
            System.out.println("Ty i twój przeciwnik leżycie na przeciw siebie, wydajecie ostatnie tchnienie.");
            System.out.println("Wielki bohater poległ na trzeciej przeszkodzie, niedaleko swego celu");

        } else {
            System.out.println("Zaszedłeś już tak daleko, wiedziałeś, że twoja podróż już miała się niedługo zakończyć.");
            System.out.println("Niestety, kończy się tu i teraz, odchodzisz z tego świata z łzami w oczach.");
            System.exit(0);
        }
    }


    public static void stage2() {
        Worm secondEnemy = new Worm("Potężny robak", 50, 100, 50, 0, 0, 0);
        System.out.println("Z ulgą po pokonaniu pierwszego przeciwnika rozglądasz się wkoło oceniajac swoją sytuacje.");
        System.out.println("Wszystkie ściany labiryntu wydaja się takie same.");
        System.out.println("Nagle zauważasz że przy jednej z nich pełznie stado karaluchów.");
        System.out.println("Postanawiasz iśc za nimi licząc ze doprowadza cie do wyjscia.");
        System.out.println("W pewnym momencie słyszysz jakby skrobanie i ku Twojemu zdziwiniu ukazuje Ci się coś co wygląda na przeośnietą gąsienice polączona z skolopendrą");
        System.out.println("1. Szykujesz się do bitwy");
        System.out.println("2. Stoisz sparaliżowany ze strachu");
        int question = Hero.odp2();
        System.out.println(question);
        switch (question) {
            case 1:
                Postac.setWitalnosc();
                System.out.println("Wyjmujesz swoją broń, będąc gotowym do walki.");
            default:
                System.out.println("Przeciwnik rzuca się na Ciebie, a Ty nieprzygotowany stawiasz mu czoła");
        }




        System.out.println("Potwór rzuca się na Ciebie i rozpoczyna się walka!");
        System.out.println("Niech rozpocznie się walka!");
        Combat combat2 = new Combat(Postac, secondEnemy);

        int result = combat2.Fight();
        if (result == 2) {
            addPoint();
            Postac.currentHealth = Postac.maxHealth;
            System.out.println("Umierając potwór wydaje ostatnie słowa:");
            System.out.println("Mój Paaaaaan. Pssssss.... Cię Pokonaaaaaa...");
            wait(2000);
            question = Hero.odp3();

            System.out.println("1. To jeszcze się okaże- uśmiechasz się i ruszasz przed siebie.");
            System.out.println("2. Z przerażeniem patrzysz na swojego przeciwnika, cicho próbując przedz na przód.");
            System.out.println("3. Wzdychasz lekko i maszerujesz przed siebie.");
            switch (question) {
                case 1:
                    Postac.setPurity(1);
                case 2:
                    Postac.setPurity(3);
                default:
                    Postac.setPurity(1);
            }
        } else if (result == 1) {
            System.out.println("Ty i twój przeciwnik leżycie na przeciw siebie, wydajecie ostatnie tchnienie.");
            System.out.println("Wielki bohater poległ na drugiej przeszkodzie.");

        } else {
            System.out.println("Jako bohater, który dopiero pokonał pierwszego przeciwnika odchodzisz w zaświaty bez sławy i chwały.");
            System.out.println("Aż prosi się o słowa 'Tak bardzo się starałeś, lecz z gry wyleciałeś :) '");
            System.exit(0);
        }

    }


    public static void stage1() {
        Slime firstEnemy = new Slime("Mała Bestia", 20, 2, 0, 0, 0, 0);
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
        switch (question) {
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
        System.out.println("Blub... Jestem " + firstEnemy.getName() + " bój się!");
        System.out.println("Co zamierzasz zrobić?");
        System.out.println("1. Wyciągasz broń i rzucasz się na przeciwnika!");
        System.out.println("2. Zachowujesz ostrożnośc, przygotowując się do walki.");
        question = Hero.odp3();
        switch (question) {
            case 1:
                Postac.setPurity(1);
            case 2:
                Postac.setPurity(2);
            default:
                Postac.setPurity(1);
        }
        System.out.println("Slime rzuca się na Ciebie i rozpoczyna się walka!");
        System.out.println("Niech rozpocznie się walka!");
        Combat combat1 = new Combat(Postac, firstEnemy);

        int result = combat1.Fight();
        if (result == 2) {
            addPoint();
            Postac.currentHealth = Postac.maxHealth;
            System.out.println("Jeszcze tu wrócę! BLOOOOP!");
            System.out.println("Slime rozpływa się i znika w powietrzu.");

        } else if (result == 1) {
            System.out.println("Ty i twój przeciwnik leżycie na przeciw siebie, wydajecie ostatnie tchnienie.");
            System.out.println("Wielki bohater poległ już na pierwszej przeszkodzie.");

        } else {
            System.out.println("Jako bohater, który dopiero zaczął swoją przygodę odchodzisz w zaświaty bez sławy i chwały.");
            System.out.println("Aż prosi się o słowa 'Tak bardzo się starałeś, lecz z gry wyleciałeś :) '");
            System.exit(0);
        }

    }

    public static void wait(int liczba) {
        try {
            Thread.sleep(2000);
        }
        catch(Exception e) {
        System.out.println(e);
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


