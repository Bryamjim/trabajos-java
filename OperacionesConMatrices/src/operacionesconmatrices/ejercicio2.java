
package operacionesconmatrices;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int i, j, m, aux;
        m = 0; aux = 0;
        
        System.out.println("Ingrese el tamaño de la matriz");
        m = leer.nextInt();
        
        int[][] A = new int[m][m];
        
        //Ingreso de los datos de la matriz A
        System.out.println("Ingrese los elemetos de la matriz A");
        for (i = 0;  i < m; i++) {
            for (j = 0; j < m; j++){
                    System.out.println("A[" +i +"][" +j +"] : " );
                    A[i][j] = leer.nextInt();
            }
        }
        for (i = 0;  i < m; i++) {
            for (j = aux; j < m; j++){
                    A[i][j] = 0;
                    if (j == m - 1){
                        aux = aux + 1;
                    }
            }
            if (i == m - 2){
                i = m;
            }
        }
        for (i = 0;  i < m; i++) {
            for (j = 0; j < m; j++){
                    System.out.print(" " +A[i][j] );   
            }
            System.out.println("");
        }    
    }
}
