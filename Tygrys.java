public class Tygrys extends Kot implements Comparable<Tygrys>{



    private String kolorOczu;

    public  Tygrys(int waga, int dlugoscOgona, String kolorOczu){
        super(waga,dlugoscOgona);
        this.kolorOczu = kolorOczu;
        System.out.println("Konstruktor Tygrysa");
    }
    @Override
    public String toString() {
        return "Tygrys{" +"dlugosc ogona"+getDlugoscOgona()+
                "kolorOczu='" + kolorOczu + '\'' +
                '}';
    }

    public String getKolorOczu() {
        return kolorOczu;
    }

    public void setKolorOczu(String kolorOczu) {
        this.kolorOczu = kolorOczu;
    }

    @Override
    public int compareTo(Tygrys tygrys) {
        if(tygrys.getDlugoscOgona()<this.getDlugoscOgona()) {
            return 1;
        }else{
            if(tygrys.getDlugoscOgona()==this.getDlugoscOgona()){
                return 0;
            }else{
                return -1;
            }
        }
    }
}
