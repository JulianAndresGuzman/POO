
package CarpetaParaPracticar;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class CalculadoraMain {
     
     
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("inserte tu nombre porfavor");
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("hola "+nombre+" Inserte un número"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Inserte otro número"));
        
        Calculadora calcula = new Calculadora();
        int suma = calcula.sumar(num1, num2);
        int resta = calcula.restar(num1, num2);
        int multiplicacion = calcula.multiplicar(num1, num2);
        int division = calcula.dividir(num1, num2);
        
        calcula.mostrarResultados(suma, resta, multiplicacion, division);
        
    }
}
