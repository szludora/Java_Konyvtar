package modell;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Konyvtar {

    private Konyv[] konyvek;
    private int konyvDb;
    private boolean uzemel;

    public Konyvtar(int db) {
        konyvDb = 0;
        konyvek = new Konyv[db];
        uzemel = true;
    }

    public Konyvtar() {
        this(10);
    }

    public void beszerez(Konyv konyv) {

        if (konyvDb < konyvek.length) {
            konyvek[konyvDb++] = konyv;
        } else {
            System.out.println("A konyvtar megtelt, nem tudunk ujabb konyveket beszerezni!");
        }
    }

    public void visszavesz(Konyv konyv) {
        if (uzemel) {
            if (konyvDb < konyvek.length) {
                konyvek[konyvDb++] = konyv;
            } else {
                System.out.println("Jelenleg nincs helyunk visszavenni a konyvet. Hozd vissza később!");
            }
        } else {
            System.out.println("A konyvtar jelenleg nem uzemel, gyere vissza nyitvatartasi idoben!");
        }
    }

    public Konyv kiad(String kolcsonzo) {
        if (uzemel) {
            int i = 0;
            while (konyvek[i] == null || i < konyvDb && !(konyvek[i].getKolcsonzo().equals(kolcsonzo))) {
                i++;
            }
            if (i < konyvDb) {
                Konyv konyv = this.konyvek[i];
                boolean regenyTipus = konyv instanceof Regeny;
                String tipusuKonyv = " kepregeny";
                if (regenyTipus) {
                    tipusuKonyv = "regeny";
                }
                System.out.println(String.format("A" + tipusuKonyv + "kiadva %s!", kolcsonzo));
                konyvek[i] = null;
                return konyv;
            } else {
                System.out.println("Nincs ilyen konyv a konyvtarban!");
            }
        } else {
            System.out.println("A konyvtar jelenleg nem uzemel, gyere vissza nyitvatartasi idoben!");
        }

        return null;
    }

    public String[] getKonyvekLeirasa() {
        String[] konyvek = new String[this.konyvek.length];
        for (int i = 0; i < konyvDb; i++) {
            Konyv konyv = this.konyvek[i];
            if (konyv != null) {
                System.out.println(konyv.toString());
            }
        }
        return konyvek;
    }

    public List<Konyv> getKonyvek() {
        List<Konyv> konyvekListaja = Arrays.asList(konyvek);
        return Collections.unmodifiableList(konyvekListaja);
    }

    public void leeg() {
        uzemel = false;
        konyvek = new Konyv[5];
    }
}
