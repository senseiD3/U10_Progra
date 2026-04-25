package a02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.Iterator;


public class A02 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Collection<Integer> numeros = new ArrayList<>();
        
        System.out.println("Introduzca uno a uno los numeros que quiere guardar: ");
        int n = sc.nextInt();
        
        // Añade numeros al ArrayList hasta que se ponga un -1
        while (n != -1){
            numeros.add(n);
            n = sc.nextInt();
        }
        
        System.out.println(numeros.toString());
        
        // Muestra los valores pares
        for(Integer n_act : numeros){
            if (n_act%2 == 0){
                System.out.println(n_act);
            }
        }
        
        Iterator<Integer> it = numeros.iterator();
        
        // Recorro el Iterator y elimino los multiplos de 3, al hacerlo lo estoy quitando del ArrayList numeros
        while(it.hasNext()){
            Integer n_act = it.next();
            
            if (n_act%3 == 0){
                it.remove();
            }
        }
        
        System.out.println(numeros.toString());
    }
}
