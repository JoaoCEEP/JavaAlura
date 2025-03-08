import java.util.Scanner;

public class grawus {
    public static void main(String[] args) {
        Scanner temperatura = new Scanner(System.in);
        System.out.println("Escreva quantos graus celsius está:");
        int celsius = temperatura.nextInt();

        double fahrenheit = celsius * 1.8 + 32;
        int fahrenheitCasting = (int) (fahrenheit);
        if (fahrenheit - fahrenheitCasting > 0.5){
            System.out.println("Em fahrenheit é " + Math.ceil(fahrenheit));
        } else {
            System.out.println("Em fahrenheit é " + Math.floor(fahrenheit));
        }

        double rankine = celsius * 1.8 + 32 + 459.67;
        int rankineCasting = (int) (rankine);
        if (rankine - rankineCasting > 0.5){
            System.out.println("Em Rankine é " + Math.ceil(fahrenheit));
        } else {
            System.out.println("Em Rankine é " + Math.floor(fahrenheit));
        }

        double reaumur = celsius * 0.8;
        int reamurCasting = (int) (reaumur);
        if (reaumur - rankineCasting > 0.5){
            System.out.println("Em Reamur é " + Math.ceil(reaumur));
        } else {
            System.out.println("Em Reamur é " + Math.floor(reaumur));
        }
    }
}
