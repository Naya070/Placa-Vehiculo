/**
 * Abstract class Procedimiento - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
import javax.swing.JOptionPane;

public abstract class Procedimiento
{
    // instance variables - replace the example below with your own
    protected String cod;

    /**
     * Constructor heredable de Superclase Procedimiento
     */
    public Procedimiento(String Código)
    {
        // initialise instance variables
       cod = Código;
        
    }
    
    /**
     * Método heredable para pedir o modificar el código de placa.
     */
    public void PedirCod()
    {
        // initialise instance variables
        String cod = JOptionPane.showInputDialog("Escribe el código");
        String Fantasma= "null";
        Herramienta.validar(cod, Fantasma);
        Herramienta.validar(cod);
        
    }

    /**
     * Método heredable para sobreescribir posteriormente.
     */
    public abstract void Confirmar(String cod, int Fantasma);
    
    /**
     * Método heredable para sobreescribir posteriormente.
     */
    public abstract void validar(String cod, int Fantasma);
    
    
      
}
