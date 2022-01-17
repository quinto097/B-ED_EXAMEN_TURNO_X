
import java.util.*;


public class Jose_Angel_74368286V {

    static final double FACTOR_HORA_EXTRA = 1.2;
    private String nombreCompleto, dni;
    private double salarioBasePorHora = 10.56;

    public Jose_Angel_74368286V(String nombreCompleto, String dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
    }

    
    public double getSalarioEsteMes(int horasExtra) {
        double cantidadExtra, salarioFinal;
        cantidadExtra = horasExtra * this.salarioBasePorHora
                * FACTOR_HORA_EXTRA;
        salarioFinal = this.salarioBasePorHora * 40 * 4 + cantidadExtra;
        salarioFinal = (double) Math.round(salarioFinal * 100d) / 100d;
        return salarioFinal;
    }

    
    public static void main(String[] args) {
        Jose_Angel_74368286V emp = new Jose_Angel_74368286V("Jose Angel Quinto",
                "74368286V");
        int horasExtra = 2;
        System.out.println("El salario de " + emp.nombreCompleto + " este mes
será de " + emp.getSalarioEsteMes(horasExtra) + " euros, al hacer " + horasExtra + " horas extra.");
 }
}