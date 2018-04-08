package input;

public class EInput {

    public Integer rekordSzam;
    public Integer rekordPerBlokk;
    public Integer kulcsPerBlokk;
    public Integer mutatoPerBlokk;
    public Integer minKulcsPerBlokk;
    public Integer minMutatoPerBlokk;

    public static EInput feladatsor;

    static {
        feladatsor = new EInput();
        feladatsor.rekordSzam = 1000000;
        feladatsor.rekordPerBlokk = 10;
        feladatsor.kulcsPerBlokk = 99;
        feladatsor.mutatoPerBlokk = 100;
        feladatsor.minKulcsPerBlokk = 69;
        feladatsor.minMutatoPerBlokk = 70;

    }
}
