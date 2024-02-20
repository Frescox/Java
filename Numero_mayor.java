/*  Lopez Galicia Luis Angel
    Ejercicio 3
    El código siguiente consiste en el ingreso de 3 valores enteros por teclado y el programa comparará todos los valores hasta definir al mayor.
*/

import java.util.Scanner;

public class Numero_mayor {
    public static void main(String [] args){
    Scanner ptr = new Scanner(System.in);
    int num_1, num_2, num_3;
    System.out.print("Ingrese 3 numeros\n");
    System.out.print("Numero 1: ");
    num_1 = ptr.nextInt();
    System.out.print("\nNumero 2: ");
    num_2 = ptr.nextInt();
    System.out.print("\nNumero 3: ");
    num_3 = ptr.nextInt();

    if(num_1 > num_2 && num_1 > num_3){
        System.out.println("\n" + num_1 + " es el numero mayor.");
    }
    else{
        if(num_2 > num_1 && num_2 > num_3){
            System.out.println("\n" + num_2 + " es el numero mayor.");
        }
        else{
            if(num_3 > num_1 && num_2 > num_1){
                System.out.println("\n" + num_3 + " es el numero mayor.");
            }
            else{
                if(num_1 == num_2 || num_1 == num_3 || num_2 == num_3){
                System.out.println("\nLos numeros tienen el mismo valor = " + num_1);
                }
            }
        }
    }
ptr.close();
}
}
