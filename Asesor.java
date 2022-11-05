import java.util.Calendar;

public class Asesor extends Trabajador {
    private double tarifaPorHoraTrabajo;
    private int horasSemanalesTrabajo;

    public Asesor(String dni, String nombresApellidos, Calendar fechaNacimiento,
                  String profesion, String zona,
                  int horasSemanalesTrabajo, double tarifaPorHoraTrabajo) {
        super(dni, nombresApellidos, fechaNacimiento, profesion, zona);
        this.horasSemanalesTrabajo = horasSemanalesTrabajo;
        this.tarifaPorHoraTrabajo = tarifaPorHoraTrabajo;
    }

    @Override
    double sueldoBruto() {
        //* Se calcula en base a la cantidad de horas trabajadas por su tarifa por hora.
        return horasSemanalesTrabajo * tarifaPorHoraTrabajo;
    }

    @Override
    public String toString() {
        return "Asesor{"+ super.toString()+ "}";
    }
}
