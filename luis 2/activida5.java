import java.util.Scanner;

public class activida5 {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

 
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("El mayor número es: " + num1);
        } else if (num2 > num1) {
            System.out.println("El mayor número es: " + num2);
        } else {
            System.out.println("Los números son iguales.");
        }

        scanner.close();
    }
}

