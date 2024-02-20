// package ejercicios;
/*  Lopez Galicia Luis Angel
    Ejercicio 6
    Este código consiste en la validación de varias variables que serán definidas por el usuario.
*/
import java.util.Scanner;

public class Ejercicio_6 {
    public static void main (String [] args){
        Scanner ptr = new Scanner (System.in);
        String nombre, paterno, materno;
        ;

        do{
            System.out.println("Nombre: ");
            nombre = ptr.nextLine();
        }while(dcds.strvacio(nombre)== true);
        do{
            System.out.println("Paterno: ");
            paterno = ptr.nextLine();
        }while(dcds.strvacio(paterno)== true);    

            System.out.println("Materno: ");
            materno = dcds.leeString();  

        String mes_nacimiento, dias_nacimiento;
        do{
        System.out.println("Mes de nacimiento: ");
        mes_nacimiento = ptr.nextLine();
        }while(dcds.num_posit(mes_nacimiento) == false ||
        dcds.rango(Integer.parseInt(mes_nacimiento), 12, 1) == false);

        mes_nacimiento = (mes_nacimiento.length() == 1) ? "0" + mes_nacimiento : mes_nacimiento;
       // if(mes_nacimiento.length() == 1){
        // mes_nacimiento = "0" + mes_nacimiento;
        System.out.println("Dia de nacimiento:");
        dias_nacimiento = ptr.nextLine();

        System.out.println(mes_nacimiento);
        System.out.println("El nombre es: " + nombre);
        System.out.println("El mes es: " + mes_nacimiento);
        dcds.saludo();
    }
}
