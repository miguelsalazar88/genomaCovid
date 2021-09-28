package modelo;

public class Combinacion {
    private String combinacion;
    private int veces=0;

    public Combinacion(String combinacion)
    {
        this.combinacion= combinacion;
        this.veces++;
    }

    public String getCombinacion() {
        return combinacion;
    }

    public void setCombinacion(String combinacion) {
        this.combinacion = combinacion;
    }

    public int getVeces() {
        return veces;
    }

    public void setVeces(int veces) {
        this.veces = veces;
    }

    @Override
    public String toString() {
        return "Combinacion{" +
                "combinacion='" + combinacion + '\'' +
                ", veces=" + veces +
                '}';
    }
}
