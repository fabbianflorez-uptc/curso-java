public class Main {

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Fabian", "Ingenieria de Sistemas");
        estudiante.mostrarDatos();
    }
}

class Estudiante {
    String nombre;
    String programa;

    public Estudiante(String nombre, String programa) {
        this.nombre = nombre;
        this.programa = programa;
    }

    public void mostrarDatos() {
        System.out.println(nombre + " estudia " + programa);
    }
}
