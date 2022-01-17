
import java.util.*;

/**
 *
 * @author Jose Ángel Quinto Ferrández / DNI 74368286V
 * @version 1.0
 */
public class Jose_Angel_74368286V {

    static final double FACTOR_HORA_EXTRA = 1.2;
    private String nombreCompleto, dni;
    private double salarioBasePorHora = 10.56;
/**
 * 
 * @param nombreCompleto Nombre completo en mayúsculas.
 * @param dni Documento nacional de identidad con letra y sin espacios.
 * 
 */
    public Jose_Angel_74368286V(String nombreCompleto, String dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
    }

    /**
     * 
     * @param horasExtra  Número de horas extra dedicadas redondeado a la baja (entero)
     * @metod getSalarioEsteMes Calcula el salario bruto mensual en función del salario base por hora y
        las horas extras
     * @return Devuelve el salario bruto mensual en euros con dos decimales
     */
    public double getSalarioEsteMes(int horasExtra) {
        double cantidadExtra, salarioFinal;
        cantidadExtra = horasExtra * this.salarioBasePorHora
                * FACTOR_HORA_EXTRA;
        salarioFinal = this.salarioBasePorHora * 40 * 4 + cantidadExtra;
        salarioFinal = (double) Math.round(salarioFinal * 100d) / 100d;
        return salarioFinal;
    }

    // Este método no lo comentaremos con JavaDoc.
    public static void main(String[] args) {
        Jose_Angel_74368286V emp = new Jose_Angel_74368286V("Jose Angel Quinto",
                "74368286V");
        int horasExtra = 2;
        System.out.println("El salario de " + emp.nombreCompleto + " este mes
será de " + emp.getSalarioEsteMes(horasExtra) + " euros, al hacer " + horasExtra + " horas extra.");
 }
}