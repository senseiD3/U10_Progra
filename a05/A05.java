package a05;
import java.util.Random;
import java.util.Collection;
import java.util.ArrayList;

public class A05 {
    public static void main (String[] args){
        Collection<Integer> lista_num = new ArrayList<>();
        Random r = new Random();
        
        for (int cont = 0; cont < 100; ++cont){
            int num = r.nextInt(10)+1;
            lista_num.add(num);
        }
        
        System.out.println(lista_num);
        
        Collection<Integer> l2 = new ArrayList<>();
        l2.add(5);
        
        lista_num.removeAll(l2);
        
        System.out.println(lista_num);
    }
}
