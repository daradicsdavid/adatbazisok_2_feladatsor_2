package application;

import input.CInput;

public class C {

    static CInput adatok;
    static Integer rekordok_szama = 300;

    public static void main(String[] args) {

        adatok = CInput.feladatsor;

        System.out.println("Sűrű index");
        System.out.println("=====================================");
        System.out.println("n/9");
        System.out.println("=====================================");
        new SuruIndex(adatok, rekordok_szama).indexSzamolas();
        System.out.println();

        System.out.println("Ritka index");
        System.out.println("=====================================");
        System.out.println("n/27");
        System.out.println("=====================================");
        new RitkaIndex(adatok, rekordok_szama).indexSzamolas();
        System.out.println();


    }
}
