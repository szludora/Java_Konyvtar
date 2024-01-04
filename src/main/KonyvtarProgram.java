package main;

import java.util.List;
import modell.Regeny;
import modell.RegenyTipusok;
import modell.Konyvtar;
import modell.Allapotok;
import modell.Kepregeny;
import modell.Konyv;

public class KonyvtarProgram {

    private final Konyvtar konyvtar;

    public static void main(String[] args) {
        new KonyvtarProgram();
    }

    public KonyvtarProgram() {
        //KÉPREGÉNY:     szerző, cím, állapot, oldalszám, kép db
        //REGÉNY:        szerző, cím, állapot, oldalszám, regénytípusa
        konyvtar = new Konyvtar();
        konyvtar.beszerez(new Kepregeny("Anonim"));
        konyvtar.visszavesz(new Regeny("Szoboszlai Mate", "Az elet meg minden", Allapotok.KIVALO, 120, RegenyTipusok.FEJLODES));
        konyvtar.visszavesz(new Kepregeny("Seres Gyorgy", "Szerelmes hangok", Allapotok.UJSZERU, 120));
        konyvtar.visszavesz(new Regeny("Keseru Anna", "A nyul, a farkas, meg az allatkert"));
        konyvtar.visszavesz(new Regeny("Toth Ilona"));

        konyvtarKonyveiKiir();
        // System.out.println(konyvtar.getKonyvek());
    }

    private void konyvtarKonyveiKiir() {
        for (String konyv : konyvtar.getKonyvekLeirasa()) {
            if (konyv != null) {
                System.out.println(konyv);
            }
        }
    }

}
