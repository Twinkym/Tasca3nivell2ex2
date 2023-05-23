package Reversed;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        // Crea i emplena el primer List
        List<Integer> llistaOriginal = new ArrayList<>();
        llistaOriginal.add(1);
        llistaOriginal.add(2);
        llistaOriginal.add(3);
        llistaOriginal.add(4);
        llistaOriginal.add(5);

        // Crea el segon List
        List<Integer> llistaInversa = new ArrayList<>();

        // Fer servir iterator per llegir els elements de la primera i inserir-los en la segona.
        ListIterator<Integer> iterator = llistaOriginal.listIterator(llistaOriginal.size());
        while (iterator.hasPrevious()) {
            Integer element = iterator.previous();
            llistaInversa.add(element);
        }

        // Imprimeix la segona llista amb els elements en ordre invers.
        System.out.println("Llista original: " + llistaOriginal);
        System.out.println("Llista inversa: " + llistaInversa);
    }
}