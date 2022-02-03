//Bryam Jimenez
package examen;
import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int i,j,l,negativos,primos,d,n,pares;
        n=0;primos=0;negativos=0;d=0;pares=0;
      
        System.out.println("Escriba el tamaño de la matriz ");
        n=leer.nextInt();
        int []A= new int [n];
        for(i=0; i <n; i++){
            System.out.println("Ingresar datos de la matriz, posicion["+i+"]= ");
            A[i] = leer.nextInt();
        }
        primos= contarPrimos(A,n);
        negativos = contarNegativos(A,n);
        pares = contarPares(A,n);
        
        
        
        int []Vprimos= new int [primos];
        int []Vpar= new int [pares];
        int []Vnegativo= new int [negativos];
        l=0;
        for( i=0; i <n; i++){
            d=0;
            for ( j = 1; j <=A[i]; j++) {
                if(A[i]%j==0){
                   d=d+1; 
                }
            }
            if(d==2){
                Vprimos[l] = A[i];
                l=l+1;
            }
        }
        j=0;
        for( i=0; i <n; i++){    
            if(A[i]<0){
                
                Vnegativo[j] = A[i];
                j=j+1;
            }
        }
        j=0;
        for( i=0; i <pares; i++){
            if(A[i]%2 == 0){
                Vpar[j]=A[i];
                j=j+1;
            }   
            
        }
        
        
    
        System.out.println("Hay "+ pares+" números pares que son el ("+pares+"/"+n+") del total de números");
        System.out.println("Hay "+ negativos+" números negativos que son el ("+negativos+"/"+n+") del total de números");
        System.out.println("Hay "+ primos+" números primos que son el ("+primos+"/"+n+") del total de números");
        
        System.out.println("PAR:");
        for (i = 0; i < pares; i++) {
            System.out.println ( Vpar[i]);
        }
        System.out.println("NEG: ");
        for (i = 0; i < negativos; i++) {
            System.out.println ( Vnegativo[i]);
        }
        System.out.println("PRIMOS:  ");
        for (i = 0; i < primos; i++) {
            System.out.println ( Vprimos[i] );
        }
    }
    public static int contarPrimos(int B[],int m){
        int i,j,d,primos;
        primos=0; d=0;
        for( i=0; i <m; i++){
            for ( j = 1; j <=B[i]; j++) {
                if(B[i]%j==0){
                   d=d+1; 
                }
            }
            if(d==2){
                primos=primos+1;
            }
            d=0;
        }
        return primos;
    }
    public static int contarNegativos(int B[],int m){
        int i,negativos;
        negativos=0;
        for( i=0; i <m; i++){
            if(B[i]<0){
                negativos=negativos+1;
            }
        }
        return negativos;
    }
    public static int contarPares(int B[],int m){
        int i,pares;
        pares=0;
        for( i=0; i <m; i++){
            if(B[i]%3 != 0){
                pares=pares+1;
            }
        }
        return pares;
    }
}
