public class Certificado {
    private int idCertificado;
    private String hash;
    private Lote lote;
    private Producto producto;
    private Muestra muestra;
    private JefeLaboratorio jefeLaboratorio;
    private Ensayo ensayo;
    private Tipo tipo;
    private Norma norma;
    private Medidas medidas;

    public Certificado(int idCertificado, String hash, Lote lote, Producto producto, Muestra muestra, JefeLaboratorio jefeLaboratorio, Ensayo ensayo, Tipo tipo, Norma norma, Medidas medidas) {
        this.idCertificado = idCertificado;
        this.hash = hash;
        this.lote = lote;
        this.producto = producto;
        this.muestra = muestra;
        this.jefeLaboratorio = jefeLaboratorio;
        this.ensayo = ensayo;
        this.tipo = tipo;
        this.norma = norma;
        this.medidas = medidas;
    }

    public int getIdCertificado() {
        return idCertificado;
    }

    public void setIdCertificado(int idCertificado) {
        this.idCertificado = idCertificado;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Muestra getMuestra() {
        return muestra;
    }

    public void setMuestra(Muestra muestra) {
        this.muestra = muestra;
    }

    public JefeLaboratorio getJefeLaboratorio() {
        return jefeLaboratorio;
    }

    public void setJefeLaboratorio(JefeLaboratorio jefeLaboratorio) {
        this.jefeLaboratorio = jefeLaboratorio;
    }

    public Ensayo getEnsayo() {
        return ensayo;
    }

    public void setEnsayo(Ensayo ensayo) {
        this.ensayo = ensayo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Norma getNorma() {
        return norma;
    }

    public void setNorma(Norma norma) {
        this.norma = norma;
    }

    public Medidas getMedidas() {
        return medidas;
    }

    public void setMedidas(Medidas medidas) {
        this.medidas = medidas;
    }
}
