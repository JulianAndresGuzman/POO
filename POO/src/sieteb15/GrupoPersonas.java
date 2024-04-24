
package sieteb15;

/**
 *
 * @author Usuario
 */
public class GrupoPersonas {
    private Persona[] personas; // Arreglo para almacenar las personas
    private int cantidadPersonas; // Contador para llevar la cantidad de personas en el grupo
    
    public GrupoPersonas() {
        this.personas = new Persona[100];
        this.cantidadPersonas = 0;
        
    }
    public void agregarPersona(Persona persona) {
        
        // Para Verificar si el grupo no está lleno
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


}
