/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.generaciondtoken;

import java.util.Random;
import java.util.Scanner;





/**
 *
 * @author rasta
 */
public class GeneracionDToken {

    public static void main(String[] args) {
       // TODO code application logic here
       Scanner sc = new Scanner(System.in);
       Random RD = new Random();
       
       String nombreEquipo = "a";
       boolean longitudCorrecta = true;
       boolean prefijoCorrecto = true;
       boolean validacionCorrecta = true;
       int tipoCaracter = 0;
       int numeroToken = 0;
       char letraToken = 'a';
       String Token = "s";
       
     
     do{
       
       System.out.println("Ingrese el nombre del equipo:");
       nombreEquipo = sc.nextLine().toUpperCase();
        
       System.out.printf("Nombre del equipo: %s\n", nombreEquipo);
       
       longitudCorrecta = nombreEquipo.length()== 8;
       prefijoCorrecto = nombreEquipo.startsWith("RT")  ||
               nombreEquipo.startsWith("SC");
       
       
        //System.out.println(longitudCorrecta);
        //System.out.println(prefijoCorrecto);
       
       
     validacionCorrecta = longitudCorrecta && prefijoCorrecto;
    
    } while (!validacionCorrecta);// se va a ejecutar al menos una vez, no importa sea T or F el lo
        System.out.println("Registro Correcto!");
    
        while (Token.length()<12){
        
            tipoCaracter = RD.nextInt(2);
            
            if (tipoCaracter ==0){
              numeroToken = RD.nextInt(10);
              Token = Token + numeroToken;
              
            }//FIN de if
            else {
           
              letraToken = (char)(RD.nextInt(26)+65);
            Token = Token + letraToken;
            
            }//FIN else
            
        }//FIN de While
        
        System.out.printf("Token es: %s", Token);
        
    }// FIN DE MAIN






}// FIN DE CLASS
