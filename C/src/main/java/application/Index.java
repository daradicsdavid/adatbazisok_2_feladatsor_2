package application;

import input.CInput;

import static utils.StringUtils.entry;
import static utils.StringUtils.printTemplate;

public class Index {
    protected final CInput adatok;
    protected final Integer rekordok_szama;

    public Index(CInput adatok, Integer rekordok_szama) {

        this.adatok = adatok;
        this.rekordok_szama = rekordok_szama;
    }


    public void indexSzamolas() {
        int blokkok_szama = 0;

        int height = getHeight();
        for (int i = 0; i <= height; i++) {

            blokkok_szama = blokkok_szama + getLevel(i);
        }
        System.out.print(blokkok_szama);
    }

    protected int getHeight() {


        int szintek = (int) Math.ceil(Math.log(rekordok_szama / adatok.rekordPerBlokk) / Math.log(adatok.kulcsMutatoParPerBlokk));
        printTemplate("Index szintek száma: ${szintek} (${kulcsMutatoParPerBlokk} alapú logaritmusa a rekordblokkok számának ${B})",
                entry("szintek", szintek), entry("kulcsMutatoParPerBlokk", adatok.kulcsMutatoParPerBlokk), entry("B", rekordok_szama / adatok.rekordPerBlokk));

        return szintek;
    }

    protected int getLevel(int i) {
        printTemplate("${i}. szint: ${rekordok_szama} (rekordok száma) / ${rekordPerBlokk} (blokkolási faktor) / ${kulcsMutatoParPerBlokk} (mutató blokkolási faktor a szinten)"
                , entry("i", i + 1), entry("rekordok_szama", rekordok_szama), entry("rekordPerBlokk", adatok.rekordPerBlokk), entry("kulcsMutatoParPerBlokk", Math.pow(adatok.kulcsMutatoParPerBlokk, i)));
        return (int) Math.ceil((double) rekordok_szama / (double) adatok.rekordPerBlokk / Math.pow(adatok.kulcsMutatoParPerBlokk, i));
    }
}
