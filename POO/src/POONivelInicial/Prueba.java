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
        
        for (int i = 0; i < cantidadTriangulos; i++ ) {
            int base = Integer.parseInt(JOptionPane.showInputDialog("inserte la base del triángulo " + (i + 1)));
            triangulos[i] = new Triangulo(pedirDatos);

            
            
        }
    }
}
