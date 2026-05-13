package a08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class A08 {
    public static void main (String[]args){
         List<String> listaA = new ArrayList(Arrays.asList("Ana", "Luis", "Marta", "Luis"));
         List<String> listaB = new ArrayList(Arrays.asList("Ana", "Luis", "Marta", "Luis"));
         
         System.out.println("La listaA = listaB: " + listaA.equals(listaB));
         
         System.out.println("Primera vez q sale Luis: " + listaB.indexOf("Luis") + "Ultima vez: " + listaB.lastIndexOf("Luis"));
         
         listaA.sort(null);
         
         System.out.println("La listaA = listaB: " + listaA.equals(listaB));
         
         listaB.sort(Comparator.reverseOrder());
         
         System.out.println(listaB);
    }
}
