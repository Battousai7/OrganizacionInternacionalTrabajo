import java.util.Calendar;

public abstract class Trabajador {
    private String dni;
    private String nombresApellidos;
    private Calendar fechaNacimiento;
    private String profesion;
    private String zona;

    public Trabajador(String dni, String nombresApellidos, Calendar fechaNacimiento,
                      String profesion, String zona) {
        this.dni = dni;
        this.nombresApellidos = nombresApellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.profesion = profesion;
        this.zona = zona;
    }

    abstract double sueldoBruto();

    public double Bono() {
        if (zona.equals("Norte")) return sueldoBruto() * 0.10;
        else if (zona.equals("Central")) return sueldoBruto() * 0.20;
        else if (zona.equals("Sur")) return sueldoBruto() * 0.30;
        else return 0;
    }

    public double sueldoNeto() {
        return sueldoBruto() + Bono();
    }

    @Override
    public String toString() {
        return  "nombresApellidos='" + nombresApellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", sueldoBruto=" + sueldoBruto() +
                ", bono=" + Bono() +
                ", sueldoNeto=" + sueldoNeto();
    }
}
