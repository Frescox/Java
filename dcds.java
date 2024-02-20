// package ejercicio_7;
/*  Lopez Galicia Luis Angel
    Partes de los ejercicios 6 y 7
    En este código se encuentran todas las funciones que validan las variables de los ejercicios 6 y 7
*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class dcds {
    public static void saludo(){
        System.out.print("Hola mundo");
    }

    public static boolean strvacio(String dato){
        if(dato == ""){
            return true;
        }
        else{
            return false;
            }
        }

    public static String leeString(){
            Scanner ptr = new Scanner (System.in);
            String dato;
            do{
            dato = ptr.nextLine();
            return dato;
        }while(dcds.strvacio(dato) == true);
            
        }

    public static boolean num_posit(String dato){
        int num = 0;
        try{
        num = Integer.parseInt(dato);
            if(num > 0){
                return true;
            }
            else{
                return false;
            }
            }
        catch(Exception error){
            // System.out.println(error.getMessage());
            return false;
            }
        }  
        
        public static boolean num_neg(String dato){
            int num = 0;
            try{
            num = Integer.parseInt(dato);
                if(num < 0){
                    return true;
                }
                else{
                    return false;
                }
                }
            catch(Exception error){
                // System.out.println(error.getMessage());
                return false;
                }
            }  

            public static boolean num(String dato){
                int num = 0;
                try{
                num = Integer.parseInt(dato);
                        return true;
                    }
                catch(Exception error){
                    // System.out.println(error.getMessage());
                    return false;
                    }
                } 

        // valida que el num esté en un rango de 1 a 12
        public static boolean rango(int num, int superior, int inferior){
            if(num >= inferior && num <= superior){
                return true;
            }
            else{
                return false;
                }
            }
        
        // no contempla los espacios en blanco
        // para espacio en blanco dato.matches("[a-zA-Z ]+")
        public static boolean onlyStr(String dato){
            if(dato.matches("[a-zA-Z]+")){
                return true;
            }
            else{
                return false;
            }

            }

    public static boolean codigo_postal(String dato){
        return (dato.length() == 5 && num_posit(dato));
        // if(dato.length() == 5 && num_posit(dato)){
        //    return true;
        // }
        // else{
        //    return false;
        // }
        }

    public static boolean colonia(String dato){
        return (dato.matches("[a-zA-Z0-9 ]+"));
    }

    public static boolean telefono(String dato){
        return (dato.matches("[0-9]+[10]"));
    }

    public static boolean correo(String email){
         // Patrón para validar el email
                Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$");

                // El email a validar

                Matcher mather = pattern.matcher(email);

                if (mather.find()) {
                    System.out.println("El correo ingresado es válido.");
                    return true;
                } else {
                    System.out.println("El correo ingresado es inválido.");
                    return false;
                }
    }
   }



