public class Tipo {
    int idTipo;
    private String nombre;
    private String condicion;

    public Tipo(int idTipo, String nombre, String condicion) {
        this.idTipo = idTipo;
        this.nombre = nombre;
        this.condicion = condicion;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
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
}
