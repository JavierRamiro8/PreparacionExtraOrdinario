import java.util.Scanner;

public class MainEjercicioLecturaSumarAmpliado {
    public static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        String respuesta="no";
        do{
        System.out.println("Elige una opcion");
        System.out.println("1) introducir valores y cargarlos en un archivo");
        System.out.println("2) lectura de ese fichero y sumar los datos de ese archivo");
        System.out.println("3) Salir");
        int opcionMenu=in.nextInt();
        switch(opcionMenu){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Numero no valido");
        }
        
        }while(respuesta.equalsIgnoreCase(respuesta));
    }
}
