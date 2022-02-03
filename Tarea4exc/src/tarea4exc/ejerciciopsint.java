//Bryam Joel Jiménez Hernández
package tarea4exc;
public class ejerciciopsint {
    public static void main(String[] args) {
        
        //Declaracion de variables 
        int suma, i;
        suma = 0; i = 1;
        
        //Proceso
        System.out.println("---SUMA DE LOS MULTIPLOS DE 3 O 5");
        while (i <=999){
            if ((i % 3 == 0) && (i % 5 == 0)){
                suma = suma + i;
            }
            i = i + 1;
        }
        System.out.println("La Respuesta: " +suma);
    }
   
}
