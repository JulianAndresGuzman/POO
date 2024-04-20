package SieteProductoIva;
import javax.swing.JOptionPane;
/**
 *
 * @author Julian Andres Guzman Cuellar
 */
public class Producto {

    //Introducimos las variables
    int producto;
    public static final double iva = 0.21;
    double resultadoFinal;

    //Pedimos el precio con interfaz
    public void pedirPrecio() {
        producto = Integer.parseInt(JOptionPane.showInputDialog("inserte un precio"));
    }
    
    //Calculamos el resultado
    public void definirResultado() {
        resultadoFinal = producto + (producto * iva);
    }

    //Damos el resultado
    public void darResultado() {
        JOptionPane.showMessageDialog(null, "El precio final es: " + resultadoFinal + "$");
    }
}
