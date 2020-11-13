import java.util.Scanner;
/**
 *   Clase de utilidades
 *   Incluye métodos estáticos
 *   
 *   @author - 
 */
public class Utilidades
{

    /**
     * Dado un número n (asumimos positivo)
     * devueve true si está en octal false en otro caso
     * Un nº está en octal si cada una de sus cifras
     * es un valor entre 0 y 7
     * 
     * (usa bucles while)
     */
    public static boolean estaEnOctal(int n) {
        
       while (n != 0){
            int resto = n % 10;
            if(resto == 8 || resto == 9){
                return false;
            }
            n /= 10;
        }
        return true;
    }

    /**
     * Dado un número n (asumimos positivo)
     * devuelve la cantidad de cifras que tiene
     * 
     * (usa bucles while)
     */
    public static int contarCifras(int n) {
        int cantidad = 0;
        int numero = n;

        while (numero > 0){
            numero = numero/10;
            cantidad++;
        }

        return cantidad;
    }

}
