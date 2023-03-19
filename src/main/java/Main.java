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

