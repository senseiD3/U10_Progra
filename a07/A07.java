package a07;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class A07 {
    public static void main (String[]args){
        List<Integer> lista1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        List<Integer> lista2 = new ArrayList<>(Arrays.asList(99, 99));
        
        lista1.add(0, 5);
        lista1.addAll(2, lista2);
        
        System.out.println(lista1.get(4));
        
        int sust = lista1.get(lista1.size()-1);
        lista1.set(lista1.size()-1, 500);
        
        System.out.println(sust);
        
        lista1.remove(1);
        lista1.remove(Integer.valueOf(99));
        
        System.out.println(lista1);
    }
}