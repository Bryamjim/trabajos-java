
package operacionesconmatrices;
import java.util.Scanner;
public class ejercico3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int i, j, fA, cA, fB, cB, a, suma;
         
        suma = 0; 
        System.out.println("Ingrese el numero de filas de la matriz A: ");
        fA = leer.nextInt();
        System.out.println("Ingrese el numero de columnas de la matriz A:");
        cA = leer.nextInt();
        System.out.println("Ingrese el numero de filas de la matriz B:"); 
        fB = leer.nextInt();
        System.out.println("Ingrese el numero de columnas de la matriz B: ");
        cB = leer.nextInt();
 
        if (cA==fB){
            int[][] A = new int [fA][cA];
            int[][] B = new int [fB][cB];
            int[][] Producto = new int [fB][cB];
            //Ingreso de los Datos de la Matriz A 
            System.out.println("Ingrese los elemtos de la Matriz A:");
            for (i = 0; i < fA; i++){
                for(j = 0; j < cA; j++){
                    System.out.println(" A["+i+"] ["+j+"] :");
                    A [i][j] = leer.nextInt();
                }
            }
            //Ingreso de los Datos de la Matriz B 
            System.out.println("Ingrese los elemtos de la Matriz B:");
            for (i = 0; i < fB; i++){
                for(j = 0; j < cB; j++){
                    System.out.println(" B["+i+"] ["+j+"] :");
                    B [i][j] = leer.nextInt();
                }
            }
            for (a = 0; a < cB; a++){
                for (i = 0; i < fA; i++){
                    for(j = 0; j < cA; j++){
                        suma = suma + A[i][j] * B[j][a];
                    }
                }
                Producto [i][a] = suma;
                suma = 0;
            }
            //Presentacion de Datos
            for (i = 0; i < fA; i++){
                for(j = 0; j < cA; j++){
                    System.out.println("A ["+i +"]["+j +"] : " +A[i][j]);
                }
            }
            for (i = 0; i < fA; i++){
                for(j = 0; j < cA; j++){
                    System.out.println("B ["+i +"]["+j +"] : " +B[i][j]);
                }
            }
            for (i = 0; i < fB; i++){
                for(j = 0; j < cB; j++){
                    System.out.println("Producto[" +i +"][" +j +"] :"+Producto[i][j]);
                }
            }
        }else{
            System.out.println("Las columnas de matriz A deben ser igual a las filas de la matriz B");
        }
    }
  
}
