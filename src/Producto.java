public class Producto {
     private int idProfucto;
    private String nombre;

    public Producto(int idProfucto, String nombre) {
        this.idProfucto = idProfucto;
        this.nombre = nombre;
    }

    public int getIdProfucto() {
        return idProfucto;
    }

    public void setIdProfucto(int idProfucto) {
        this.idProfucto = idProfucto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
