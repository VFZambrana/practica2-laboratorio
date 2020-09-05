public class Norma {
    private int idNorma;
    private String nombre;
    private String condicion;
    private double valor;
    private Tipo tipo;

    public Norma(int idNorma, String nombre, String condicion, double valor, Tipo tipo) {
        this.idNorma = idNorma;
        this.nombre = nombre;
        this.condicion = condicion;
        this.valor = valor;
        this.tipo = tipo;
    }

    public int getIdNorma() {
        return idNorma;
    }

    public void setIdNorma(int idNorma) {
        this.idNorma = idNorma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
