package application;

import input.CInput;

public class C {

    static CInput adatok;
    static Integer rekordok_szama = 300;

    public static void main(String[] args) {

        adatok = CInput.feladatsor;

        System.out.println("Sűrű index");
        new SuruIndex(adatok, rekordok_szama).indexSzamolas();
        System.out.println();

        System.out.println("Ritka index");
        new RitkaIndex(adatok, rekordok_szama).indexSzamolas();
        System.out.println();


    }
}
