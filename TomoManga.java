public class TomoManga {
    private String tituloObra;
    private int numeroVolumen;
    private double precioCompra;
    private boolean leido;

    //constructor
   public TomoManga (String tituloObra, int numeroVolumen, double precioCompra) {
        this.tituloObra = tituloObra;
        this.numeroVolumen = numeroVolumen;
        this.precioCompra = precioCompra;
        this.leido = false; // Inicialmente no leído
    }

    public void marcarComoLeido() {
        this.leido = true;
    }

    public void estadoLectura() {
       if(leido) {
           System.out.println("Estado: Finalizado");
       } else {
           System.out.println("Estado: Pendiente");
       }
    }
}
