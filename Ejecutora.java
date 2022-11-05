import java.util.Calendar;

public class Ejecutora {
    public static void main(String[] args) {
        OIT oit = new OIT();

        Calendar fecha = Calendar.getInstance();
        fecha.set(1980,0,15);
        oit.agregarTrabajador(new Colaborador("D1",
                "N1",
                fecha,
                "P1",
                "Norte",
                1500));

        fecha.set(1990,11,25);
        oit.agregarTrabajador(new Asesor("A1",
                "AN1",
                fecha,
                "AP1",
                "Norte",
                48,
                60));

        fecha.set(1985,1,13);
        oit.agregarTrabajador(new Colaborador("D2",
                "N2",
                fecha,
                "P2",
                "Central",
                1200));

        fecha.set(1995,10,30);
        oit.agregarTrabajador(new Asesor("AA2",
                "AN2",
                fecha,
                "AP2",
                "Sur",
                52,
                75));

        fecha.set(1986,5,6);
        oit.agregarTrabajador(new Colaborador("D3",
                "N3",
                fecha,
                "P3",
                "Central",
                1500));

        //oit.listarTrabajadores("colaborador");
        oit.listarTrabajadores("asesor");

        //Proyecto proyecto = new Proyecto("P2", "D2", 2005, 15000);

        //System.out.println("La suma de los sueldos de trabajadores es menor al presupuesto:");
        //System.out.println(oit.sumaSueldosMenorAPresupuesto(proyecto.getPresupuestoAsignado()));
    }
}
