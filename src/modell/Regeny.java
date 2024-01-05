package modell;

public class Regeny extends Konyv {

    private RegenyTipusok tipus;

    public Regeny(String szerzo, String cim, Allapotok allapot, int oldalszam, RegenyTipusok regenytipus) {
        super(szerzo, cim, allapot, oldalszam);
        this.tipus = regenytipus;
    }

    public Regeny(String szerzo, String cim, Allapotok allapot, int oldalszam) {
        this(szerzo, cim, allapot, oldalszam, RegenyTipusok.besorolatlan);
    }

    public Regeny(String szerzo, String cim, Allapotok allapot) {
        this(szerzo, cim, allapot, -1);
    }

    public Regeny(String szerzo, String cim) {
        this(szerzo, cim, Allapotok.bevizsgalatlan);
    }

    // egyedi funkció amellyel csak a regény típusú obj. rendelkezik
    public void setTipus(RegenyTipusok tipus) {
        this.tipus = tipus;
    }

    public RegenyTipusok getTipus() {
        return this.tipus;
    }

    @Override
    public String toString() {
        String os = super.toString();
        return "Konyv (Regeny    |" + os + "| tipusa: " + tipus + ")";
    }
}
