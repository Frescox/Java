import java.util.Scanner;

public class Contar_vocales {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Contador de Vocales");

        String palabra;
        System.out.print("Escribe una palabra: ");
        palabra = lector.next();
        char[] chars = palabra.toCharArray();
        int cont = 0; 
        int total = chars.length;

        for (int i = 0; i < total; i++) {
            if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u' 
            || chars[i] == 'A' || chars[i] == 'E' || chars[i] == 'I' || chars[i] == 'O' || chars[i] == 'U' ) {
                cont++;
            }
        }

        System.out.println(palabra + " tiene " + cont + " vocales en total.");
        lector.close();
    }
}
