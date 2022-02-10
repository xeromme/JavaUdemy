import java.sql.SQLOutput;
import java.util.Arrays;

//Tipos de Datos Primitivos:
public class DatosPrimitivos {

    public static void main(String[] args) {
        //definimos la variable entera
        int miVariableEntera = 14;
        System.out.println(miVariableEntera);
        //modificamos la variable entera
        miVariableEntera = 95;
        System.out.println(miVariableEntera);
        //definimos la variable cadena
        String miVariableCadena = "Saludos :D";
        System.out.println(miVariableCadena);
        //modificamos la variable cadena
        miVariableCadena = "Adiós :D";
        System.out.println(miVariableCadena);
        //Concatenación
        String nombre = "Jeromme";
        String apellido = "Pimienta";
        String nombreCompleto = nombre + " " + apellido + " " + "Reséndiz";
        System.out.println(nombreCompleto);

    }
}