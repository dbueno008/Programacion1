/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculo2var;

import java.util.Scanner;

/**
 *
 * @author rasta
 */
public class Calculo2Var {

    public static void main(String[] args) {
          // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        
        //VARIABLES 
        double base = 0;
        double altura = 0;
        double area = 0;
        double perimetro = 0;
        
        System.out.println("Ingrese la base del rectangulo:");
        base = teclado.nextDouble();
        
        System.out.println("Ingrese la altura del rectangulo:");
        altura = teclado.nextDouble();
        
        //FORUMLAS
        area = base * altura;
        perimetro = (base * 2) + (altura * 2);
        
        System.out.printf("Elarea del rectangulo es: %.2f \n", area);
        System.out.printf("El perimetro del rectangulo es: %.2f \n", perimetro);
        
        
    }// FIN DE MAIN
    
    
    
}// FIN DE CLASS
