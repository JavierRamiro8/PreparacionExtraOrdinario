package clasesaparcamiento;

public abstract class Vehiculo {
    private String matricula;

    public void Vehiculos(String matricula, enumAparcamiento tipo) {
        this.matricula = matricula;
    }

    public Vehiculo(String matricula) {
        super();
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public abstract void calcularImporte();

    @Override
    public String toString() {
        if(matricula=="" || matricula==null){
            return "La matricula no es valida o no se ha introducido";
        }else {
        return "matricula: " + matricula;
        }
    }

}
