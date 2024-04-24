package sieteb15;

/**
 *
 * @author Usuario
 */
public class GrupoPersonas {

    private Persona[] personas; // Arreglo para almacenar las personas
    private int cantidadPersonas; // Contador para llevar la cantidad de personas en el grupo

    /**
     * Constructor de la clase.
     * Inicializa el arreglo de personas y el contador en cero.
     */
    public GrupoPersonas() {
        this.personas = new Persona[100];
        this.cantidadPersonas = 0;
    }

    /**
     * Método para agregar una persona al grupo.
     * @param persona Persona a agregar.
     */
    public void agregarPersona(Persona persona) {
        // Para Verificar si el grupo no está lleno
        if (cantidadPersonas < 100) {
            personas[cantidadPersonas] = persona;
            cantidadPersonas++;
        } else {
            System.out.println("El grupo ya está completo");
        }
    }

    /**
     * Método para calcular el número de mujeres en el grupo.
     * @return Número de mujeres.
     */
    public int numeroMujeres() {
        int count = 0;
        for (int i = 0; i < cantidadPersonas; i++) {
            if (personas[i].isMujer()) {
                count++;
            }
        }
        return count;
    }

    /**
     * Método para calcular el número de hombres casados en el grupo.
     * @return Número de hombres casados.
     */
    public int numeroHombresCasados() {
        int count = 0;
        for (int i = 0; i < cantidadPersonas; i++) {
            if (!personas[i].isMujer() && personas[i].getEstadoCivil() == 'c') {
                count++;
            }
        }
        return count;
    }

    /**
     * Método para determinar si el sueldo medio de los hombres solteros es mayor que el de los casados.
     * @return Verdadero si el sueldo medio de los solteros es mayor, falso en caso contrario.
     */
    public boolean sueldoMedioHombresSolterosMayor() {
        int sumaSueldosSolteros = 0;
        int cantidadSolteros = 0;
        int sumaSueldosCasados = 0;
        int cantidadCasados = 0;

        // Recorre todas las personas para calcular las sumas de sueldos y las cantidades de hombres solteros y casados
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

    
