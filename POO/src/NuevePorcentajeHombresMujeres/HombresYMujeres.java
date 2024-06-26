/**
 *
 * @author Julian Andres Guzman Cuellar
 */
package NuevePorcentajeHombresMujeres;
import javax.swing.JOptionPane;
public class HombresYMujeres {
    //Importamos las variables
    int hombres, mujeres, totalPersonas;
    double porcentajeHombres, porcentajeMujeres;
 
    //Pedimos los datos de la cantidad de hombres y mujeres
    public void pedirDatos(){
        hombres = Integer.parseInt(JOptionPane.showInputDialog("inserte cuantos hombres hay"));
        mujeres = Integer.parseInt(JOptionPane.showInputDialog("inserte cuantas mujeres hay"));
    }
    
    //Formula para hallar los porcentajes
    public void analizarDatos(){
        totalPersonas = hombres + mujeres;
        porcentajeHombres = (hombres * 100)/ totalPersonas;
        porcentajeMujeres = (mujeres * 100)/ totalPersonas;
    }
    //Vamos a mostrar los datos
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null, "Porcentaje de hombres:" + porcentajeHombres + "%");
        JOptionPane.showMessageDialog(null, "Porcentaje de Mujeres:" + porcentajeMujeres + "%");
    }
    
    //Clase main, donde ejecutaremos el código
    public static void main(String[] args) {
        HombresYMujeres porcent = new HombresYMujeres();
        porcent.pedirDatos();
        porcent.analizarDatos();
        porcent.mostrarDatos();
        
    }
}
