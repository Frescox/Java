/*  Lopez Galicia Luis Angel
    Ejercicio 3
    El código siguiente consiste en el ingreso de una palabra por teclado y el programa contará la cantidad de letras existentes en ella.
*/

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Calculo_años {
    public static void main (String [] args){
        Scanner ptr = new Scanner (System.in);
        int dia; 
        int mes;  
        int año; 

        System.out.println("");
        System.out.println("Te adivino tu edad");   

        System.out.print("Dia:\t");
        dia = ptr.nextInt();
        while(dia < 1 || dia > 30){
        System.out.print("Ingrese un dia correcto (1-30)\n");
        System.out.print("Dia:\t");
        dia = ptr.nextInt();
    }
        System.out.println("Ingrese el mes");
        mes = ptr.nextInt();
        while (mes < 1 || mes > 12) {
            System.out.println("Por favor ingrese una fecha valida");
            mes = ptr.nextInt();
        }
        System.out.println("Ingrese el año");
        año = ptr.nextInt();

        LocalDate nacimiento = LocalDate.of(año, mes, dia);
        LocalDate hoy = LocalDate.now();
        
        // Calcula la diferencia entre la fecha de nacimiento y la fecha actual
        Period periodo = Period.between(nacimiento, hoy);
        
        // Obtiene la cantidad de años, meses y días
        int años = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();
        
        System.out.println("Usted tiene " + años + " años " + meses + " meses " + dias + " dias");
        
        int dias_vividos = años * 365;
        dias_vividos = dias_vividos + (meses * 30);
        dias_vividos = dias_vividos + dias;
        //dias_vividos = dias_vividos + años_bisiestos;
        
        System.out.println("Usted ha vivido " + dias_vividos);

        ptr.close();
    }
}
