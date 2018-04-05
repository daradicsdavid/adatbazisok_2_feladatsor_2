package application;

import input.BInput;

import static utils.StringUtils.entry;
import static utils.StringUtils.printTemplate;

public class RitkaIndex extends Index {

    public RitkaIndex(BInput adatok, Integer rekordok_szama) {
        super(adatok, rekordok_szama);
    }

    public void ritkaIndexSzamolas() {
        double blokkokSzama = rekordBlokkokSzamolas();
        double mutatoBlokkokSzama = mutatoBlokkokSzamolas(blokkokSzama);
        double szuksegesBlokkokSzama = szuksegesBlokkokSzamolas(blokkokSzama, mutatoBlokkokSzama);


    }

    private double mutatoBlokkokSzamolas(double blokkokSzama) {

        printTemplate("Általános képlet: n / ${rekordPerBlokk} (rekordPerBlokk) / ${kulcsMutatoParPerBlokk} (kulcsMutatoParPerBlokk) / ${telitettsegSzazalek} (Maximális telítettség)  = szükséges blokkok száma a rekordok tárolásához.",
                entry("rekordPerBlokk", adatok.rekordPerBlokk), entry("kulcsMutatoParPerBlokk", adatok.kulcsMutatoParPerBlokk),entry("telitettsegSzazalek", adatok.telitettsegSzazalek));

        double mutatoBlokkokSzama = Math.ceil(blokkokSzama / (double) adatok.kulcsMutatoParPerBlokk);

        printTemplate("Mutatók tárolásához szükséges blokkok száma: ${blokkokSzama} (rekord blokkok száma) / ${kulcsMutatoParPerBlokk} (kulcsMutatoParPerBlokk) / ${telitettsegSzazalek} (Maximális telítettség) = ${mutatoBlokkokSzama}",
                entry("blokkokSzama", blokkokSzama), entry("kulcsMutatoParPerBlokk", adatok.kulcsMutatoParPerBlokk), entry("mutatoBlokkokSzama", mutatoBlokkokSzama),entry("telitettsegSzazalek", adatok.telitettsegSzazalek));
        return mutatoBlokkokSzama;
    }

    private double szuksegesBlokkokSzamolas(double blokkokSzama, double mutatoBlokkokSzama) {
        double szuksegesBlokkokSzama = blokkokSzama + mutatoBlokkokSzama;
        printTemplate("Általános képlet: n / ${rekordPerBlokk} (rekordPerBlokk) / ${telitettsegSzazalek} (Maximális telítettség) + n / ${rekordPerBlokk} (rekordPerBlokk) / ${telitettsegSzazalek} (Maximális telítettség) / ${kulcsMutatoParPerBlokk} (kulcsMutatoParPerBlokk) / ${telitettsegSzazalek} (Maximális telítettség)  = szükséges blokkok száma.",
                entry("rekordPerBlokk", adatok.rekordPerBlokk), entry("kulcsMutatoParPerBlokk", adatok.kulcsMutatoParPerBlokk),entry("telitettsegSzazalek", adatok.telitettsegSzazalek));

        printTemplate("${blokkokSzama} (rekord blokkok száma) + ${mutatoBlokkokSzama} (mutató blokkok száma)  = ${szuksegesBlokkokSzama} (szükséges blokkok száma).",
                entry("blokkokSzama", blokkokSzama), entry("mutatoBlokkokSzama", mutatoBlokkokSzama), entry("szuksegesBlokkokSzama", szuksegesBlokkokSzama));
        return szuksegesBlokkokSzama;
    }

}
