import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Kot kot = new Kot(10, 20);
        Tygrys tygrys = new Tygrys(10, 20, "zielone");
        Dachowiec dach = new Dachowiec(10, 5, "Czarny");
        Tygrys t2 = new Tygrys(10,25,"niebnieskie");
        Tygrys t3 = new Tygrys(20, 40,"czarne");

        System.out.println(tygrys.compareTo(t2));


        ArrayList<Tygrys> listaT = new ArrayList<>();
        listaT.add(t2);
        listaT.add(tygrys);
        listaT.add(t3);
        System.out.println(listaT);
        listaT.sort(Tygrys::compareTo);
        System.out.println("=============================");
        System.out.println(listaT);
    }
}
