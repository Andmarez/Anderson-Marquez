
package ejercicio4p2;
import java.util.Scanner;
public class Ejercicio4P2 {
    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        String cadena= "";
        System.out.println("ingrese un caracter: ");
        String caracter = ingresar.nextLine();
        for (int i=1;  i<=20; i++){
            cadena = cadena + caracter;
            System.out.println(cadena);
            }
    
    }
    
}
