package input;

public class CInput {
    public Integer rekordPerBlokk;
    public Integer kulcsMutatoParPerBlokk;

    public static CInput feladatsor;

    static {
        feladatsor = new CInput();
        feladatsor.rekordPerBlokk = 3;
        feladatsor.kulcsMutatoParPerBlokk = 10;
    }
}
