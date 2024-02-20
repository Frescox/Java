import java.util.Scanner;

public class Generar_RFC {
    public static void main (String[] args) {
        Scanner ptr = new Scanner(System.in);
        int mes, dia;
        String nombre, paterno, materno, iniciales, rfc, año;
        // String año, mes, dia;

        System.out.println("Año:");
        año = ptr.nextLine();
        char [] Año = año.toCharArray();
        int total = Año.length;
                if(total >= 3){
                    año = año.substring(2,4);
                }

        System.out.println("Mes:");
        mes = ptr.nextInt();
        while(mes<0 && mes>12){
            System.out.println("Ingrese un mes existente.");
            mes = ptr.nextInt();
        }

        System.out.println("Dia:");
        dia = ptr.nextInt();
        while(dia<0 && dia>31){
            System.out.println("Ingrese un dia existente.");
            dia = ptr.nextInt();
        }

    do{
    ptr.nextLine();
    System.out.println("Nombre:");
    nombre = ptr.nextLine();
    }while(nombre == "");
    do{
    System.out.println("Paterno:");
    paterno = ptr.nextLine();
    }while(nombre == "");
    do{    
    System.out.println("Materno:");
    materno = ptr.nextLine();
    }while(nombre == "");
    iniciales = paterno.substring(0,1).toUpperCase() + materno.substring(0,1).toUpperCase() + nombre.substring(0,1).toUpperCase();
    // inventar algoritmo de homoclave
        // Letra aletoria
        // Calculo con los codigo ascci
    rfc = iniciales + año + String.format("%02d", mes) + String.format("%02d", dia);
    // System.out.println(paterno.toUpperCase());

    int a = (int) (Math.floor(Math.random() * 3)); // genera valores aleatorios de 0 a 2
    int b = (int) (Math.floor(Math.random() * 3)); // genera valores aleatorios de 0 a 2
    //char[] rfc_Char = rfc.toCharArray();
    char una_letra = rfc.charAt(a); // Separa una letra aleatorio del string rfc
    char otra_letra = rfc.charAt(b); // Separa otra letra aleatoria del string rfc

    int valorASCII_1 = (int) una_letra;
    int valorASCII_2 = (int) otra_letra;

    int valor_definitivo = (valorASCII_1 + valorASCII_2) / 2;
    char [] ascci_definivo = Character.toChars(valor_definitivo);

    rfc = rfc + ascci_definivo[0] + ((int) (Math.floor(Math.random() * (99-10 +1)) + 10));

    System.out.println("\nTu RFC es:" + rfc);

    ptr.close();
}
}
