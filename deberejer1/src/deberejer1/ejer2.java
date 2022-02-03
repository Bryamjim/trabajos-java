/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deberejer1;
import java.util.Scanner;
/**
 *
 * @author bryam
 */
public class ejer2 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        //Declaracion e Inicializacion de variables
        
        int añonaci, mesnaci, dianaci, añop, mesp, diap, añoactu, mesactu, diactu;
        
        añonaci = 0; mesnaci =0; dianaci = 0; añop = 0; mesp = 0; 
        diap = 0; añoactu = 0; mesactu = 0; diactu = 0;
        
        //Ingreso de datos de entrada
        System.out.println("Ingrese todos sus datos con números \n");
        
        System.out.print("Ingrese año de nacimiento: \n");
        añonaci = leer.nextInt();
        System.out.print("Ingrese mes de nacimiento: \n");
        mesnaci =leer.nextInt();
        System.out.print("Ingrese dia de nacimiento: \n");
        dianaci = leer.nextInt();
        
        System.out.print("Ingrese el año actual: \n");
        añoactu = leer.nextInt();
        System.out.print("Ingrese el mes actual: \n");
        mesactu = leer.nextInt();
        System.out.print("Ingrese el dia actual: \n");
        diactu = leer.nextInt();
        
        
        //proceso
        
        
        if(((mesnaci > mesactu)&&(mesactu <= 12)&&(mesnaci <= 12))){
            añop = (añoactu - añonaci)-1;
        }
        else{
            añop = añoactu - añonaci;
        }
        if(mesnaci < mesactu){
            mesp = (mesactu - mesnaci);
        }
        else{
            mesp = (mesnaci - mesactu);
        }
        if(dianaci > diactu){
            mesp = mesp + 1;
            diap = dianaci + diactu;
        }
        else {
            
            diap = diactu - dianaci ;
        }
        if(mesp > 12){
            añop = añop + 1;
        }
        if(diap > 30){
           diap = mesp + 1;
        }
        
        //salida
        System.out.println("la persona tiene "+añop + " años, " +mesp +" meses y " +diap +" días." );
    }
    
}
