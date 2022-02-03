/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convercion.metros;
import javax.swing.*;

/**
 *
 * @author 
 */
public class ConvercionMetros {
   
    private static int km;
    private static int cm;
    private static int pie;
    private static int pulgadas;


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double metros = Double.parseDouble(JOptionPane.showInputDialog(null, "Inserte el numero de metros a convertir"));
        
        //Identificacion de variables 
        km = 0; 
        cm = 0;
        pie = 0;
        pulgadas = 0;
        
        //Identificacion de variable y Entrada
        //ENTRADA
        double km = 0.001 *metros; 
        double cm = 100 *metros; 
        double pie = 3.28084 *metros; 
        double pulgadas = 39.3701 *metros;
        
        //PROCESO Y SALIDA
        JOptionPane.showMessageDialog(null,"La convercion de: "+metros+" metros es igual a: "
        + "\n\n" +km+ " Kilometros"
        + "\n\n" +cm+ " Centimetros"
        + "\n\n" +pie+ " Pies"
        + "\n\n" +pulgadas+ " Pulgadas");
        
        
                
                
    }
    
}
