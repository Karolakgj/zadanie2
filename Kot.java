public class Kot {
    private int waga;
    private int dlugoscOgona;

    public int getWaga() {
        return waga;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }

    public int getDlugoscOgona() {
        return dlugoscOgona;
    }

    public void setDlugoscOgona(int dlugoscOgona) {
        this.dlugoscOgona = dlugoscOgona;
    }



    public Kot(int waga, int dlugoscOgona){
        this.waga = waga;
        this.dlugoscOgona = dlugoscOgona;
        System.out.println("Konstruktor Kota");
    }

    @Override
    public String toString() {
        return "Kot{" +
                "waga=" + waga +
                ", dlugoscOgona=" + dlugoscOgona +
                '}';
    }
}
