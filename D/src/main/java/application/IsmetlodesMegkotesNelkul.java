package application;

import input.DInput;

import static utils.StringUtils.printTemplate;

public class IsmetlodesMegkotesNelkul extends Kosar {
    public IsmetlodesMegkotesNelkul(DInput adatok) {
        super(adatok);
    }

    public void szamolas() {
        printTemplate("");
        printTemplate("Minimálisan szükséges blokkok száma, ugyanaz az adat ismetlődve");
        adatok.ismetlodes = adatok.rekordSzam;
        super.szamolas();
        printTemplate("");

        printTemplate("");
        printTemplate("Maximálisan szükséges blokkok száma, minden adat egyedi");
        adatok.ismetlodes = 1;
        super.szamolas();
        printTemplate("");

    }
}
