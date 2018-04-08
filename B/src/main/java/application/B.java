package application;

import input.BInput;

import static utils.StringUtils.printImportantTemplate;
import static utils.StringUtils.printTemplate;

public class B {

    static BInput adatok;
    static Integer rekordok_szama = 10;

    public static void main(String[] args) {


        adatok = BInput.feladatsor;

        printImportantTemplate("Adatfálj:n/24");
        printImportantTemplate("Sűrű index:n/160");
        printImportantTemplate("Ritka index:n/3840");


        System.out.println("Sűrű index");
        new SuruIndex(adatok, rekordok_szama).suruIndexSzamolas();
        System.out.println();

        System.out.println("Ritka index");
        new RitkaIndex(adatok, rekordok_szama).ritkaIndexSzamolas();
        System.out.println();
    }

}
