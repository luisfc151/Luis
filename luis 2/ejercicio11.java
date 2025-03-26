import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contarMayores = 0;
        int contarMenores = 0;

      
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese la nota " + i + ": ");
            double nota = scanner.nextDouble();
            
            if (nota >= 7) {
                contarMayores++;
            } else {
                contarMenores++;
            }
        }
        

        System.out.println("Cantidad de notas mayores o iguales a 7: " + contarMayores);
        System.out.println("Cantidad de notas menores a 7: " + contarMenores);
        
        scanner.close();
    }
}
