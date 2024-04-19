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
        //Uso una interfaz gráfica para pedir el número 1 con el cual se hallará el radio (Quiero aprender a usar eso)
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("inserte un número"));
    }

    public void calcularRadio(int radio) {
        
        //Usando la formula para hallar el radio, hallamos el radio
        double area = 2 * PI * radio * radio;
        //Mostramos el resultado
        JOptionPane.showMessageDialog(null, "El área del círculo es: " + area);

    }

}
