/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3p3;
import java.util.Scanner;
public class Ejercicio3p3 {  
    public static void main(String[] args) {
        Scanner Reader = new Scanner(System.in);
        int contador;
        int fin;
        System.out.println("por favor ingrese el valor inicial (contador)");
        contador = Reader.nextInt();
        System.out.println("por favor ingrese el valor final");
        fin = Reader.nextInt();
        while(contador <= fin){
        System.out.println("valor actual de la iteracion "+contador);
        contador++;
        }
        // TODO code application logic here
    }
    
}
