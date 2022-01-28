package Heroes;

public class Casual extends Hero {
    public Casual(String name){
        this.name =name;
        this.inteligencja = 4;
        this.zrecznosc = 4;
        this.witalnosc = 4;
        this.sila = 4;
        this.exp = 0;
        this.tworzenie();
    }

}