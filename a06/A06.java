package a06;

import java.util.Random;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;

public class A06 {
    public static void main (String[]args){
        Random r = new Random();
        Collection<Integer> c = new ArrayList<>();
        
        for (int cont = 0; cont < 20; ++cont){
            int num = r.nextInt(10)+1;
            c.add(num);
        }
        
        Integer[] tablaInteger = c.toArray(new Integer[0]);
        
        Arrays.sort(tablaInteger);
        
        Collection<Integer> c_ordenada = new ArrayList<>(Arrays.asList(tablaInteger));
        
        System.out.println("Colleccion original: " + c);
        System.out.println("Coleccion ordenada: " + c_ordenada);
    }
}
