package a01;

import java.util.Arrays;

public class A01 {
    public static void main(String[] args) {

      String[] t1 = new String[0];

      t1 = guardar("buenos", t1);
      t1 = guardar("dias", t1);

      System.out.println(Arrays.toString(t1));

      
      Integer[] t2 = new Integer[0];

      t2 = guardar(1, t2);
      t2 = guardar(2, t2);

      System.out.println(Arrays.toString(t2));
    }
    
    // Método genérico <E> que devuelve un array E[]
    static <E> E[] guardar(E elem, E[] tabla) {
      // 1. Creamos una copia de la tabla original con 1 posición extra
      E[] nuevaTabla = Arrays.copyOf(tabla, tabla.length + 1);

      // 2. Insertamos el elemento en la última posición (length - 1)
      nuevaTabla[nuevaTabla.length - 1] = elem;

      // 3. Devolvemos el nuevo array
      return nuevaTabla;
    }
}
