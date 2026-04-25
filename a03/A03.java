package a03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class A03 {
    public static void main (String[] args){
        Random aleatorio = new Random();
        
        Collection<Integer> l1 = new ArrayList<>();
        Collection<Integer> l2 = new ArrayList<>();
        
        for (int cont = 0; cont < 21; ++cont){
            int n = aleatorio.nextInt(10)+1; // Del 1 al 10 incluido
            l1.add(n);
        }
        
        System.out.println("l1 contiene: " + l1.toString());
        
        for (int cont = 0; cont < 21; ++cont){
            int n = aleatorio.nextInt(10)+1; // Del 1 al 10 incluido
            
            if (!l1.contains(n)){
                l2.add(n);
            }
        }
        
        System.out.println("l2 contiene: " + l2.toString());
    }
}
