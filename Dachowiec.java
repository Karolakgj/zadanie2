public class Dachowiec extends  Kot {



    private String umaszczenie;
    public Dachowiec(int waga, int dlugoscOgona, String umaszczenie) {
        super(waga, dlugoscOgona);
        this.umaszczenie = umaszczenie;
        System.out.println("Kontsruktor dachowiec");
    }
    @Override
    public String toString() {
        return "Dachowiec{" +
                "umaszczenie='" + umaszczenie + '\'' +
                '}';
    }

    public String getUmaszczenie() {
        return umaszczenie;
    }

    public void setUmaszczenie(String umaszczenie) {
        this.umaszczenie = umaszczenie;
    }
}
