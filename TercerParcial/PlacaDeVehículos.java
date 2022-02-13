
/**
 * Write a description of class PlacaDeVehículos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;
public abstract class PlacaDeVehículos extends Procedimiento
{
    // instance variables - replace the example below with your own
    public String Código, cod;
    

    /**
     * Constructor for objects of class PlacaDeVehículos
     */
    public PlacaDeVehículos(String cod)
    {
        // initialise instance variables
        super(cod);
    }

    /**
     * Confirma que los dos primeros y dos últimos símbolos son letras.  
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */ 
      
     
    public static void Confirmar(String cod, String Fantasma)
    {
        // put your code here
        
        String Principio = cod.substring(0,2);
        String Final = cod.substring(5);
        
        String Extremos = Principio + Final;
        int z =0;
        for (int x = 0; x < Extremos.length(); x++) {
        char c = Extremos.charAt(x);
        // Si está entre a y z o entre A y Z
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            ++z;
        } } 
          if (z >= 1){JOptionPane.showMessageDialog(null, "Los dos primeros y dos últimos símbolos  son letras.");
            }
        else JOptionPane.showMessageDialog(null, "Los dos primeros y dos últimos símbolos NO son letras.");
     
      
    
     
    }
    
    /**
     * Confirma que los símbolos del tercero al quinto son letras.  
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */ 
     
    public static void Confirmar(String cod)
    {
        // put your code here
        
        String Medios = cod.substring(2,5);
        int s=0;
        for (int i = 0; i < Medios.length(); i++) {
            if (!Character.isDigit(Medios.charAt(i))) {
                 ++s;
                
            }
        }  
        if(s>=1){JOptionPane.showMessageDialog(null,"Los símbolos del tercero al quinto NO son números." );}
        
          else{JOptionPane.showMessageDialog(null,"Los símbolos del tercero al quinto son números." );}
    }
}
