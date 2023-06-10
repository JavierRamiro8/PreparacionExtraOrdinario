package clasesaparcamiento;

public class Camion extends Vehiculo {
    private int numeroRuedas;

    public Camion(String matricula, int numeroRuedas) {
        super(matricula);
        this.numeroRuedas = numeroRuedas;
    }

    public String cambiarRuedas() {
        int numeroCambioRuedas = 6;
        return numeroRuedas > numeroCambioRuedas ? "necesario" : "No es necesario";
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public String calcularImporte() {
        final int numeroCalculoCamion = 15;
        int importeCamion = numeroCalculoCamion * getNumeroRuedas();
        return "El precio por el camión es: " + importeCamion;
    }

    @Override
    public String toString() {
        if (super.getMatricula() == null || super.getMatricula().isEmpty() || numeroRuedas <= 0) {
            return "el numero de ruedas o matricula es invalido";
        } else {
            return enumAparcamiento.CAMION + "--- " + super.toString() + " " + "Numero de ruedas: " + numeroRuedas + " ----- "
                    + calcularImporte() + " " + " el cambio de ruedas es: " + cambiarRuedas();
        }
    }
}
