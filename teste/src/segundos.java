import java.util.Scanner;

public class segundos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva o número de horas:");

        int horas = scanner.nextInt();
        int minutos = horas * 60;
        int segundos = minutos * 60;

        System.out.println("Em horas = " + horas);
        System.out.println("Em minutos = " + minutos);
        System.out.println("Em segundos = " + segundos);
    }
}