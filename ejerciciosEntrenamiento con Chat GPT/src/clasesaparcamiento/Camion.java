package clasesaparcamiento;

public class Camion extends Vehiculo {
    private int numeroRuedas;

    public Camion(String matricula, int numeroRuedas) {
        super(matricula);
        this.numeroRuedas = numeroRuedas;
    }

    public String cambiarRuedas() {
        int numeroCambioRuedas = 6;
        return (numeroRuedas > numeroCambioRuedas)?"necesario":"No es necesario";
    }

    public int getNumeroRuedas() {
    return numeroRuedas;
}

    public void calcularImporte() {
        final int numeroCalculoCamion = 15;
        int importeCamion = numeroCalculoCamion * getNumeroRuedas();
        System.out.println("El precio por el camión es: " + importeCamion);
    }

    @Override
    public String toString() {
        return enumAparcamiento.CAMION + "--- " + super.toString() + " " + "Numero de ruedas: " + numeroRuedas;
    }
}
