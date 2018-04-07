package input;

public class DInput {
    public Integer rekordPerBlokk;
    public Integer indexRekordBlokk;
    public Integer mutatoPerBlokk;
    public Integer rekordSzam;
    public Integer ismetlodes;

    public static DInput feladatsor;

    static {
        feladatsor = new DInput();
        feladatsor.rekordPerBlokk = 3;
        feladatsor.indexRekordBlokk = 10;
        feladatsor.ismetlodes = 10;
        feladatsor.mutatoPerBlokk = 50;
        feladatsor.rekordSzam = 3000;
    }
}
