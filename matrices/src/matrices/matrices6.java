//Bryam Jimenez
package matrices;

import java.util.Scanner;

public class matrices6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int  i , j, k, n, m, c, codigo, indmayor, sumap, mayor, temp; 
        i = 0; n = 0; m = 0; k = 0; codigo = 0; c = 0; j=0; sumap = 0; mayor = 0; temp = 0;
        
        System.out.println("Numero de aspirantes del proceso de selecci´on");
        m = leer.nextInt();
        
        System.out.println("Numero de criterios que se va a utilizar en la selecci´on");
        k = leer.nextInt();
        
        System.out.println("Numero de aspirantes que se va a seleccionar");
        n = leer.nextInt();
        
        double [][] C = new double [50][50];
        double [] P = new double [50];
        double [] Media = new double [50];
        double [] Pond = new double [50];
        double [] Codigo = new double [50];

        // Ciclo repetitivo para que lee el vector de codigos de los aspirantes
        for(i = 0; i < m; i++){
            System.out.println("Codigo"+i);
            Codigo [i] = leer.nextDouble();
        }
        // Ciclo repetitivo que lee los resultados de los criterios (C)
        // de cada aspirante
        for(i = 0; i<m; i++){
            for(j = 0; j < k; j++){
                System.out.println("C["+i+"] ["+j+"] :");
                C [i][j]= leer.nextDouble();
            }
        }
        // Ciclo de lectura del vector fila de ponderacion
        for(i = 0; i < k; i++){
            System.out.println("P"+i);
            P[i] = leer.nextDouble();
        }
        // Calculos base para la selecci´on de personal por el m´etodo
        // de promedio simple
        for(i = 0; i < m; i++){
            Media[i] = 0;
            for(j = 0; j < k; j++){
                 Media[i] = Media[i] + C[i][j];
            }
            Media[i] = Media[i]/k;
        }
        // Calculos base para la selecci´on de personal por la media ponderada
        // Ciclo que suma el vector fila de los valores ponderados
        sumap = 0;
        for(i = 0; i < k; i++){
            sumap = (int) (sumap + P[i]);
        }
        for(i = 0; i < m; i++){
            Pond[i] = 0;
            for(j = 0; j < k; j++){
                Pond [i] = Pond [i] + C [i][j] * P[j];
            }
        }
    }
    
    }

