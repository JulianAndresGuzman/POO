
/**
 *
 * @author JulianAndresGuzmanCuellar
 */

package sieteb15;
public class GrupoPersonas {
     private Persona[] personas;
    private int cantidadPersonas;

    public GrupoPersonas() {
        this.personas = new Persona[100];
        this.cantidadPersonas = 0;
    }

    public void agregarPersona(Persona persona) {
        if (cantidadPersonas < 100) {
            personas[cantidadPersonas] = persona;
            cantidadPersonas++;
        } else {
            System.out.println("El grupo ya está completo");
        }
    }

    public int numeroMujeres() {
        int count = 0;
        for (int i = 0; i < cantidadPersonas; i++) {
            if (personas[i].isMujer()) {
                count++;
            }
        }
        return count;
    }

    public int numeroHombresCasados() {
        int count = 0;
        for (int i = 0; i < cantidadPersonas; i++) {
            if (!personas[i].isMujer() && personas[i].getEstadoCivil() == 'c') {
                count++;
            }
        }
        return count;
    }

    public boolean sueldoMedioHombresSolterosMayor() {
        int sumaSueldosSolteros = 0;
        int cantidadSolteros = 0;
        int sumaSueldosCasados = 0;
        int cantidadCasados = 0;

        for (int i = 0; i < cantidadPersonas; i++) {
            if (!personas[i].isMujer()) {
                if (personas[i].getEstadoCivil() == 's') {
                    sumaSueldosSolteros += personas[i].getSueldo();
                    cantidadSolteros++;
                } else if (personas[i].getEstadoCivil() == 'c') {
                    sumaSueldosCasados += personas[i].getSueldo();
                    cantidadCasados++;
                }
            }
        }

        double sueldoMedioSolteros = cantidadSolteros > 0 ? (double) sumaSueldosSolteros / cantidadSolteros : 0;
        double sueldoMedioCasados = cantidadCasados > 0 ? (double) sumaSueldosCasados / cantidadCasados : 0;

        return sueldoMedioSolteros > sueldoMedioCasados;
    }

   
}

class Persona {
    private char estadoCivil;
    private int sueldo;
    private boolean mujer;

    public Persona(char estadoCivil, int sueldo, boolean mujer) {
        this.estadoCivil = estadoCivil;
        this.sueldo = sueldo;
        this.mujer = mujer;
    }

    public char getEstadoCivil() {
        return estadoCivil;
    }

    public int getSueldo() {
        return sueldo;
    }

    public boolean isMujer() {
        return mujer;
    }
     public static void main(String[] args) {
        GrupoPersonas grupo = new GrupoPersonas();

        // Ejemplo de uso
        grupo.agregarPersona(new Persona('c', 50000, true)); // Casada, 50000, mujer
        grupo.agregarPersona(new Persona('s', 60000, false)); // Soltera, 60000, hombre
        grupo.agregarPersona(new Persona('c', 70000, false)); // Casado, 70000, hombre
        grupo.agregarPersona(new Persona('v', 40000, true)); // Viuda, 40000, mujer

        System.out.println("Número de mujeres: " + grupo.numeroMujeres());
        System.out.println("Número de hombres casados: " + grupo.numeroHombresCasados());
        System.out.println("¿El sueldo medio de los hombres solteros es mayor que el de los hombres casados?: " + grupo.sueldoMedioHombresSolterosMayor());
    }
}
