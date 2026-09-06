public class Main {
    public static void main(String [] args) {
        TomoManga tomo = new TomoManga("One Piece", 3, 5200);

        System.out.println("Manga : One Piece");
        System.out.println("Volumen: 3");

        tomo.estadoLectura();

        tomo.marcarComoLeido();

        tomo.estadoLectura();
    }
}