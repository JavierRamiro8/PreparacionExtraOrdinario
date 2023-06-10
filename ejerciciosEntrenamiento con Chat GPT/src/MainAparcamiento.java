import clasesaparcamiento.Camion;
import clasesaparcamiento.Coche;

public class MainAparcamiento {
    public static void main(String[] args) {
        // Coche Funciona!!
        Coche audi = new Coche("AAAAXXX", "Audi", "A3", 24.40);
        System.out.println(audi.toString());

        // Camion Funciona!!
        Camion volvoCamion = new Camion("BBBXXX", 8);
        System.out.println(volvoCamion.toString());

        // coche No funciona
        Coche bmwincompleto = new Coche("AAAAXX1", "", "xx", 1.00);
        System.out.println(bmwincompleto.toString());

        //Camion no funciona
        Camion renaultCamion= new Camion("BBBXXX", 0);
        System.out.println(renaultCamion.toString());
    }   
}
