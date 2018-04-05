package input;

public class BInput {
    public Integer rekordPerBlokk;
    public Integer kulcsMutatoParPerBlokk;
    public Double telitettsegSzazalek;

    public static BInput feladatsor;

    static {
        feladatsor = new BInput();
        feladatsor.rekordPerBlokk = 30;
        feladatsor.kulcsMutatoParPerBlokk = 200;
        feladatsor.telitettsegSzazalek = (double) 80 / (double) 100;
    }
}
