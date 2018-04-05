package application;

import input.BInput;

public class B {

    static BInput adatok;
    static Integer rekordok_szama = 10;

    public static void main(String[] args) {


        adatok = BInput.feladatsor;

        System.out.println("Sűrű index");
        new SuruIndex(adatok, rekordok_szama).suruIndexSzamolas();
        System.out.println("");

        System.out.println("Ritka index");
        new RitkaIndex(adatok, rekordok_szama).ritkaIndexSzamolas();
        System.out.println("");
    }

}
