/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generador_de_numeros;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author AleMor
 */
public class ficheros {

public static void main(String [] arg) {
     
        
      Random dado = new Random();
      int numeros []= new int[1000000];
      Numeros archivo = new Numeros();
      int op = 0;
      int numero;
      String nombreArchivo = "";
      do{
          System.out.println("------------------------------------------------------");
          System.out.println("|             'Generador de numeros 2022'             |");
          System.out.println("|-----------------------------------------------------|");
          System.out.println("| 1. Desencadenar un millon de numeros aleatoriamente |");
          System.out.println("| 2. Ordenar y leer el archivo                        |");
          System.out.println("| 3. Salir                                            |");
          System.out.println("|-----------------------------------------------------|");
          System.out.println(" ");
          System.out.print("\t\t\tElija Su Opcion: ");
         Scanner entrada=new Scanner(System.in);
         op = entrada.nextInt();
          switch(op){
                             
             case 1:
              
               for(int i=0; i<1000000;i++){
                  do{
                   numero=dado.nextInt();
                     }while(numero<-10000000||numero>10000000);
                numeros[i]=numero;
                }
                  System.out.print("Nombre del archivo: ");
        nombreArchivo =entrada.next();
      archivo.grabar(nombreArchivo+".txt", numeros);
      
                  break;
                  
              case 2:
                     System.out.print("Nombre del archivo: ");
                     nombreArchivo =entrada.next();
                     archivo.lectura(nombreArchivo+".txt");
                  break;
                  
              case 3:
                  System.out.println("****** PROGRAMA FINALIZADO *********");
                  break;
          }
      }while(op!=3);
     
            }
    
}


    

