package modell;

public class Kepregeny extends Konyv {

    private int kepDb;

    public Kepregeny(String szerzo, String cim, Allapotok allapot, int oldalszam, int kepDb) {
        super(szerzo, cim, allapot, oldalszam);
        this.kepDb = kepDb;
    }

    public Kepregeny(String szerzo, String cim, Allapotok allapot, int oldalszam) {
        this(szerzo, cim, allapot, oldalszam, -1);
    }

    public Kepregeny(String szerzo, String cim, Allapotok allapot) {
        this(szerzo, cim, allapot, -1);
    }

    public Kepregeny(String szerzo, String cim) {
        this(szerzo, cim, Allapotok.BEVIZSGALATLAN);
    }

    public Kepregeny(String szerzo) {
        this(szerzo, "azonositatlan");
    }

    public Kepregeny() {
        this("azonositatlan");
    }

    // Egyedi funkció, amellyel csak a képregény típusú objektum rendelkezik
    public int getKepDb() {
        return kepDb;
    }

    public void setKepDb(int db) {
        this.kepDb = db;
    }

    @Override
    public String toString() {
        String os = super.toString();
        return "Konyv (Kepregeny |" + os + "| kepek db: " + kepDb + ")";
    }

}
