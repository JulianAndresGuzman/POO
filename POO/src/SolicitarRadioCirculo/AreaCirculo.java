/**
 *
 * @author JulianAndresGuzmanCuellar 20232215518
 */
package SolicitarRadioCirculo;

import javax.swing.JOptionPane;

public class AreaCirculo {
    
    int numero1;
    double PI = 3.14159265359;

    public void pedirNumero() {
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("inserte un número"));
    }

    public void calcularRadio(int radio) {
        double area = 2 * PI * radio * radio;
        JOptionPane.showMessageDialog(null, "El área del círculo es: " + area);

    }

}
