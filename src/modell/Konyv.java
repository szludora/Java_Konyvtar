package modell;

public abstract class Konyv {

    private Allapotok allapot;
    private String szerzo;
    private String cim;
    private String kolcsonzo;
    private String legutolsoKolcsonzo;
    private int oldalszam;

    public Konyv(String szerzo, String cim, Allapotok allapot, int oldalszam) {
        this.szerzo = szerzo;
        this.cim = cim;
        this.allapot = allapot;
        this.oldalszam = oldalszam;
        this.kolcsonzo = "";
    }

    public String getSzerzo() {
        return szerzo;
    }

    public String getCim() {
        return cim;
    }

    public Allapotok getAllapot() {
        return allapot;
    }

    public void setAllapot(Allapotok allapot) {
        this.allapot = allapot;
    }

    public int getOldalszam() {
        return this.oldalszam;
    }

    public void setOldalszam(int oldalszam) {
        this.oldalszam = oldalszam;
    }

    public String getKolcsonzo() {
        return this.kolcsonzo;
    }

    public void setKolcsonzo(String kolcsonzo) {
        if (this.kolcsonzo == "") {
            this.kolcsonzo = kolcsonzo;
        } else {
            this.kolcsonzo = "";
        }
        this.legutolsoKolcsonzo = kolcsonzo;

    }

    @Override
    public String toString() {
        return "szerzo:" + szerzo
                + " | cim: " + cim
                + " | allapot: " + allapot
                + " | oldalszam: " + oldalszam
                + " | legutobb kivette: " + legutolsoKolcsonzo + " ";
    }

    public String leiras() {
        return String.format("Könyv(%s|%s|%s|%s|%s)", szerzo, cim, allapot, oldalszam, legutolsoKolcsonzo);
    }

}
