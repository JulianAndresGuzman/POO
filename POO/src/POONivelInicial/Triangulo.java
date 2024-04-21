/**
 *
 * @author Julian Andres GuzmanCuellar
 */
package POONivelInicial;

import javax.swing.JOptionPane;

public class Triangulo {

    private int base, altura, area;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void pedirDatos() {
        base = Integer.parseInt(JOptionPane.showInputDialog("inserte la base"));
        altura = Integer.parseInt(JOptionPane.showInputDialog("inserte la altura"));
    }

    public void calcularArea() {
        area = base * altura;

    }

    public int getArea() {
        return area;
    }
}
