package SieteProductoIva;
import javax.swing.JOptionPane;
/**
 *
 * @author Julian Andres Guzman Cuellar
 */
public class EjecutorCodigo {
    
    public static void main(String[] args) {
        
        String nombre = JOptionPane.showInputDialog(null, "Por favor, introduce tu nombre:");
        JOptionPane.showMessageDialog(null, "Hola " + nombre + " bienvenid@ a mi asombroso programa");
        Producto prd = new Producto();
        prd.pedirPrecio();
        prd.definirResultado();
        prd.darResultado();
        
        

        

    }
    
}
