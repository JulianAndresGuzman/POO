package POONivelInicial;

import javax.swing.JOptionPane;

/**
 *
 * @author JulianAndresGuzmanCuellar
 */
public class Prueba {

    public static void main(String[] args) {
        int cantidadTriangulos;
        cantidadTriangulos = Integer.parseInt(JOptionPane.showInputDialog("inserte la cantidad de triangulos"));
        Triangulo[] triangulos = new Triangulo[cantidadTriangulos];

        for (int i = 0; i < cantidadTriangulos; i++) {
            int base = Integer.parseInt(JOptionPane.showInputDialog("inserte la base del triángulo " + (i + 1)));
            int altura = Integer.parseInt(JOptionPane.showInputDialog("inserte la altura del triángulo " + (i + 1)));
            triangulos[i] = new Triangulo(base, altura);
            triangulos[i].calcularArea();
            
            JOptionPane.showMessageDialog(null, "El área del triángulo " + (i + 1) + " es: " + triangulos[i].getArea());
        }
    }
}