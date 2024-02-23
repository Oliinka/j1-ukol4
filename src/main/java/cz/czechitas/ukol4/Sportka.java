package cz.czechitas.ukol4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Třída pro losování Sportky.
 */
public class Sportka {
    private final List<Integer> osudi = new ArrayList<>();


    public Sportka() {
        for (int losovaneCislo = 1; losovaneCislo < 50; losovaneCislo++) {

            osudi.add(losovaneCislo);
        }
       // System.out.println(osudi);

        //TODO naplnit osudí čísly 1 až 49.
    }

    /**
     * Zamíchá osudí.
     *
     * @see Collections#shuffle(List)
     */
    public void zamichat() {
        Collections.shuffle(osudi);
        //System.out.println(osudi);
        //TODO zamíchat osudí
    }
    /**
     * Vrátí seznam s 6 vylosovanými čísly.
     *
     * @return Seznam vylosovaných čísel.
     * @see List#subList(int, int)
     */
    public List<Integer> vylosovanaCisla() {

        int pocetLosovanychCisel = 6;

        List<Integer> vylosovanaCisla = osudi.subList(0, pocetLosovanychCisel);

        return vylosovanaCisla;

        //TODO Vrátit seznam prvních 6 čísel z osudí.

    }
    /**
     * Vrátí sedmé vylosované číslo (dodatkové číslo)
     *
     * @return Dodatkové číslo.
     */
    public Integer dodatkoveCislo() {
        int dodatkoveCislo = osudi.get(6);
        //TODO Vrátit sedmé číslo z osudí.
        return dodatkoveCislo;
    }
}
