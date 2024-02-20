// package ejercicio_7;
import java.util.Scanner;

public class ejercicio_7 {
    public static void main( String [] args){
        String nombre, paterno, materno, email, calle, codigo_postal, colonia, ciudad, telefono;
        Scanner ptr = new Scanner (System.in);
        System.out.println("Nombre: ");
        nombre = ptr.nextLine();
        System.out.println("Paterno: ");
        paterno = ptr.nextLine();
        System.out.println("Materno: ");
        materno = ptr.nextLine();
        System.out.println("Calle: ");
        calle = ptr.nextLine();
        do{
        System.out.println("Codigo Postal: ");
        codigo_postal = ptr.nextLine();
        }while(dcds.codigo_postal(codigo_postal) == false);
        
        do{
        System.out.println("Colonia: ");
        colonia = ptr.nextLine();
        }while(dcds.colonia(colonia) == false);

        do{
        System.out.println("Telefono: ");
        telefono = ptr.nextLine();
        }while(dcds.telefono(telefono) == false);

        do{
        System.out.println("Correo electronico: ");
        email = ptr.nextLine();
              }while(dcds.correo(email) == false);

        System.out.println("Ciudad: ");
        ciudad = ptr.nextLine();
        ptr.close();  
      }
}
