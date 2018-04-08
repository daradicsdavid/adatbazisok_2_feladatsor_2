package application;

import input.EInput;

public class E {

    public static void main(String[] args) {

        EInput adatok = EInput.feladatsor;

        new RendezettSuru(adatok).szamolas();
        new RendezetlenSuru(adatok).szamolas();
        new RendezettRitka(adatok).szamolas();
        new RekordBFa(adatok).szamolas();

    }
}
