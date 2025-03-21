import java.util.Scanner;

public class actividad7 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("Ingrese un número entero positivo de hasta tres cifras: ");
        int numero = scanner.nextInt();
        
      
        if (numero > 0 && numero <= 999) {
            // Contar el número de cifras
            int cifras = (numero < 10) ? 1 : (numero < 100) ? 2 : 3;
            
            
            if (cifras == 1) {
                System.out.println("El número tiene 1 cifra.");
            } else if (cifras == 2) {
                System.out.println("El número tiene 2 cifras.");
            } else {
                System.out.println("El número tiene 3 cifras.");
            }
        } else {
          
            System.out.println("Error: El número debe ser positivo y tener hasta tres cifras.");
        }

    
        scanner.close();
    }
}
