package application;

import input.EInput;

import static utils.StringUtils.printTemplate;

public class RekordBFa extends BFa {


    public RekordBFa(EInput adatok) {
        super(adatok);
    }

    public void szamolas() {

        printTemplate("====================================================");
        printTemplate("Rekordok a levelekben B fa.");

        adatok.mutatoPerBlokk = 10;
        adatok.minMutatoPerBlokk = 7;

        Integer mutatoBlokkok = 0;
        Integer szint = 1;
        Integer levelekSzama = levelekSzamolasa(adatok.rekordSzam, adatok.minMutatoPerBlokk);
        mutatoBlokkok += levelekSzama;
        while (levelekSzama != 1) {
            levelekSzama = szintSzamolas(szint, levelekSzama, adatok.minMutatoPerBlokk);
            mutatoBlokkok += levelekSzama;
            szint++;
        }

        adatEsMutatoBlokkokSzama(0, mutatoBlokkok);

        keresesiIdo(szint);


        printTemplate("====================================================");
    }
}
