package application;

import input.EInput;

import static utils.StringUtils.printTemplate;

public class RendezettSuru extends BFa {

    public RendezettSuru(EInput adatok) {
        super(adatok);
    }

    public void szamolas() {
        printTemplate("====================================================");
        printTemplate("Sűrű index rendezett bemenet.");

        Integer adatBlokkok = adatBlokkokSzamolas();
        Integer mutatoBlokkok = 0;
        Integer szint = 1;
        Integer levelekSzama = levelekSzamolasa(adatok.rekordSzam, adatok.mutatoPerBlokk);
        mutatoBlokkok += levelekSzama;
        while (levelekSzama != 1) {
            levelekSzama = szintSzamolas(szint, levelekSzama, adatok.mutatoPerBlokk);
            mutatoBlokkok += levelekSzama;
            szint++;
        }

        adatEsMutatoBlokkokSzama(adatBlokkok, mutatoBlokkok);

        keresesiIdo(szint);
        printTemplate("====================================================");
    }


}
