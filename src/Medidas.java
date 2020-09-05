public class Medidas {
    private int idMedida;
    private String nombre;
    private double valor;

    public Medidas(int idMedida, String nombre, double valor) {
        this.idMedida = idMedida;
        this.nombre = nombre;
        this.valor = valor;
    }

    public int getIdMedida() {
        return idMedida;
    }

    public void setIdMedida(int idMedida) {
        this.idMedida = idMedida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
