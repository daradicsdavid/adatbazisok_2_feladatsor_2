package application;


import input.AInput;


import static utils.StringUtils.entry;
import static utils.StringUtils.printTemplate;


public class A {

    static AInput adatok;
    static Integer rekordok_szama = 10;

    public static void main(String[] args) {


        adatok = AInput.feladatsor;

        ritkaIndexSzamolas(rekordok_szama);

    }

    private static void ritkaIndexSzamolas(Integer rekordok_szama) {
        double blokkokSzama = rekordBlokkokSzamolas();
        double mutatoBlokkokSzama = mutatoBlokkokSzamolas(blokkokSzama);

        double szuksegesBlokkokSzama = szuksegesBlokkokSzamolas(blokkokSzama, mutatoBlokkokSzama);


    }

    private static double rekordBlokkokSzamolas() {

        printTemplate("Általános képlet: n / ${rekordPerBlokk} (rekordPerBlokk) = szükséges blokkok száma a rekordok tárolásához.", entry("rekordPerBlokk", adatok.rekordPerBlokk));

        double blokkokSzama = Math.ceil((double) rekordok_szama / (double) adatok.rekordPerBlokk);
        printTemplate("Rekordok tárolásához szükséges blokkok száma: ${rekordok_szama} (rekordok száma) / ${rekordPerBlokk} (rekordPerBlokk) = ${blokkokSzama}",
                entry("rekordok_szama", rekordok_szama), entry("rekordPerBlokk", adatok.rekordPerBlokk), entry("blokkokSzama", blokkokSzama));
        return blokkokSzama;
    }

    private static double mutatoBlokkokSzamolas(double blokkokSzama) {

        printTemplate("Általános képlet: n / ${rekordPerBlokk} (rekordPerBlokk) / ${kulcsMutatoParPerBlokk} (kulcsMutatoParPerBlokk)  = szükséges blokkok száma a rekordok tárolásához.",
                entry("rekordPerBlokk", adatok.rekordPerBlokk), entry("kulcsMutatoParPerBlokk", adatok.kulcsMutatoParPerBlokk));

        double mutatoBlokkokSzama = Math.ceil(blokkokSzama / (double) adatok.kulcsMutatoParPerBlokk);

        printTemplate("Mutatók tárolásához szükséges blokkok száma: ${blokkokSzama} (rekord blokkok száma) / ${kulcsMutatoParPerBlokk} (kulcsMutatoParPerBlokk) = ${mutatoBlokkokSzama}",
                entry("blokkokSzama", blokkokSzama), entry("kulcsMutatoParPerBlokk", adatok.kulcsMutatoParPerBlokk), entry("mutatoBlokkokSzama", mutatoBlokkokSzama));
        return mutatoBlokkokSzama;
    }

    private static double szuksegesBlokkokSzamolas(double blokkokSzama, double mutatoBlokkokSzama) {
        double szuksegesBlokkokSzama = blokkokSzama + mutatoBlokkokSzama;
        printTemplate("Általános képlet: n / ${rekordPerBlokk} (rekordPerBlokk) + n / ${rekordPerBlokk} (rekordPerBlokk) / ${kulcsMutatoParPerBlokk} (kulcsMutatoParPerBlokk)  = szükséges blokkok száma.",
                entry("rekordPerBlokk", adatok.rekordPerBlokk), entry("kulcsMutatoParPerBlokk", adatok.kulcsMutatoParPerBlokk));

        printTemplate("${blokkokSzama} (rekord blokkok száma) + ${mutatoBlokkokSzama} (mutató blokkok száma)  = ${szuksegesBlokkokSzama} (szükséges blokkok száma).",
                entry("blokkokSzama", blokkokSzama), entry("mutatoBlokkokSzama", mutatoBlokkokSzama), entry("szuksegesBlokkokSzama", szuksegesBlokkokSzama));
        return szuksegesBlokkokSzama;
    }
}
