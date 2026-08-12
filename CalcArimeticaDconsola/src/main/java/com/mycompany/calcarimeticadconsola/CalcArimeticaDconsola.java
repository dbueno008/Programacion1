/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calcarimeticadconsola;

import java.util.Scanner;

//Calculadora Aritmética de Consola
public class CalcArimeticaDconsola {

    public static void main(String[] args) {
           // TODO code application logic here
           Scanner sc = new Scanner(System.in);
    
    
           //VARIABLES
           
           int primerNumero = 0;
           int segundoNumero = 0;
           char operador = 'a';
           double resultadoFinal = 0;
           
           
           /// PRINT
           
           System.out.println("Cual es el primer Numero?:");
              primerNumero = sc.nextInt();
           
              System.out.println("Cual es el segundo Numero?:");
              segundoNumero = sc.nextInt();
           
               sc.nextLine();
               System.out.println("Cual es el operador?(+, -, *, /, %):");
               operador = sc.nextLine().charAt(0);
           
           if (operador == '+') {
    resultadoFinal = primerNumero + segundoNumero;
    System.out.printf("El resultado es %.2f", resultadoFinal);
}
     else if (operador == '-') {
    resultadoFinal = primerNumero - segundoNumero;
    System.out.printf("El resultado es %.2f", resultadoFinal);
}
           
          else if (operador == '*') {
    resultadoFinal = primerNumero * segundoNumero;
    System.out.printf("El resultado es %.2f", resultadoFinal);
}
    else if (operador == '/') {
    if (segundoNumero == 0){
        System.out.println("No se puede dividir entre cero");
    }
    else{
    resultadoFinal = primerNumero / segundoNumero;
    System.out.printf("El resultado es %.2f", resultadoFinal);
}
    }
    else if (operador == '%') {
    resultadoFinal = primerNumero % segundoNumero;
    System.out.printf("El resultado es %.2f", resultadoFinal);
}
    else {
               System.out.println("Operador no reconocido");
    }
    
           
           
    }// FIN MAIN


}//FIN CLASS
