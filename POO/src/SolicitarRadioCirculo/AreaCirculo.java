/**
 *
 * @author JulianAndresGuzmanCuellar 20232215518
 */
package SolicitarRadioCirculo;
import javax.swing.JOptionPane;

public class AreaCirculo {
    private static final double PI = 3.14159265359;

    public void pedirNumero() {
        String entrada = JOptionPane.showInputDialog(null, "Introduce el radio del círculo:");
    }
    int numero1 = Integer.parseInt(entrada);
    
    public void calcularRadio(){
        double area = 2 * PI * numero1 * numero1;
    
    }
    
}
