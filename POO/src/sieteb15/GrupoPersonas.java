package sieteb15;

/**
 *
 * @author JulianAndresGuzmanCuellar
 */
public class GrupoPersonas {

    private Persona[] personas; // Arreglo para almacenar las personas
    private int cantidadPersonas; // Contador para llevar la cantidad de personas en el grupo

    /**
     * Constructor de la clase. Inicializa el arreglo de personas y el contador en cero.
     */
    public GrupoPersonas() {
        this.personas = new Persona[100];
        this.cantidadPersonas = 0;
    }

    /**
     * Método para agregar una persona al grupo.
     *
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
     *
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
     *
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
     *
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

        // Calcula el sueldo medio de hombres solteros y casados
        double sueldoMedioSolteros = cantidadSolteros > 0 ? (double) sumaSueldosSolteros / cantidadSolteros : 0;
        double sueldoMedioCasados = cantidadCasados > 0 ? (double) sumaSueldosCasados / cantidadCasados : 0;

        // Compara los sueldos medios
        return sueldoMedioSolteros > sueldoMedioCasados;
    }

    //metodo principal para "correr" el programa
    public static void main(String[] args) {
        GrupoPersonas grupo = new GrupoPersonas();

        // Ejemplo de uso: se agregan algunas personas al grupo
        grupo.agregarPersona(new Persona('c', 50000, true)); // Casada, 50000, mujer
        grupo.agregarPersona(new Persona('s', 60000, false)); // Soltera, 60000, hombre
        grupo.agregarPersona(new Persona('c', 70000, false)); // Casado, 70000, hombre
        grupo.agregarPersona(new Persona('v', 40000, true)); // Viuda, 40000, mujer

        // Se imprimen los resultados de los cálculos
        System.out.println("Número de mujeres: " + grupo.numeroMujeres());
        System.out.println("Número de hombres casados: " + grupo.numeroHombresCasados());
        System.out.println("¿El sueldo medio de los hombres solteros es mayor que el de los hombres casados?: " + grupo.sueldoMedioHombresSolterosMayor());
    }

    /**
     * Clase que representa a una persona.
     */
    static class Persona {

        private char estadoCivil; // Estado civil: c=casada, s=soltera, v=viuda
        private int sueldo; // Sueldo de la persona
        private boolean mujer; // Indica si la persona es mujer o no

        public Persona(char estadoCivil, int sueldo, boolean mujer) {
            this.estadoCivil = estadoCivil;
            this.sueldo = sueldo;
            this.mujer = mujer;
        }

        /**
         * Método getter para obtener el estado civil de la persona.
         *
         * @return Estado civil.
         */
        public char getEstadoCivil() {
            return estadoCivil;
        }

        /*
         * Método getter para obtener el sueldo de la 
         */
        public int getSueldo() {
            return sueldo;
        }

        /**
         * Método getter para determinar si la persona es mujer. Devuelve verdadero si es verdad, y falso si no es cierto, obviamente jaja.
         */
        public boolean isMujer() {
            return mujer;
        }
    }
}
