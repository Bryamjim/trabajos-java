/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller5;

public class Taller5 {
import java.util.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     
        
        //Declaracion e inicializacion de variables
        int h24, m24, h12, m12;
        String periodo;
        
        h24 = 0; m24 = 0; h12 = 0; m12 = 0;
        periodo = "a.m";
        
        //Ingrese los datos
        System.out.println("Conversion de hora de 24 Horas a 12 Horas \n");
        System.out.println("Ingrese la hora en formato 24H: ");
        h24 = leer
        System.out.println("Ingrese los minutos en formato 24H: ");
        m24 = leer.ne
        //Proceso
        
        if (((h24 <= 24) && (h24 >= 0)) && ((m24 >= 0) && (m24 <= 60))){
            
            if (m24 == 60){
                h24 = h24 +1;
                m24 = 0;
            }
            else {
                m12 = m24;
            }
            if (h24 > 12){
                
                h12 = h24 - 12;
                periodo = "p.m";
                System.out.println("El tiempo de" +h24 +"horas y " +m24 +"minutos \n"
                        +"equivale a " +h12 +"horas y " +m12 +"minutos" +periodo);
            }
            else{
                h12 = h24;
                System.out.println("El tiempo de" +h24 +"horas y " +m24 +"minutos \n"
                        +"equivale a " +h12 +"horas y " +m12 +"minutos" +periodo);
            }     
    }
        else{
            System.out.println("Error: la hora o los numeros ingresados no son validos");
        }
    }
    
}
