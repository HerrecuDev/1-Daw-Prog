import javax.lang.model.util.ElementScanner14;

//Calcular Mediante IF/Else 
//Decir el numero es casi 0 cuando esta entre el 1 y -1, y no es 0.

public class EjercicioclaseIF {
    public static void main(String[] args) {
        
        float numero = 0.34f;
        
        if (numero != 0 && numero >-1 && numero < 1)
        {
            System.out.println(numero + " SI ES CASI 0");
            
        }
        else {
            System.out.println(numero + " NO ES CASI 0");
        }
        
    }
    
}
