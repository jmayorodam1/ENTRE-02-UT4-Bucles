import java.util.Scanner;
/**
 *  Clase que dibuja una figura 
 * 
 * @author - 
 *  
 */
public class PintorFiguras
{
    private static final int ANCHO_BLOQUE = 4;
    private static final char ESPACIO = ' ';
    private static final char CAR1 = 'B';
    private static final char CAR2 = '=';


    /**
     * Dibuja una figura (ver enunciado) de altura
     * indicada (se asume la altura un valor correcto)
     * 
     * (usa bucles for)
     */
    public  void dibujarFigura(int altura) {
        
      for(int fila = 1; altura <= fila; fila++){
            System.out.println(CAR1 * ANCHO_BLOQUE);
                if(fila > 1){
                    System.out.print(CAR1 * ANCHO_BLOQUE + CAR2 * ANCHO_BLOQUE);
                
                }
            for (int col = 1; altura <= col; col++){
                System.out.print("\n");

            }
        }
        System.out.println();
    
}

    /**
     * Método privado de ayuda que escribe n espacios en la misma línea
     */
    private  void escribirEspacios(char caracter, int n) {
         

    }
}
