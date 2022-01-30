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
        wait(2000);
        stage2();
        wait(2000);
        stage3();
        wait(2000);
        stage4();
        wait(2000);
        stage5();
        wait(2000);
        stage6();

    }
    public static void stage6() {
        int question;
        PureEvil sixthEnemy = new PureEvil("Diavola", 1, 200, 15, 0, 0, 0);
        System.out.println("Lilith odeszła, więc ze spokojem przechodzisz przez drzwi licząc na chwilę wytchnienia.");
        System.out.println("Niestety, życie w tym labiryncie nie jest tak proste.");
        System.out.println("Zaraz po tym, gdy twoje oczy przywykły do blasku pomieszczenia widzisz potwora.");
        wait(2000);
        System.out.println("Zastygasz z przerażenia, a potwór rzuca się na Ciebie");
        Combat combat6 = new Combat(Postac, sixthEnemy);
        int result = combat6.Fight();
        wait(2000);
        System.out.println("Jednak zostawię Cię mojemu Panu na przekąskę, macie pewne sprawy do wyrównania.");
        System.out.println("W tem w miejsce demona pojawia się znajoma Ci postać, lecz czujesz bijącą od niej aurę.");
        System.out.println("Aurę złowrogości, rządzy mordu.");
        System.out.println("Pot spływa po policzkach a kolana uginają się pod ciężarem twojego ciała.");
        System.out.println("Ukazuje się on, twój pierwszy przeciwnik.");
        wait(5000);
        System.out.println("A więc liczyłeś, że więcej sie nie spotkamy?");
        System.out.println("Może i na początko labiryntu spotkałeś mnie słabego, ale tutaj, oj tutaj to ja mam władzę!");
        System.out.println("Słyszysz jak Slime rechocze głośno.");
        System.out.print("Swoją drogą jak masz na imię moja przyszła ofiaro?");
        wait(2000);
        System.out.println("1. Przedstaw się");
        System.out.println("2. Szykujesz się do walki i atakujesz potwora");
        System.out.println("3. Nie ogarniasz co się w ogóle dzieje.");
        question = Hero.odp3();

        switch (question) {
            case 1:
                System.out.println("Jestem "+Postac.getName()+" twój najgorszy koszmar!!!");
                Postac.setPurity(+10);
                for (int i=0; i<10;i++) {
                    Postac.setSila();
                    Postac.setWitalnosc();
                    Postac.setInteligencja();
                    Postac.setWitalnosc();
                }
            case 2:
                Postac.setPurity(5);
                Postac.setInteligencja();
                Postac.setWitalnosc();
            default:
                Postac.currentHealth-=10;
        }
        System.out.println("A więc stańmy do walki!");
        Slime2 finalBoss = new Slime2("Płonący król piekieł",300,300,20,0,0,0);
        Combat combat7 = new Combat(Postac,finalBoss);
        result = combat7.Fight();
        if (result == 2) {
            for(int i=0; i<10;i++) {
                addPoint();
            }
            Postac.currentHealth = Postac.maxHealth;
            System.out.println("Pokonawszy potwora, wiesz, że to już koniec twojej podróży.");
            System.out.println("Teraz zostaniesz osądzony w zależności od twoich poczynań.");
            wait(2000);
            if (Postac.purity<0){
                System.out.println("Za nieczyste poczynania nie czeka Cię żadna nagroda, lecz uchodzisz wolno z Wielkiego Labiryntu.");
                System.exit(0);
            }
            else if(Postac.purity>=0 && Postac.purity<10){
                System.out.println("Czujesz jak niebiańskie światło spływa na Ciebie a twoim oczom ukazuje się anioł.");
                System.out.println("Otrzymujesz od niego dodatkowe zdolnosci o których inni bohaterowie mogliby pomarzyć.");
                System.out.println("Opuszczasz wielki labirynt jako zwycięzca i od tej pory prowadzisz spokojne życie.");
                System.exit(0);
            }
            else{
                System.out.println("Zstąpił anioł z nieba i obdarował Cię trzema życzeniami, które spełni dla Ciebie.");
                System.out.println("Nie ma żadnych ograniczeń, więc żądasz nieskończonych życzeń.");
                System.out.println("Opuszczasz Wielki Labirynt jako nowy PAN tego świata.");
                System.exit(0);

            }
        }
        else if (result == 1) {
            System.out.println("Slime pada, a Ty wydajesz ostatnie tchnienie.");
            System.out.println("Ostatecznie zostałeś pokonany i twój los został przypieczętowany.");
            System.out.println("Jednak jesteś dumny, że zginąłeś z rąk potężnego potwora.");
            System.exit(0);


        } else {
            System.out.println("Już byłeś tak blisko, niestety, niepodołałeś.");
            System.out.println("Rechocząco Slime łapie Cię za nogę i mówi:");
            System.out.println("Jestem tym, który Cię pokonał "+finalBoss.getName()+ " zawsze wygrywa.");
            System.out.println("Zostajesz pożarty i ostatecznie opuszczasz ten świat.");
            System.exit(0);
        }
    }


    public static void stage5() {
        int question;
        LittleDemon fifthEnemy = new LittleDemon("Lilith -Świetlisty Demon", 180, 200, 15, 0, 0, 0);
        System.out.println("Pokonałeś ostatniego wroga, czujesz jak ciepłe światło ogrzewa twe policzki.");
        System.out.println("Widzisz rozświetlone drzwi, zbliżasz się do nich, a pewna postura zakrywa blask.");
        System.out.println("Twoim oczom pojawia się humanoidalna postać.");
        wait(2000);
        System.out.println("Cześć, jestem Lilith, wysłannik piekieł, zapewne interesuje Cię co jest za drzwiami. ");
        System.out.println("A słyszałeś może powiedzenie, że ciekawość to pierwszy stopień do piekła?:)");

        System.out.println("Szykuj się do walki, jeżeli chcesz przejść dalej!");
        Combat combat5 = new Combat(Postac, fifthEnemy);
        int result = combat5.Fight();
        if (result == 2) {
            for(int i=0; i<10;i++) {
                addPoint();
            }
            Postac.currentHealth = Postac.maxHealth;
            System.out.println("Postać pada na twarz, uśmiechając się szyderczo mówi:");
            System.out.println("Na końcu czeka Cię śmierć, śmierć i tylko śmierć, mój Pan nie zna litości!");
            System.out.println("To ostatnia chwila, abyś mógł uciec.");

            System.out.println("1. Przechodzisz omijajac powoli demona w strachu przed możliwymi klątwami.");
            System.out.println("2. Kopiesz demona i przesz przed siebie");
            System.out.println("3. Przerażony uciekasz w popłochu.");
            question = Hero.odp3();
            switch (question) {
                case 1:
                    Postac.setPurity(-5);
                    Postac.setSila();
                    Postac.setWitalnosc();
                case 2:
                    Postac.setPurity(5);
                    Postac.setInteligencja();
                    Postac.setWitalnosc();
                default:
                    Postac.setPurity(2);
            }
        }
        else if (result == 1) {
            System.out.println("Koniec się zbliża, pocieszasz się myślą, że bestia z którą walczyłeś umarła.");
            System.out.println("Jednak nie do końca, słyszysz od niej słowa: ");
            System.out.println("Jestem: "+fifthEnemy.getName()+" zginąć z twoich rąk.");
            System.exit(0);


        } else {
            System.out.println("Tak blisko celu, wręcz o krok od opuszczenia tego piekielnego miejsca.");
            System.out.println("Niestety, kończy się tu i teraz twoja przygoda, odchodzisz z tego świata z łzami w oczach.");
            System.exit(0);
        }
    }


    public static void stage4() {
        int question;
        Eagle thirdEnemy = new Eagle("Latająca bestia", 120, 150, 20, 0, 0, 0);
        System.out.println("Po odejściu od zwłok nagle słyszysz jakby coś krązyło i skrzeczało pod sufitem.");
        wait(3000);
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




            System.out.println("1. Postanawiasz wyrwac piura ze zwłok orła umieszczając je w swoim ubiorze.");
            System.out.println("2. Podpalasz kolejną ofiarę, nie chcąc aby zapach jej zwłok sprowadził kolejne kłopoty.");
            System.out.println("3. Uciekasz czym prędzej.");
            question = Hero.odp3();
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
            System.exit(0);
        } else {
            System.out.println("Zaszedłeś już tak daleko, wiedziałeś, że twoja podróż już miała się niedługo zakończyć.");
            System.out.println("Niestety, kończy się tu i teraz, odchodzisz z tego świata z łzami w oczach.");
            System.exit(0);
        }
    }

    public static void stage3() {
        Wolf thirdEnemy = new Wolf("Białooki wilk", 100, 100, 10, 0, 0, 0);
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

            System.out.println("1. Postanawiasz zjeść zwłoki swego przeciwnika bez zastanowienia.");
            System.out.println("2. Opiekasz wilka, po czym konsumujesz go powoli zostawiając prowiant na później");
            System.out.println("3. Niegodne jest jedzenie takiej bestii, podpalasz ją dając jej godne odejście z tego świata.");

            question = Hero.odp3();
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
            System.exit(0);
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


            System.out.println("1. To jeszcze się okaże- uśmiechasz się i ruszasz przed siebie.");
            System.out.println("2. Z przerażeniem patrzysz na swojego przeciwnika, cicho próbując przedz na przód.");
            System.out.println("3. Wzdychasz lekko i maszerujesz przed siebie.");
            question = Hero.odp3();
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
            System.exit(0);
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
            wait(2000);

        } else if (result == 1) {
            System.out.println("Ty i twój przeciwnik leżycie na przeciw siebie, wydajecie ostatnie tchnienie.");
            System.out.println("Wielki bohater poległ już na pierwszej przeszkodzie.");
            System.exit(0);
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


