package Heroes;

public class Hero {
    String name;
    public int inteligencja, zrecznosc, witalnosc, sila, exp;
    public Hero(){
        this.name ="NoName";
        this.inteligencja = 0;
        this.zrecznosc = 0;
        this.witalnosc = 0;
        this.sila = 0;
        this.exp = 0;
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
        this.witalnosc++;
        System.out.println("Witalność wzrosla do: "+this.witalnosc);

    }
    public void setSila(){
        this.sila++;
        System.out.println("Sila wzrosla do: "+this.sila);

    }
    public void setExp(int exp){
        this.exp=this.exp+exp;
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

}
