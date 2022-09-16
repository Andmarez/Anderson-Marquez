/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1p3;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ejercicio1P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingresar=new Scanner (System.in);
        double nota;
        
        System.out.println("favor ingresar un valor desde 1 hasta 10");
        nota=ingresar.nextDouble();
        
        while(nota<1 | nota>10)
        {
        System.out.println("Lo siento mucho pero el valor proporcionado no es correcto");
        nota=ingresar.nextDouble();
        }
            
    }
    
}
