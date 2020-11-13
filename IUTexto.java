import java.util.Scanner;
/**
 * Modela el interfaz para interactuar con el usuario
 * @author - 
 */
public class IUTexto
{
    private Scanner teclado;
    private CalculadoraOctal calculadora;
    private PintorFiguras pintor;

    /**    
     * Constructor  
     */
    public IUTexto(CalculadoraOctal calculadora, PintorFiguras pintor)
    {
        this.teclado = new Scanner(System.in);
        this.calculadora = calculadora;
        this.pintor = pintor;
    }

    /**
     * Controla la lógica de la aplicación
     */
    public void iniciar()
    {
        hacerSumasOctales();
        dibujarFiguras();

    }

    /**
     *  - borrar la pantalla
     *  - pedir al usuario un par de números
     *  - si los números no están en octal mostrar un mensaje
     *  - si los números no tienen el mismo número de cifras mostrar un mensaje
     *  - si son correctos calcular su suma octal y mostrar el resultado en pantalla
     *  - los pasos anteriores se repiten mientras el usuario quiera (pulsa 'S' o 's')
     *  
     */
    private void hacerSumasOctales()
    {
        System.out.print('\u000C');
        System.out.println("Teclee numero1: ");
        int numero1 = teclado.nextInt();
        System.out.println("Teclee numero2: ");
        int numero2 = teclado.nextInt();
        int octal = 0;
        
        
        if(numero1 != octal){

            while (numero1 != 0){
                int resto = numero1 % 10;
                if(resto == 8 || resto == 9){
                    System.out.println("No es octal");
                }
                numero1 /= 10;
            }
            

        }
        
         if(numero2 != octal){

            while (numero2 != 0){
                int resto = numero2 % 10;
                if(resto == 8 || resto == 9){
                    System.out.println("No es octal");
                }
                numero2 /= 10;
            }
            

        }
        
        if( numero1 != numero2){
          int cifras1 = 0;
        while(numero1 > 0){
            numero1 = numero1/10;
            cifras1++;

        }
        
            int cifras2 = 0;
        while(numero2 > 0){
            numero2 = numero1/10;
            cifras2++;

        }
        
        if(cifras1 != cifras2){
            System.out.println("Los numeros no tienen las mismas cifras");
        
        }
        else if(cifras1 == cifras2){
                   
        int octal1 = 0;
        int octal2 = 0;
        int p = 0;

        while(numero1 != 0){
            int resto =  numero1 % 8;
            octal1 += (int) Math.pow(10,p) * resto;
            numero1 /= 8;
            p++;

        }
        
        p = 0;
         while(numero2 != 0){
            
             int resto =  numero2 % 8;
            octal2 += (int) Math.pow(10,p) * resto;
            numero2 /= 8;
            p++;

        }
        int aux = octal1 + octal2;
        
        
        
        }
      }
      
       
        // if( "s" == teclado.nextstring()  || "S" == teclado.nextstring()  ){
        
            
        // }
      

        
    }
    /**
     *  Pide al usuario un valor de altura, 
     *  valida que sea correcto (un valor entre 1 y 10)
     *  y muestra la figura en pantalla
     */

    private void dibujarFiguras()
    {

    }

}
