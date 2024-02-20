import java.time.Period;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.Scanner;

public class Calculo_dias_vividos {
    
    public static void main(String[] args) {
        Scanner pablo = new Scanner(System.in);
        int dia; 
        int mes;  
        int año; 

        System.out.println("");
        System.out.println("Te adivino tu edad");
        System.out.println("Ingrese el dia");   
        dia = pablo.nextInt();
        while(dia < 1 || dia > 31){
            System.out.println("Por favor, ingrese una dia valido");
        }
        System.out.println("Ingrese el mes");
        mes = pablo.nextInt();
        while (mes < 1 || mes > 12) {
            System.out.println("Por favor ingrese un mes valido");
            mes = pablo.nextInt();
        }
        System.out.println("Ingrese el año");
        año = pablo.nextInt();

        LocalDate nacimiento = LocalDate.of(año, mes, dia);
        LocalDate hoy = LocalDate.now();
        
        // Calcula la diferencia entre la fecha de nacimiento y la fecha actual
        Period periodo = Period.between(nacimiento, hoy);
        
        // Obtiene la cantidad de años, meses y días
        int años = periodo.getYears();
        int meses = periodo.getMonths();
        
        System.out.println("Usted tiene " + años + " años");

        // Desde este punto se calculan los dias vividos
        LocalDateTime ahora = LocalDateTime.now();
        int dia_hoy = ahora.getDayOfMonth();
        int mes_hoy = ahora.getMonthValue();
        int año_hoy = ahora.getYear();

        int dias_vividos = 0;
        int aux_dias = 0;
        dias_vividos = años * 365;
        if(mes < mes_hoy){
            dias_vividos = dias_vividos + ((mes_hoy - mes)*30);
        }
        else{
            if(mes == mes_hoy && dia > dia_hoy){
                dias_vividos = dias_vividos + (dia - dia_hoy);
            }
            else{
            if(mes > mes_hoy){
                dias_vividos = dias_vividos + ((12 + (mes_hoy - mes))*30);
                if(dia > dia_hoy){
                    dias_vividos = dias_vividos + (dia_hoy - dia); // restar dias excedidos
                }
            }
        }
    }
    if (dia < dia_hoy){
        dias_vividos = dias_vividos + (dia_hoy - dia);
    }

        // System.out.println( dia_hoy + " " + mes_hoy + " " + año_hoy);
        System.out.println("Usted ha vivido: " + dias_vividos);

        pablo.close();
    }
}
