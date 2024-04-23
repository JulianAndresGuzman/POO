/*
Autor JulianAndresGuzmanCuellar
*/
package ElJuegoDeLos501Dardos;
import java.util.Scanner;
public class jugadorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el nombre del jugador 1:");
        String nombreJugador1 = scanner.nextLine();

        System.out.println("Introduce el nombre del jugador 2:");
        String nombreJugador2 = scanner.nextLine();

        Jugador jugador1 = new Jugador(nombreJugador1);
        Jugador jugador2 = new Jugador(nombreJugador2);

        while (true) {
            System.out.println("Turno de " + jugador1.getNombre() + ":");
            jugador1.lanzar();
            if (jugador1.haGanado()) {
                System.out.println(jugador1.getNombre() + " ha ganado!");
                break;
            }

            System.out.println("Turno de " + jugador2.getNombre() + ":");
            jugador2.lanzar();
            if (jugador2.haGanado()) {
                System.out.println(jugador2.getNombre() + " ha ganado!");
                break;
            }
        }
    }
}
