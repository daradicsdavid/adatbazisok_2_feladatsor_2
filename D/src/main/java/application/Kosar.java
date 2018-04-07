package application;

import input.DInput;

import static utils.StringUtils.entry;
import static utils.StringUtils.printTemplate;

public class Kosar extends BlokkSzamolas {
    public Kosar(DInput adatok) {
        super(adatok);
    }

    public void szamolas() {
        printTemplate("Kosár:");

        Integer rekordokBlokkok = rekordokBlokkokSzamolas();
        Integer mutatokBlokkok = mutatokBlokkokSzamolas();
        Integer indexParokBlokkok = indexParokBlokkokSzamolas(IndexParSzamolas());

        osszesBlokkSzamolas(rekordokBlokkok, mutatokBlokkok, indexParokBlokkok);
    }

    private void osszesBlokkSzamolas(Integer rekordokBlokkok, Integer mutatokBlokkok, Integer indexParokBlokkok) {
        printTemplate("Összes szükséges blokkok száma: rekordok blokkjai + mutatók blokkjai + indexpárok blokkjai");
        printTemplate("${rekordokBlokkok} + ${mutatokBlokkok} + ${indexParokBlokkok} = ${osszes}",
                entry("rekordokBlokkok", rekordokBlokkok),
                entry("mutatokBlokkok", mutatokBlokkok),
                entry("indexParokBlokkok", indexParokBlokkok),
                entry("osszes", rekordokBlokkok + mutatokBlokkok + indexParokBlokkok)
        );

    }

    private Integer IndexParSzamolas() {
        Integer indexParok = (int) Math.ceil(adatok.rekordSzam / adatok.ismetlodes);
        printTemplate("Index párok száma: ${mutatok} (mutatók száma) / ${ismetlodes} (ismétlődés) = ${indexParok}",
                entry("mutatok", adatok.rekordSzam),
                entry("ismetlodes", adatok.ismetlodes),
                entry("indexParok", indexParok));

        return indexParok;
    }

    private Integer mutatokBlokkokSzamolas() {
        Integer mutatokBlokkok = (int) Math.ceil(adatok.rekordSzam / adatok.mutatoPerBlokk);
        printTemplate("Mutató blokkok száma: ${mutatok} (mutatók száma) / ${mutatoPerBlokk} (mutató blokkolási faktor) = ${mutatokBlokkok}",
                entry("mutatok", adatok.rekordSzam),
                entry("mutatoPerBlokk", adatok.mutatoPerBlokk),
                entry("mutatokBlokkok", mutatokBlokkok));

        return mutatokBlokkok;
    }


}
