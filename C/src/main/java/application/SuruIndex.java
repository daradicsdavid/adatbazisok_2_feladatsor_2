package application;

import input.CInput;

import static utils.StringUtils.entry;
import static utils.StringUtils.printTemplate;

public class SuruIndex extends Index {
    public SuruIndex(CInput adatok, Integer rekordok_szama) {
        super(adatok, rekordok_szama);
    }

    protected int getLevel(int i) {
        if (i == 1) {
            return getSuruIndexLevel();
        } else {
            return super.getLevel(i);
        }
    }

    private int getSuruIndexLevel() {
        printTemplate("${i}. szint: ${rekordok_szama} (rekordok száma) / ${kulcsMutatoParPerBlokk} (mutató blokkolási faktor)"
                , entry("i", 2), entry("rekordok_szama", rekordok_szama), entry("kulcsMutatoParPerBlokk", adatok.kulcsMutatoParPerBlokk));
        return (int) Math.ceil((double) rekordok_szama / Math.pow(adatok.kulcsMutatoParPerBlokk, 1));

    }
}
