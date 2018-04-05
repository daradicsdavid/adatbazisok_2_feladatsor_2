package application;

import input.AInput;

public class A {

    static AInput adatok;
    static Integer rekordok_szama = 10;

    public static void main(String[] args) {


        adatok = AInput.feladatsor;

        System.out.println("Sűrű index");
        new SuruIndex(adatok, rekordok_szama).suruIndexSzamolas();
        System.out.println("");

        System.out.println("Ritka index");
        new RitkaIndex(adatok, rekordok_szama).ritkaIndexSzamolas();
        System.out.println("");
    }


}
