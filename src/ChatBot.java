
import java.util.Scanner;

 class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola, mi nombre es Atom.");
        System.out.println("Me crearon en el virulento año 2020");
        System.out.println("Recuerdame tu nombre...");

        String nombre= scanner.nextLine();

        System.out.println("Que nombre tan chevere tienes, "+ nombre);
        System.out.println("Ahora dejame adivinar tu edad.");
        System.out.println("ingresa el residuo de dividir tu edad para 3, 5 y 7.");
        int remainder3=scanner.nextInt();
        int remainder5=scanner.nextInt();
        int remainder7=scanner.nextInt();

        int age=(remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;


        System.out.println("Tu edad es "+ age+" esa es una muy buena edad para empezar a programar");
    }
}


