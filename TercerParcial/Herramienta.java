
/**
 * Write a description of class Herramienta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
     import javax.swing.JOptionPane;
public class Herramienta
{
      
    public static boolean validar(String cod, String Fantasma){
                
        
        try{ 
            
            int cantidad= cod.length();
            if (cantidad<7){ return true; }
            
        }
        
        catch (IndexOutOfBoundsException e) {
           int cantidad = cod.length();
            if(cantidad != 7){
            JOptionPane.showMessageDialog(null, "El código debe tener 7 caracteres");
           } return false;
        }
         return false;           
        }
    
    
    public static boolean validar(String cod){
    int a= 0;
        for (int x = 0; x < cod.length(); x++) {
        char c = cod.charAt(x);
        int ascii = (int) c;
        // Si está entre a y z, o entre A y Z, o  son números
        if (((c >= 97 && c <= 122) || (c >= 65 && c <= 90) || (c >=48 && c <= 57))) {
            a=1;
            return true;
        } 
        if (a==0){}
    else {JOptionPane.showMessageDialog(null, "Los caracteres deben ser letras o números");}
    }
          
    return false;
}      
         
     
    }
    

