package a10;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class A10 {
    public static void main (String[]args){
        Set<Socio> c = new HashSet<>();

        c.add(new Socio("111", "Paco"));
        c.add(new Socio("222", "Pepe"));
        c.add(new Socio("333", "Juan"));

        boolean duplicado = c.add(new Socio("222", "Miguel"));
        
        System.out.println("Duplicado: " + duplicado);
        
        Set<Socio> c_ordenado = new TreeSet<>(c);
        c_ordenado.add(new Socio("000" , "Ana"));
        System.out.println(c_ordenado);
        
        List<Socio> lista_ordenada = new ArrayList<>(c_ordenado);
        System.out.println(lista_ordenada.get(1));
    }
}
