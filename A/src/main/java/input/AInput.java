package input;

public class AInput {

    public Integer rekordPerBlokk;
    public Integer kulcsMutatoParPerBlokk;

    public static AInput feladatsor;

    static {
        feladatsor = new AInput();
        feladatsor.rekordPerBlokk = 3;
        feladatsor.kulcsMutatoParPerBlokk = 10;
    }

}
