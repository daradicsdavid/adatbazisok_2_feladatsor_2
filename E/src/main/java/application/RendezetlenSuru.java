package application;

import input.EInput;

import static utils.StringUtils.printTemplate;

public class RendezetlenSuru extends BFa {

    public RendezetlenSuru(EInput adatok) {
        super(adatok);
    }

    public void szamolas() {
        printTemplate("====================================================");
        printTemplate("Sűrű index rendezetlen bemenet.");

        Integer adatBlokkok = adatBlokkokSzamolas();
        Integer mutatoBlokkok = 0;
        Integer szint = 1;
        Integer levelekSzama = levelekSzamolasa(adatok.rekordSzam, adatok.minMutatoPerBlokk);
        mutatoBlokkok += levelekSzama;
        while (levelekSzama != 1) {
            levelekSzama = szintSzamolas(szint, levelekSzama, adatok.minMutatoPerBlokk);
            mutatoBlokkok += levelekSzama;
            szint++;
        }

        adatEsMutatoBlokkokSzama(adatBlokkok, mutatoBlokkok);

        keresesiIdo(szint);
        printTemplate("====================================================");
    }
}
