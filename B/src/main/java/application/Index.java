package application;

import input.BInput;

import static utils.StringUtils.entry;
import static utils.StringUtils.printTemplate;

public abstract class Index {

    protected final BInput adatok;
    protected final Integer rekordok_szama;

    public Index(BInput adatok, Integer rekordok_szama) {
        this.adatok = adatok;
        this.rekordok_szama = rekordok_szama;
    }

    protected double rekordBlokkokSzamolas() {

        printTemplate("Általános képlet: n / ${rekordPerBlokk} (rekordPerBlokk) / ${telitettsegSzazalek} (Maximális telítettség) = szükséges blokkok száma a rekordok tárolásához.",
                entry("rekordPerBlokk", adatok.rekordPerBlokk), entry("telitettsegSzazalek", adatok.telitettsegSzazalek));

        double blokkokSzama = Math.ceil((double) rekordok_szama / (double) adatok.rekordPerBlokk / adatok.telitettsegSzazalek);
        printTemplate("Rekordok tárolásához szükséges blokkok száma: ${rekordok_szama} (rekordok száma) / ${rekordPerBlokk} (rekordPerBlokk) / ${telitettsegSzazalek} (Maximális telítettség) = ${blokkokSzama}",
                entry("rekordok_szama", rekordok_szama), entry("rekordPerBlokk", adatok.rekordPerBlokk), entry("telitettsegSzazalek", adatok.telitettsegSzazalek), entry("blokkokSzama", blokkokSzama));
        return blokkokSzama;
    }

}
