package sieteb15;

import java.util.Random;

// Clase que representa a un grupo de personas
public class GrupoPersonas {

    private Persona[] personas; // Arreglo para almacenar las personas
    private int cantidadPersonas; // Contador para llevar la cantidad de personas en el grupo

    // Constructor de la clase
    public GrupoPersonas() {
        this.personas = new Persona[100];
        this.cantidadPersonas = 0;
    }

    // Método para agregar una persona al grupo
    public void agregarPersona(Persona persona) {
        // Para Verificar si el grupo no está lleno
        if (cantidadPersonas < 100) {
            personas[cantidadPersonas] = persona;
            cantidadPersonas++;
        } else {
            System.out.println("El grupo ya está completo");
        }
    }

    // Método para calcular el número de mujeres en el grupo
    public int numeroMujeres() {
        int count = 0;
        for (int i = 0; i < cantidadPersonas; i++) {
            if (personas[i].isMujer()) {
                count++;
            }
        }
        return count;
    }

    // Método para calcular el número de hombres casados en el grupo
    public int numeroHombresCasados() {
        int count = 0;
        for (int i = 0; i < cantidadPersonas; i++) {
            if (!personas[i].isMujer() && personas[i].getEstadoCivil() == 'c') {
                count++;
            }
        }
        return count;
    }

    // Método para determinar si el sueldo medio de los hombres solteros es mayor que el de los casados
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

    // Método principal para correr" el programa
    public static void main(String[] args) {
        GrupoPersonas grupo = new GrupoPersonas();

        // Generar datos aleatorios para rellenar a las 100 personas
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            char estadoCivil = random.nextBoolean() ? 'c' : (random.nextBoolean() ? 's' : 'v');
            int sueldo = random.nextInt(100000 - 30000) + 30000; // Sueldo entre 30,000 y 100,000
            boolean mujer = random.nextBoolean();
            grupo.agregarPersona(new Persona(estadoCivil, sueldo, mujer));
        }

        // Se imprimen los resultados de los cálculos
        System.out.println("Número de mujeres: " + grupo.numeroMujeres());
        System.out.println("Número de hombres casados: " + grupo.numeroHombresCasados());
        System.out.println("¿El sueldo medio de los hombres solteros es mayor que el de los hombres casados?: " + grupo.sueldoMedioHombresSolterosMayor());
    }

    // Clase que representa a la persona
    static class Persona {

        private char estadoCivil; // Estado civil: c=casada, s=soltera, v=viuda
        private int sueldo; // Sueldo de la persona
        private boolean mujer; // Indica si la persona es mujer o no

        // Constructor de la clase Persona
        public Persona(char estadoCivil, int sueldo, boolean mujer) {
            this.estadoCivil = estadoCivil;
            this.sueldo = sueldo;
            this.mujer = mujer;
        }

        // Método getter para el estado civil de la persona
        public char getEstadoCivil() {
            return estadoCivil;
        }

        // Método getter para el sueldo de la persona
        public int getSueldo() {
            return sueldo;
        }

        // Método getter para determinar si es mujer
        public boolean isMujer() {
            return mujer;
        }
    }
}
