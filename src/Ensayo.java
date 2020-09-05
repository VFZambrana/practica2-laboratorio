public class Ensayo {
    private int idEnsayo;
    private String codigo;
    private int resultado;

    public Ensayo(int idEnsayo, String codigo, int resultado) {
        this.idEnsayo = idEnsayo;
        this.codigo = codigo;
        this.resultado = resultado;
    }

    public int getIdEnsayo() {
        return idEnsayo;
    }

    public void setIdEnsayo(int idEnsayo) {
        this.idEnsayo = idEnsayo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
}
