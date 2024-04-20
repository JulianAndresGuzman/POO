package SieteProductoIva;
import javax.swing.JOptionPane;
/**
 *
 * @author Julian Andres Guzman Cuellar
 */
public class Producto {

    int producto;
    public static final double iva = 0.21;
    double resultadoFinal;

    public void pedirPrecio() {
        producto = Integer.parseInt(JOptionPane.showInputDialog("inserte un precio"));
    }

    public void definirResultado() {
        resultadoFinal = producto + (producto * iva);
    }

    public void darResultado() {
        JOptionPane.showMessageDialog(null, "El precio final es: " + resultadoFinal + "$");
    }
}
