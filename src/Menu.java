import java.sql.Ref;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class Menu {


    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("----Bienvenidos al menu principal----");
            System.out.println("Seleccione 1 para ver la variedad de dispositivos electronicos");
            System.out.println("Seleccione 2 para salir");
            System.out.println("---------------------------------------------------------------");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    DispositivoElectronico(scanner);
                    break;
                case 2:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opcion no valida, intenta de nuevo.");
            }
        }
    }
    private void DispositivoElectronico(Scanner scanner) {
        System.out.println("----Bienvenidos al menu de dispositivos electronicos");
        System.out.println("Tenemos diferentes tipos de dispositivos para tu gusto");
        System.out.println("------------------------------------------------------");
        System.out.println("Ingrese 1 si busca COMPUTADORAS ");
        System.out.println("Ingrese 2 si busca DISPOSITIVOS MOVILES");
        System.out.println("Ingrese 3 si busca ELECTRODOMESTICOS");
        System.out.println("Ingrese 4 para salir");
        System.out.println("------------------------------------------");
        int opcionDispositivosElectronicos = scanner.nextInt();
        scanner.nextLine();
        switch (opcionDispositivosElectronicos) {
            case 1:
                Computadoras(scanner);
                break;
            case 2:
                DispositivoMovil(scanner);
                break;
            case 3:
                Electrodomestico(scanner);
                break;
            case 4:
                System.out.println("Saliendo del programa...");
                return;
            default:
                System.out.println("Opcion no valida, intenta de nuevo.");
        }
    }

    private void Computadoras(Scanner scanner) {
        System.out.println("----Bienvenidos al menu de computadoras----");
        System.out.println("Tenemos diferentes tipos de computadoras para tu gusto");
        System.out.println("-------------------------------------------------------");
        System.out.println("Ingrese 1 si buscas computadoras de escritorio");
        System.out.println("Ingrese 2 si busca computadoras portatiles");
        System.out.println("Ingrese 3 para salir");
        System.out.println("--------------------------------------------------------");
        int opcionComputadoras = scanner.nextInt();
        scanner.nextLine();
        switch (opcionComputadoras) {
            case 1:
                Laptop(scanner);
                break;
            case 2:
                Desktop(scanner);
                break;
            case 3:
                System.out.println("Saliendo del programa...");
                return;
            default:
                System.out.println("Opcion no valida. Intenta de nuevo");
        }
    }
    private void Laptop(Scanner scanner) {

    }

    private void Desktop(Scanner scanner) {

    }

    private void DispositivoMovil(Scanner scanner) {
        System.out.println("----Bienvenidos al menu de dispositivos moviles----");
        System.out.println("Tenemos diferentes tipos de dispositivos moviles para tu gusto");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Ingrese 1 si buscas dispositivos moviles inteligentes");
        System.out.println("Ingrese 2 si buscas dispositivos moviles de Tableta");
        System.out.println("Ingrese 3 para salir");
        System.out.println("----------------------------------------------------");
        int opcionDispositivoMovil = scanner.nextInt();
        scanner.nextLine();

        switch (opcionDispositivoMovil) {
            case 1:
                Smartphone(scanner);
                break;
            case 2:
                Tablet(scanner);
                break;
            case 3:
                System.out.println("Saliendo del programa...");
                return;
            default:
                System.out.println("Opcion no valida. Intenta de nuevo");

        }

    }

    private void Smartphone(Scanner scanner) {

    }

    private void Tablet(Scanner scanner) {

    }

    private void Electrodomestico(Scanner scanner) {
        System.out.println("----Bienvenidos al menu de electrodomesticos----");
        System.out.println("Tenemos diferentes tipos de dispositivos moviles para tu gusto");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Ingrese 1 si buscas refrigeradores");
        System.out.println("Ingrese 2 para salir");
        System.out.println("-----------------------------------");
        int opcionElectrodomestico = scanner.nextInt();
        scanner.nextLine();

        switch (opcionElectrodomestico) {
            case 1:
                Refrigerador(scanner);
                break;
            case 2:
                System.out.println("Saliendo del programa...");
                return;
            default:
                System.out.println("Opción no válida. Intenta de nuevo.");
        }
    }

    private void Refrigerador(Scanner scanner){

    }
}