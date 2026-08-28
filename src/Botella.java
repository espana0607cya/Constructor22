public class Botella {
    private String marca;
    private String Tipo;
    private int CantidadDeBotellas;
    private double precio;

    public Botella(String marca, String Tipo) {
        this.marca = marca;
        this.Tipo = Tipo;
        this.CantidadDeBotellas = 2;
        this.precio = 180.000;
    }
    public Botella(String marca, String Tipo, int CantidadDeBotellas) {
        this.marca = marca;
        this.Tipo = Tipo;
        this.CantidadDeBotellas = 1;
        this.precio = 405.000;
    }
    public Botella(String marca, String Tipo, int CantidadDeBotellas, double precio) {
        this.marca = marca;
        this.Tipo = Tipo;
        this.CantidadDeBotellas = CantidadDeBotellas;
        this.precio = precio;
    }
}
