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

        adatok.kulcsPerBlokk = 10;
        adatok.minKulcsPerBlokk = 7;

        Integer mutatoBlokkok = 0;
        Integer szint = 1;
        Integer levelekSzama = levelekSzamolasa(adatok.rekordSzam, adatok.minKulcsPerBlokk);
        mutatoBlokkok += levelekSzama;
        while (levelekSzama != 1) {
            levelekSzama = szintSzamolas(szint, levelekSzama, adatok.minKulcsPerBlokk);
            mutatoBlokkok += levelekSzama;
        }

        adatEsMutatoBlokkokSzama(0, mutatoBlokkok);

        keresesiIdo(adatok.rekordSzam, adatok.minKulcsPerBlokk);


        printTemplate("====================================================");
    }
}
