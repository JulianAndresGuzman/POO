
package CarpetaParaPracticar;
import javax.swing.JOptionPane;
public class Calculadora {
    
    public int sumar(int numero1, int numero2){
        int suma = numero1 + numero2;
        return suma;
    }
    public int restar(int numero1, int numero2){
        int resta = numero1 - numero2;
        return resta;
    }
    public int multiplicar(int numero1, int numero2){
        int multiplicacion = numero1 * numero2;
        return multiplicacion;
    }
    public int dividir(int numero1, int numero2){
        if (numero2 != 0) {
           int division = numero1 / numero2;
        return division;
        } else {
            JOptionPane.showMessageDialog(null, "No se puede dividir por cero", "ERROR", JOptionPane.INFORMATION_MESSAGE);
            return 0;
    }
        
        
    }
    public void mostrarResultados(int suma, int resta, int multiplicacion, int division){
        
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("La suma es: " + suma + "\n");
        mensaje.append("La resta es: " + resta + "\n");
        mensaje.append("La multiplicación es: " + multiplicacion+ "\n");
        mensaje.append("La división es: " + division+ "\n");
        
        JOptionPane.showMessageDialog(null, mensaje.toString() , "Resultados de la calculadora ", JOptionPane.INFORMATION_MESSAGE );
        
    }
}
