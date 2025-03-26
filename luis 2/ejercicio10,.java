
    import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingrese el sueldo del operario: ");
        double sueldo = scanner.nextDouble();
        
        System.out.print("Ingrese los años de antigüedad: ");
        int antiguedad = scanner.nextInt();
        
       
        if (sueldo < 500) {
            if (antiguedad >= 10) {
                sueldo *= 1.2; 
            } else {
                sueldo *= 1.05; 
            }
        }
        
       
        System.out.println("El sueldo a pagar es: " + sueldo);
        
        scanner.close();
    }
}

