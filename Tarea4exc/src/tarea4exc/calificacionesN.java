//Bryam Joel Jiménez Hernández
package tarea4exc;
import java.util.Scanner;

public class calificacionesN {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declaracion e inicialización de variables
        int n, alum, aprob, reprob; 
        
        double nota;
        n = 0; alum = 1 ;aprob = 0 ;reprob = 0; nota = 0;
        
        //Ingreso de datos
        System.out.print("Ingrese cuantos alumnos va a calificar: ");
        n = leer.nextInt();
        do{
            System.out.println("Ingrese la nota del estudiante: ");
            nota = leer.nextDouble();
            if(nota < 7){
                reprob = reprob + 1;
                  
            }
            else{
                aprob = aprob + 1;
            }
            alum = alum + 1;
        
        }while(alum <= n);
        System.out.println("La cantidad de alumnos que aprobaron fueron: "+aprob);
        System.out.println("La cantidad de alumnos que reprobaron fueron: "+reprob);
    }
}
