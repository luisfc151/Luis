
public class actividad8 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Ingrese la cantidad total de preguntas realizadas: ");
        int totalPreguntas = scanner.nextInt();
        
     
        System.out.print("Ingrese la cantidad de respuestas correctas: ");
        int respuestasCorrectas = scanner.nextInt();
        
     
        if (totalPreguntas > 0 && respuestasCorrectas >= 0 && respuestasCorrectas <= totalPreguntas) {
           
            double porcentaje = (double) respuestasCorrectas / totalPreguntas * 100;
            
           
            if (porcentaje >= 90) {
                System.out.println("Nivel máximo.");
            } else if (porcentaje >= 75) {
                System.out.println("Nivel medio.");
            } else if (porcentaje >= 50) {
                System.out.println("Nivel regular.");
            } else {
                System.out.println("Fuera de nivel.");
            }
        } else {
            System.out.println("Error: Los datos ingresados son incorrectos.");
        }
        

        scanner.close();
    }
}
 

