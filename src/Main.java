import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        //Producto
        Producto gelOs = new Producto(148,"gel-Antibacterial (GELOS)");
        //Muestra
        Muestra gelMuestra = new Muestra(25,"cb-11");
        //Jefe de laboratorio
        JefeLaboratorio Ariel = new JefeLaboratorio(1357789,"Ariel","Pérez","Cruz");
        //Ensayo
        Ensayo gelEnsayo = new Ensayo(774,"ba-884",82);
        //Tipo
        Tipo tipoGel =new Tipo(889,"Antibacterial","Regular");
        //Medidas;
        Medidas medgel = new Medidas(663,"Precaucion:Inflamable",12.8);
        //Lote
        Lote gelLote = new Lote(100,"bc-123", Calendar.getInstance().getTime(), gelOs);
        //Norma
        Norma normativa = new Norma(9987,"SSS-71","regular",50.0,tipoGel);
        //Certificado
        Certificado recibo = new Certificado(559,"061cdb58f3b85da84e65ba71fe1cfe32",gelLote,gelOs,gelMuestra,Ariel,gelEnsayo,tipoGel,normativa,medgel);

        System.out.println("certficado: "+ recibo.getIdCertificado());
        System.out.println("fecha de vencimiento: "+recibo.getLote().getFechaVencimiento());
        System.out.println("medidas: "+recibo.getMedidas().getNombre());
        System.out.println("tipo: "+recibo.getTipo().getCondicion());
        System.out.println("norma: "+recibo.getNorma().getIdNorma());
        if (recibo.getEnsayo().getResultado()>50) {
            System.out.println(" cumple con las exigencias de calidadestablecidas");
            System.out.println("Resultado del ensayo /100: "+recibo.getEnsayo().getResultado());
        }
        System.out.println("Firma Jefe de Laboratorio:"+recibo.getJefeLaboratorio().getNombre());
        System.out.println("Muestra: "+recibo.getMuestra().getIdMuestra());
        System.out.println("Producto: "+recibo.getProducto().getNombre());
    }
}
