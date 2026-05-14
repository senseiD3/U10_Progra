package a11;

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class A11 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> repuestos = new TreeMap<>();
        int opcion;
        
        System.out.println("Que quiere hacer: ");
        System.out.println("0: Salir");
        System.out.println("1: Alta producto");
        System.out.println("2: Baja producto");
        System.out.println("3: Actualizar stock");
        System.out.println("4: Listar productos");
        
        do{
            opcion = sc.nextInt();
            sc.nextLine();
            switch(opcion){
                case 0 ->
                    System.out.println("Chao");
                    
                case 1 ->{
                    System.out.println("Dame el codigo del producto: ");
                    String cod = sc.nextLine();
                    if (repuestos.containsKey(cod)){
                        System.out.println("Ya existe este codigo");
                    } else{
                        System.out.println("Cuanto stock hay: ");
                        int stock = sc.nextInt();
                        repuestos.put(cod, stock);
                    }
                }
                
                case 2 ->{
                    System.out.println("Dame el codigo del producto: ");
                    String cod = sc.nextLine();
                    repuestos.remove(cod);
                }
                
                case 3 ->{
                    System.out.println("Dame el codigo del producto: ");
                    String cod = sc.nextLine();
                    int stock = sc.nextInt();
                    repuestos.put(cod, stock);
                }
                
                case 4 ->{
                    System.out.println(repuestos);
                }
            }
        } while(opcion != 0);
    }
} 