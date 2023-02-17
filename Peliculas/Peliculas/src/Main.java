import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion = 0;
        String cita = "";
        while (opcion != 5) {
            System.out.println("Elija una opción:");
            System.out.println("1 - Una cita de la ciudad del miedo");
            System.out.println("2 - Una cita de James Bond");
            System.out.println("3 - Una cita de la vida es un largo río tranquilo");
            System.out.println("4 - Una cita de Star Wars");
            System.out.println("5 - Salir de esta magnífica aplicación");
            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Cuidado, es una auténtica carnicería\n");
                    break;
                case 2:
                    System.out.println("Me llamo Bond, James Bond\n");
                    break;
                case 3:
                    System.out.println("No me toques las palmas que me conozco\n");
                    break;
                case 4:
                    System.out.println("Que la fuerza te acompañe\n");
                    break;
                case 5:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción del menú.\n");
                    break;
            }
        }
    }
}