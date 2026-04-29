package a04;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class A04 {
    public static void main (String[] args){
        Random aleatorio = new Random();
        
        Collection<Integer> numeros = new ArrayList<>();
        
        for (int cont = 0; cont < 100; ++cont){
            int n = aleatorio.nextInt(10)+1; // Del 1 al 10 incluido
            numeros.add(n);
        }
        
        System.out.println(numeros.toString());
        
        Iterator<Integer> it = numeros.iterator();
        
        while(it.hasNext()){
            int n_act = it.next();
            
            if (n_act == 5){
                it.remove();
            }
        }
        
        System.out.println(numeros.toString());
    }
}
