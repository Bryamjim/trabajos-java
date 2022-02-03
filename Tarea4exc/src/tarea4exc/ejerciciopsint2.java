//Bryam Joel Jiménez Hernández
package tarea4exc;
import java.util.Scanner;

public class ejerciciopsint2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declaracion e Inicializacion de variables
        int sdn, nd, n, cn;
        
        sdn = 0; nd = 0;
        
        //Ingreso de datos
        System.out.println("Dgite un número entero");
        n = leer.nextInt();
        
        //´Proceso
        
        cn = n;
        
        if (cn < 0) {
            cn = -cn;
        }
        if (cn == 0){
            //Si el número es 0, entonces n tiene 1 dígito
            //y la suma de sus cifras es 0
            sdn = 0;
            nd = 1;
            
        }
        else {
            do{
                //Se acumula la suma de las cifras
                sdn = sdn + (cn % 10);
                nd = nd + 1;
                //Se descarta la cifra sumada
                cn = cn / 10;
                
            }while (cn > 0);
        }
        System.out.println(n+" tiene " +nd +" dígitos y la suma de los dígitos de" +n +" es:" +sdn);
    }
    
}
