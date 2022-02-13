
/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;
public class Principal
{
   public static void main(String[] ar) {
        
       String entradaUsuario = JOptionPane.showInputDialog ( "Introduzca código" );
        String cod = entradaUsuario;
        String Fantasma= "null";
        int x =1;
        
        if (Herramienta.validar(cod, Fantasma)){x=1;}
        else x=0;
        
        if(Herramienta.validar(cod)){x=1;}
        else x=0;
        
        if(x==1){
        PlacaDeVehículos.Confirmar(cod);
        PlacaDeVehículos.Confirmar(cod, Fantasma);}
        
        else {}
        
        
       
        
    }
}
