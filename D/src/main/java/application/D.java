package application;

import input.DInput;

import static utils.StringUtils.printTemplate;

public class D {

    static DInput adatok;

    public static void main(String[] args) {
        adatok = DInput.feladatsor;

        printTemplate("====================================================");
        new Kosar(adatok).szamolas();
        printTemplate("====================================================");
        new SuruIndex(adatok).szamolas();
        printTemplate("====================================================");
        new IsmetlodesMegkotesNelkul(adatok).szamolas();
        printTemplate("====================================================");

    }
}
