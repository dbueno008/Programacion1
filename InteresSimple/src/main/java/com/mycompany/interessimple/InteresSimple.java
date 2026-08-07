/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interessimple;
import java.util.Scanner;


/**
 *
 * @author rasta
 */
public class InteresSimple {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        //VARIABLES
        double capital = 0;
        int tasa = 0;
        int tiempo = 0;
        double interes = 0;
        
        System.out.println("Ingrese el capital inicial:");
        capital = teclado.nextDouble();
        
        System.out.println("Ingrese la tasa de interes anual (numero entero):");
        tasa = teclado.nextInt();
        
        System.out.println("Ingrse el tiempo en años");
        tiempo = teclado.nextInt();
        
        //FORMULA
        interes = (capital * tasa * tiempo) / 100;
        
        System.out.printf("El interes generado es: %.2f \n", interes);
        
        
        
        
        
    }// FIN DE MAIN
    
    
    
}// FIN DE CLASS
