package application;

import input.EInput;

import static utils.StringUtils.entry;
import static utils.StringUtils.printTemplate;

public abstract class BFa {

    protected final EInput adatok;

    public BFa(EInput adatok) {
        this.adatok = adatok;
    }

    public abstract void szamolas();

    public Integer adatBlokkokSzamolas() {
        Integer adatBlokkok = (int) Math.ceil((double) adatok.rekordSzam / adatok.rekordPerBlokk);
        printTemplate("Rekord blokkok száma: ${rekordSzam} (rekordok száma) / ${rekordPerBlokk} (blokkolási faktor) = ${adatBlokkok}",
                entry("rekordSzam", adatok.rekordSzam),
                entry("rekordPerBlokk", adatok.rekordPerBlokk),
                entry("adatBlokkok", adatBlokkok));

        return adatBlokkok;
    }

    protected Integer levelekSzamolasa(Integer mutatok, Integer blokkolasiFaktor) {
        Integer levelBlokkok = (int) Math.ceil((double) mutatok / blokkolasiFaktor);
        printTemplate("Levél blokkok száma: ${mutatok} (mutatók száma) / ${blokkolasiFaktor} (blokkolási faktor) = ${levelBlokkok}",
                entry("mutatok", mutatok),
                entry("blokkolasiFaktor", blokkolasiFaktor),
                entry("levelBlokkok", levelBlokkok));

        return levelBlokkok;
    }

    protected Integer szintSzamolas(Integer szint, Integer gyerekekSzama, Integer blokkolasiFaktor) {
        Integer szuloBlokkok = (int) Math.ceil((double) gyerekekSzama / blokkolasiFaktor);
        printTemplate("Elemek száma ${szint}. szinten: ${gyerekekSzama} (gyerekek száma) / ${blokkolasiFaktor} (blokkolási faktor) = ${szuloBlokkok}",
                entry("szint", szint),
                entry("gyerekekSzama", gyerekekSzama),
                entry("blokkolasiFaktor", blokkolasiFaktor),
                entry("szuloBlokkok", szuloBlokkok));

        return szuloBlokkok;
    }

    protected Integer adatEsMutatoBlokkokSzama(Integer adatBlokkok, Integer mutatoBlokkok) {
        Integer osszes = adatBlokkok + mutatoBlokkok;
        printTemplate("Szükséges blokkok száma: ${adatBlokkok} (adat blokkok száma) + ${mutatoBlokkok} (mutato blokkok száma) = ${osszes}",
                entry("adatBlokkok", adatBlokkok),
                entry("mutatoBlokkok", mutatoBlokkok),
                entry("osszes", osszes));

        return osszes;
    }

    protected double keresesiIdo(Integer mutatokSzama, Integer kulcsokSzama) {
        double keresesiIdo = Math.log(mutatokSzama) / Math.log(kulcsokSzama);
        printTemplate("Keresési ido: ${kulcsokSzama} alapú logaritmus ${mutatokSzama} (mutatók száma) = ${keresesiIdo}",
                entry("mutatokSzama", mutatokSzama),
                entry("kulcsokSzama", kulcsokSzama),
                entry("keresesiIdo", keresesiIdo));

        return keresesiIdo;
    }

}
