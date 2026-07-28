/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversiones;

import java.util.Scanner;

/**
 *
 * @author rasta
 */
public class Conversiones {
    /**
     * 
     */
       
    

    public static void main(String[] args) {
        // TODO code aapplication logic here
        Scanner teclado = new Scanner(System.in);
        // Declarar Variables
        int pulgadas = 0;
        double resultadoCM = 0;
        double farenheit = 0;
        double celsius = 0;
        double kilometros = 0;
        double millas = 0;
        
        pulgadas = 10; // Los datos van de dere a IZQ -> =
        resultadoCM = pulgadas * 2.54;
        System.out.printf("%d pulgadas es igual a %.2f cm",pulgadas,resultadoCM);
        
        pulgadas = 35;
        resultadoCM = pulgadas * 2.54;
        System.out.printf("\n%.2f cm es igual a %d pulgadas",resultadoCM,pulgadas);
        
        System.out.println("");
        System.out.println("Cuantos kilometros hay de TGU - SPS?");
        kilometros = teclado.nextDouble();
        millas = kilometros /1.6;
        System.out.printf("%.2f km es igual a %.2f millas \n",kilometros,millas);
        System.out.print(kilometros + "km es igual a"+ millas + "millas");
        
       
        System.out.printf("\n Ingrese la temperatura en farenheit");
        farenheit = teclado.nextDouble();
        celsius = (farenheit -32) * 5/9;
        System.out.printf("\n %.2f Farenheit equivale a %.2f grados celsius",farenheit,celsius);
        System.out.println("");
        
        
        
    }// Fin de Main
    
    
}// Fin de Class
