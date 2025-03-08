import java.util.Random;
import java.util.Scanner;
public class Akinator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = new Random().nextInt(100);
        System.out.println("Tente acertar o número de 1 a 100, tu tens 5 tentativa");
        for (int i = 0; i < 5; i++) {
            int chute = scanner.nextInt();
            if (chute == numero){
                System.out.println("Acertô miseravi");
                break;
            } else if (numero > chute){
                System.out.println("maior");
            } else if (numero < chute){
                System.out.println("Menor");
            }
        }
        System.out.println("O número era: " + numero);
    }
}