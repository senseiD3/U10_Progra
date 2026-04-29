package a03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class A03 {
    public static void main (String[] args){
        Random aleatorio = new Random();
        
        Collection<Integer> l1 = new ArrayList<>();
        Collection<Integer> l2 = new ArrayList<>();
        
        for (int cont = 0; cont < 20; ++cont){
            int n = aleatorio.nextInt(10)+1; // Del 1 al 10 incluido
            l1.add(n);
        }
        
        System.out.println("l1 contiene: " + l1.toString());
        
        for (Integer num_act : l1){
            if (!l2.contains(num_act)){
                l2.add(num_act);
            }
        }
        
        System.out.println("l2 contiene: " + l2.toString());
    }
}
