import clasesaparcamiento.Camion;
import clasesaparcamiento.Coche;

public class MainAparcamiento {
    public static void main(String[] args) {
       //Coche Funciona!!
        Coche audi = new Coche("AAAAXXX", "Audi", "A3", 24.40);
        System.out.println(audi.toString());
        audi.calcularImporte();
        System.out.println("El coche tiene que pasar por revision en: "+audi.pasarRevision()+ " anios");

        //Camion Funciona!!
        Camion volvoCamion = new Camion("BBBXXX", 8);
        System.out.println(volvoCamion.toString());
        volvoCamion.calcularImporte();
        System.out.println("Cambio de ruedas: "+ volvoCamion.cambiarRuedas());
        

        //coche No funciona
         Coche bmwincompleto = new Coche("AAAAXX1", "BMW", "xx", -1.00);
        System.out.println(bmwincompleto.toString());
        bmwincompleto.calcularImporte();
        
    }
}
