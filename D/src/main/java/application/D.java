package application;

import input.DInput;

public class D {

    static DInput adatok;

    public static void main(String[] args) {
        adatok = DInput.feladatsor;

        new Kosar(adatok).szamolas();
        new SuruIndex(adatok).szamolas();
        new IsmetlodesMegkotesNelkul(adatok).szamolas();

    }
}
