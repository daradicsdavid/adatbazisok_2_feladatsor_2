package application;

import input.DInput;

import static utils.StringUtils.entry;
import static utils.StringUtils.printTemplate;

public abstract class BlokkSzamolas {

    protected final DInput adatok;

    public BlokkSzamolas(DInput adatok) {
        this.adatok = adatok;
    }

    public abstract void szamolas();

    protected Integer rekordokBlokkokSzamolas() {
        Integer rekordokBlokkok = (int) Math.ceil(adatok.rekordSzam / adatok.rekordPerBlokk);
        printTemplate("Rekord blokkok száma: ${rekordok} (rekordok száma) / ${rekordPerBlokk} (blokkolási faktor) = ${rekordokBlokkok}",
                entry("rekordok", adatok.rekordSzam),
                entry("rekordPerBlokk", adatok.rekordPerBlokk),
                entry("rekordokBlokkok", rekordokBlokkok));

        return rekordokBlokkok;
    }

    protected Integer indexParokBlokkokSzamolas(Integer indexParok) {
        Integer indexParokBlokkok = (int) Math.ceil((double) indexParok / adatok.indexRekordBlokk);
        printTemplate("Index pár blokkok száma: ${indexParok} (index párok száma) / ${indexRekordBlokk} (index pár blokkolási faktor) = ${indexParokBlokkok}",
                entry("indexParok", indexParok),
                entry("indexRekordBlokk", adatok.indexRekordBlokk),
                entry("indexParokBlokkok", indexParokBlokkok));

        return indexParokBlokkok;
    }
}
