
package examen;
import java.util.Scanner;

 class EJER2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean bandera;
        int n;
        n=0;    bandera=true;
        
        System.out.println("Ingrese el tamaño de la matriz ");
        n=leer.nextInt();
        int [][] Simetrica= new int [n][n];
        System.out.println("");
        for(int i=0; i <n; i++){
            for(int j=0; j <n ; j++){
                System.out.println("Ingresar datos de la matriz en la posición Simetrica["+i+"]["+j+"]= ");
                Simetrica[i][j] = leer.nextInt();
            }
        }
        bandera = verificar(n,Simetrica);
        if(bandera = false){
            System.out.println("La matriz cuadrada ingresada no es simetrica");
        }else{
            
            System.out.println("La matriz cuadrada ingresada es simetrica");
        }

    }
    public static boolean verificar(int n,int Simetrica[][]){
        boolean bandera;
        bandera=true;
        
        for(int i=0; i <n; i++){
            for(int j=0; j <n ; j++){
                if(Simetrica[i][j] != Simetrica[j][i]){
                    bandera = false;
                    i=n;
                    break;
                }
                else{
                    bandera = true;
                }
            }
        }
        return bandera;
    }
}
