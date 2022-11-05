import java.util.ArrayList;
import java.util.List;

public class OIT {
    private List<Trabajador> listaTrabajadores;

    public OIT() {
        listaTrabajadores =  new ArrayList<>();
    }

    public void agregarTrabajador(Trabajador t) {
        listaTrabajadores.add(t);
    }

    public void listarTrabajadores(String tipoTrabajador) {
        for (Trabajador t : listaTrabajadores) {
            if (tipoTrabajador.equals("colaborador") && t instanceof  Colaborador) {
                System.out.println(t);
            } else if (tipoTrabajador.equals("asesor") && t instanceof Asesor) {
                System.out.println(t);
            }
        }
    }

    public boolean sumaSueldosMenorAPresupuesto(double presupuestoProyecto ){
        //* Indica sueldo, por ello invoco al sueldo neto y no al bruto.
        double sumaSueldos=0;
        for (Trabajador t : listaTrabajadores) {
            //* Sumo todos los sueldos independiente del tipo de trabajador que sea.
            sumaSueldos+=t.sueldoNeto();
        }
        //System.out.println("Suma de sueldos: " + sumaSueldos);
        return (sumaSueldos < presupuestoProyecto);
    }
}
