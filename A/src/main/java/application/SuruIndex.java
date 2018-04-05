package application;

import input.AInput;

import static utils.StringUtils.entry;
import static utils.StringUtils.printTemplate;

public class SuruIndex {


    private final AInput adatok;
    private final Integer rekordok_szama;

    public SuruIndex(AInput adatok, Integer rekordok_szama) {
        this.adatok = adatok;
        this.rekordok_szama = rekordok_szama;
    }

    public void suruIndexSzamolas() {
        double blokkokSzama = rekordBlokkokSzamolas();
        double mutatoBlokkokSzama = mutatoBlokkokSzamolas(blokkokSzama);
        double szuksegesBlokkokSzama = szuksegesBlokkokSzamolas(blokkokSzama, mutatoBlokkokSzama);


    }

    private double rekordBlokkokSzamolas() {

        printTemplate("Általános képlet: n / ${rekordPerBlokk} (rekordPerBlokk) = szükséges blokkok száma a rekordok tárolásához.", entry("rekordPerBlokk", adatok.rekordPerBlokk));

        double blokkokSzama = Math.ceil((double) rekordok_szama / (double) adatok.rekordPerBlokk);
        printTemplate("Rekordok tárolásához szükséges blokkok száma: ${rekordok_szama} (rekordok száma) / ${rekordPerBlokk} (rekordPerBlokk) = ${blokkokSzama}",
                entry("rekordok_szama", rekordok_szama), entry("rekordPerBlokk", adatok.rekordPerBlokk), entry("blokkokSzama", blokkokSzama));
        return blokkokSzama;
    }

    private double mutatoBlokkokSzamolas(double blokkokSzama) {

        printTemplate("Általános képlet: n / ${kulcsMutatoParPerBlokk} (kulcsMutatoParPerBlokk)  = szükséges blokkok száma a rekordok tárolásához.",
                entry("kulcsMutatoParPerBlokk", adatok.kulcsMutatoParPerBlokk));

        double mutatoBlokkokSzama = Math.ceil(blokkokSzama / (double) adatok.kulcsMutatoParPerBlokk);

        printTemplate("Mutatók tárolásához szükséges blokkok száma: ${rekordok_szama} (rekordok száma) / ${kulcsMutatoParPerBlokk} (kulcsMutatoParPerBlokk) = ${mutatoBlokkokSzama}",
                entry("rekordok_szama", rekordok_szama), entry("kulcsMutatoParPerBlokk", adatok.kulcsMutatoParPerBlokk), entry("mutatoBlokkokSzama", mutatoBlokkokSzama));
        return mutatoBlokkokSzama;
    }

    private double szuksegesBlokkokSzamolas(double blokkokSzama, double mutatoBlokkokSzama) {
        double szuksegesBlokkokSzama = blokkokSzama + mutatoBlokkokSzama;
        printTemplate("Általános képlet: n / ${rekordPerBlokk} (rekordPerBlokk) + n / ${kulcsMutatoParPerBlokk} (kulcsMutatoParPerBlokk)  = szükséges blokkok száma.",
                entry("rekordPerBlokk", adatok.rekordPerBlokk), entry("kulcsMutatoParPerBlokk", adatok.kulcsMutatoParPerBlokk));

        printTemplate("${blokkokSzama} (rekord blokkok száma) + ${mutatoBlokkokSzama} (mutató blokkok száma)  = ${szuksegesBlokkokSzama} (szükséges blokkok száma).",
                entry("blokkokSzama", blokkokSzama), entry("mutatoBlokkokSzama", mutatoBlokkokSzama), entry("szuksegesBlokkokSzama", szuksegesBlokkokSzama));
        return szuksegesBlokkokSzama;
    }

}
