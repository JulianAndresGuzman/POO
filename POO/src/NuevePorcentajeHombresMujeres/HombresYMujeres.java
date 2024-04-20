/**
 *
 * @author Julian Andres Guzman Cuellar
 */
package NuevePorcentajeHombresMujeres;
import javax.swing.JOptionPane;
public class HombresYMujeres {
    int hombres, mujeres, totalPersonas;
    double porcentajeHombres, porcentajeMujeres;
 
    public void pedirDatos(){
        hombres = Integer.parseInt(JOptionPane.showInputDialog("inserte cuantos hombres hay"));
        mujeres = Integer.parseInt(JOptionPane.showInputDialog("inserte cuantas mujeres hay"));
    }
    
    public void analizarDatos(){
        totalPersonas = hombres + mujeres;
        porcentajeHombres = (hombres * 100)/ totalPersonas;
        porcentajeMujeres = (mujeres * 100)/ totalPersonas;
    }
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null, "Porcentaje de hombres:" + porcentajeHombres + "%");
        JOptionPane.showMessageDialog(null, "Porcentaje de Mujeres:" + porcentajeMujeres + "%");
    }
    public static void main(String[] args) {
        HombresYMujeres porcent = new HombresYMujeres();
        porcent.pedirDatos();
        porcent.analizarDatos();
        porcent.mostrarDatos();
        
    }
}
