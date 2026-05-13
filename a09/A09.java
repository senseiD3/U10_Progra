package a09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class A09 {
    public static void main (String[]args){
        Random r = new Random();
        List<Integer> lista = new ArrayList<>();
        
        for (int cont = 0; cont < 20; ++cont){
            int num = r.nextInt(10)+1;
            lista.add(num);
        }
        
        System.out.println(lista);
        
        Set<Integer> l_hash = new HashSet<>(lista);
        // numeros sin repes, no se garantiza orden
        System.out.println(l_hash);
        
        Set<Integer> l_tree = new TreeSet<>(lista);
        // numeros sin repes, oredenados de menor a mayor (orden natural)
        System.out.println(l_tree);
        
        Set<Integer> l_link = new LinkedHashSet<>(lista);
        // numeros sin repes, ordenados segun su insercion
        System.out.println(l_link);
    }
}