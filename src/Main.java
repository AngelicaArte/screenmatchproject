public class Main {
    public static void main(String[] args) {
        // Crear un objeto Pelicula
        Pelicula miPelicula = new Pelicula();
        //Crear Variable
        double media = 0;

        // Llenar sus atributos
        miPelicula.nombre = "Amelie Poulaine";
        miPelicula.director = "Jean Pierre Jeaunet";
        miPelicula.fechaDeLanzamiento = 2002;
        miPelicula.duracionEnMinutos = 120;

        miPelicula.incluidoEnElPLan = true;

        // Llamar a sus métodos
        miPelicula.MuestraFichaTecnica();

        miPelicula.evalua(10);
        miPelicula.evalua(6.0);

        media = miPelicula.calculaMedia();
        System.out.println("Su calificación en promedio es: " + media);

    }
}
