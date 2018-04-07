package application;

import input.DInput;

import static utils.StringUtils.entry;
import static utils.StringUtils.printTemplate;

public class SuruIndex extends BlokkSzamolas {
    public SuruIndex(DInput adatok) {
        super(adatok);
    }

    public void szamolas() {
        Integer rekordokBlokkok = rekordokBlokkokSzamolas();
        Integer mutatoBlokkok = indexParokBlokkokSzamolas(adatok.rekordSzam);
        osszesBlokkSzamolas(rekordokBlokkok, mutatoBlokkok);

    }

    private void osszesBlokkSzamolas(Integer rekordokBlokkok, Integer indexParokBlokkok) {
        printTemplate("Összes szükséges blokkok száma: rekordok blokkjai + indexpárok blokkjai");
        printTemplate("${rekordokBlokkok} + ${indexParokBlokkok} = ${osszes}",
                entry("rekordokBlokkok", rekordokBlokkok),
                entry("indexParokBlokkok", indexParokBlokkok),
                entry("osszes", rekordokBlokkok + indexParokBlokkok)
        );

    }

}
