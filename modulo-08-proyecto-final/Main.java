public class Main {

    public static void main(String[] args) {
        double[] notas = {4.0, 3.5, 4.2, 3.8};
        double promedio = calcularPromedio(notas);

        System.out.println("Promedio final: " + promedio);
    }

    public static double calcularPromedio(double[] notas) {
        double suma = 0;

        for (double nota : notas) {
            suma += nota;
        }

        return suma / notas.length;
    }
}
