package a12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class A12 {
    public static void main (String[]args){
        List<Integer> lista = new ArrayList<>(Arrays.asList(1000, 50, 500, 50, 200));
        
        System.out.println("Cuantos premios de 50 hay: " + Collections.frequency(lista, 50));
        
        System.out.println("Premio maximo: " + Collections.max(lista) + " " + "Premio minimo: " + Collections.min(lista));
        
        Collections.shuffle(lista);
        System.out.println(lista);
        
        lista.sort(null);
        System.out.println(lista);
        
        System.out.println("Posicion del premio de 500: " + Collections.binarySearch(lista, 500));
    }
}
