import java.util.Calendar;

public class Colaborador extends Trabajador {
    private double sueldoFijo;

    public Colaborador(String dni, String nombresApellidos, Calendar fechaNacimiento,
                       String profesion, String zona, double sueldoFijo) {
        super(dni, nombresApellidos, fechaNacimiento, profesion, zona);
        this.sueldoFijo = sueldoFijo;
    }

    @Override
    double sueldoBruto() {
        //* Retorna el mismo sueldo fijo ya que no hay ningun calculo sobre él.
        return sueldoFijo;
    }

    @Override
    public String toString() {
        return "Colaborador{"+ super.toString()+ "}";
    }
}
