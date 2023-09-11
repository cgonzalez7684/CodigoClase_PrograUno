
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Presiona Ctrl+C para salir.");
        
        // Espera indefinidamente hasta que se presione Ctrl+C
        try {
            while (true) {
				System.out.println("Si");
                System.out.println(args[0]);
                Thread.sleep(1000); // Espera durante un segundo
            }
        } catch (InterruptedException e) {
            System.out.println("Saliendo del programa.");
        }

        

        

    }
}
