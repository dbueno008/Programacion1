/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.radiocirculo;


import java.util.Scanner;

/**
 *
 * @author rasta
 */
public class RadioCirculo {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        //VARIABLES
        double radio = 0;
        double area = 0;
        double circunferencia = 0;
        
        System.out.println("Ingrese el radio del circulo:");
        radio = teclado.nextDouble();
        
        //FORMULAS
        
        area = Math.PI * Math.pow(radio, 2);
        circunferencia = 2* Math.PI * radio;
        
        System.out.printf("El area del circulo es: %.2f \n", area);
        System.out.printf("La circunferencia del circulo es: %.2f \n", circunferencia);
       
        
    }// FIN DE MAIN 




}// FIN DE CLASS

