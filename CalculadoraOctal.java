
/**
 *  Representa a una calcualdora que hace sumas octales
 * 
 * @author - 
 * 
 */
public class CalculadoraOctal
{

    /**
     * sumar dos nºs supuestos en base 8 y con el mismo
     * nº de cifras
     * Asumimos positivos
     */
    public int sumarEnOctal(int n1, int n2) {
        
            
        
        int octal1 = 0;
        int octal2 = 0;
        int p = 0;

        while(n1 != 0){
            int resto =  n1 % 8;
            octal1 += (int) Math.pow(10,p) * resto;
            n1 /= 8;
            p++;

        }
        
        p = 0;
         while(n2 != 0){
            
             int resto =  n2 % 8;
            octal2 += (int) Math.pow(10,p) * resto;
            n2 /= 8;
            p++;

        }
        int aux = octal1 + octal2;
        return aux;
        
        
      
        
       

    }
    
    
}
