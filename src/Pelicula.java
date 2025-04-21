public class Pelicula {
    //Sección Atributos
    String nombre;

    String director;

    int fechaDeLanzamiento;

    int duracionEnMinutos;

    boolean incluidoEnElPLan;

    double sumaDeLasEvaluaciones;

    int totalDeLasEvaluaciones;

    // Sección Metodos
    void MuestraFichaTecnica() {
        System.out.println("Me encanta esta película: " + nombre);
        System.out.println("Director de esta maravillosa película es: " + director);
        System.out.println("Su lanzamiento fue en el año: " + fechaDeLanzamiento);
        System.out.println("Tiene una duración de: " + duracionEnMinutos + " minutos");
        if (incluidoEnElPLan == true) {
            System.out.println("Película incluida en el plan.");
        } else {
            System.out.println("Película no incluida en el plan.");
        }
    }

    void evalua(double calificacion) {
        sumaDeLasEvaluaciones += calificacion;
        totalDeLasEvaluaciones++;
    }

    double calculaMedia() {
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;

    }

}
