package SieteProductoIva;
import javax.swing.JOptionPane;
/**
 *
 * @author Julian Andres Guzman Cuellar
 */
public class EjecutorCodigo {
    
    public static void main(String[] args) {
        
        //Pedimos el nombre al usuario
        String nombre = JOptionPane.showInputDialog(null, "Por favor, introduce tu nombre:");
        //Le damos bienvenida al usuario
        JOptionPane.showMessageDialog(null, "Hola " + nombre + " bienvenid@ a mi asombroso programa");
        Producto prd = new Producto();
        prd.pedirPrecio();
        prd.definirResultado();
        prd.darResultado();
        
    }
    
}
