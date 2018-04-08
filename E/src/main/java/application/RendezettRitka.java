package application;

import input.EInput;

import static utils.StringUtils.printTemplate;

public class RendezettRitka extends BFa {

    public RendezettRitka(EInput adatok) {
        super(adatok);
    }

    public void szamolas() {
        printTemplate("====================================================");
        printTemplate("Ritka index rendezett bemenet.");

        Integer adatBlokkok = adatBlokkokSzamolas();
        Integer mutatoBlokkok = 0;
        Integer szint = 1;
        Integer levelekSzama = levelekSzamolasa(adatok.rekordSzam / 10, adatok.mutatoPerBlokk);
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
