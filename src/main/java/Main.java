import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        String[][] vinilos = new String[100][3];

        agregarVinilo(vinilos, "Iron Maiden", "Iron Maiden", "1980");
        agregarVinilo(vinilos, "Iron Maiden", "Killers", "1981");
        agregarVinilo(vinilos, "Iron Maiden", "The number of the beast", "1982");
        agregarVinilo(vinilos, "AC-DC", "Back in black", "1980");
        agregarVinilo(vinilos, "AC-DC", "Highway to Hell", "1979");
        agregarVinilo(vinilos, "AC-DC", "Who made who", "1986");
        agregarVinilo(vinilos, "Judas Priest", "British steel", "1980");
        agregarVinilo(vinilos, "Judas Priest", "Painkiller", "1990");
        agregarVinilo(vinilos, "Judas Priest", "Defenders of the faith", "1984");
        agregarVinilo(vinilos, "Kiss", "Destroyer", "1976");

        System.out.println("Espacio máximo colección: " + vinilos.length);

        mostrarTotal(vinilos);
        mostrarEspaciosDisponibles(vinilos);

        String artista = "AC-DC";
        System.out.println("Buscar artista " + artista);
        mostrarBusquedaArtista(vinilos, artista);

        mostrarColeccion(vinilos);
    }

    private static void mostrarColeccion(String[][] vinilos) {
        for (int i = 0; i < vinilos.length; i++) {
            if(vinilos[i][0] != null){
                System.out.println("Fila " + (i+1) + ": " + vinilos[i][0] + " - " + vinilos[i][1] + " - " + vinilos[i][2]);
            }
        }

    }

    public static void mostrarTotal(String[][] vinilos) {
        System.out.println("El total de vinilos es: " + totalVinilos(vinilos));
    }
    public static void mostrarEspaciosDisponibles(String[][] vinilos) {
        System.out.println("El total de espacios disponibles es: " + espaciosDisponibles(vinilos));
    }
    public static void mostrarBusquedaArtista(String[][] vinilos, String nombreArtista){
        if (buscarArtista(vinilos, nombreArtista) == true){
            System.out.println("El artista " + nombreArtista + " si esta en la coleccion");
        } else{
            System.out.println("El artista " + nombreArtista + " no esta en la coleccion");
        }
    }
    public static boolean buscarArtista(String[][] vinilos, String nombreArtista){

        for (int i = 0; i < vinilos.length; i++) {
            if (Objects.equals(vinilos[i][0], nombreArtista)) {
                return true;
            }
        }
        return false;
    }
    public static int espaciosDisponibles(String[][] vinilos){
        int contador = 0;
        for (int i = 0; i < vinilos.length; i++) {
            if(vinilos[i][0] == null){
                contador++;
            }
        } return contador;
    }
    public static int totalVinilos(String[][] vinilos){
        int contador = 0;
        for (int i = 0; i < vinilos.length; i++) {
            if(vinilos[i][0] != null){
                contador++;
            }

        } return contador;
    }

    public static void agregarVinilo(String[][] vinilos, String artista, String album, String lanzamiento){

        for (int i = 0; i < vinilos.length; i++) {

            if(vinilos[i][0] == null) {

                vinilos[i][0] = artista;
                vinilos[i][1] = album;
                vinilos[i][2] = lanzamiento;
                break;
            }
        }
    }


}

