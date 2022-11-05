public class Proyecto {
    private String codigo;
    private String descripcion;
    private int ano;
    private double presupuestoAsignado;

    public Proyecto(String codigo, String descripcion, int ano, double presupuestoAsignado) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.ano = ano;
        this.presupuestoAsignado = presupuestoAsignado;
    }


    public double getPresupuestoAsignado() {
        return presupuestoAsignado;
    }
}
