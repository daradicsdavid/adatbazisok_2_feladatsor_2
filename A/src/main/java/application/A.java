package application;

import input.AInput;

import static utils.StringUtils.printImportantTemplate;

public class A {

    static AInput adatok;
    static Integer rekordok_szama = 10;

    public static void main(String[] args) {

        printImportantTemplate("Adatfálj:n/3");
        printImportantTemplate("Sűrű index:n/10");
        printImportantTemplate("Ritka index:n/30");

        adatok = AInput.feladatsor;

        System.out.println("Sűrű index");
        new SuruIndex(adatok, rekordok_szama).suruIndexSzamolas();
        System.out.println();

        System.out.println("Ritka index");
        new RitkaIndex(adatok, rekordok_szama).ritkaIndexSzamolas();
        System.out.println();
    }


}
