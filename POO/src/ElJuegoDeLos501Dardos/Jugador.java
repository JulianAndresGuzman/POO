/**
 *
 * @author JulianAndresGuzmanCuellar
 */
package ElJuegoDeLos501Dardos;

import java.util.Random;
import java.util.Scanner;


public class Jugador {
   private String nombre;
    private int puntuacion;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntuacion = 501;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void lanzar() {
        Random rnd = new Random();
        int totalTirada = 0;

        for (int i = 0; i < 3; i++) {
            int num = rnd.nextInt(21);  // Número entre 0 y 20
            int tipo = rnd.nextInt(3) + 1;  // Tipo de zona (1: simple, 2: doble, 3: triple)

            int puntos = 0;
            if (num == 0) {
                puntos = 50;
            } else {
                switch (tipo) {
                    case 1:
                        puntos = num;
                        break;
                    case 2:
                        puntos = num * 2;
                        break;
                    case 3:
                        puntos = num * 3;
                        break;
                }
            }

            System.out.println("Dardo " + (i + 1) + ": num " + num + " tipo: " + tipo + " (" + (puntos == 50 ? "diana" : puntos) + " puntos)");
            totalTirada += puntos;
        }

        if (puntuacion - totalTirada >= 0) {
            puntuacion -= totalTirada;
        }

        System.out.println("Total de la tirada: " + totalTirada);
        System.out.println(nombre + " tiene " + puntuacion + " puntos restantes.");
    }

    public boolean haGanado() {
        return puntuacion == 0;
    }
}
