import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner notas = new Scanner (System.in);
        double nota = 0;
        double media = 0;
        int totalDeNotas = 0;
        int numero = 0;

        while (nota != -1) {
            System.out.println("Digite a sua avaliação");
            nota = notas.nextDouble();
            if (nota != -1) {
                media += nota;
                totalDeNotas++;
            }
        }
        System.out.println(media / totalDeNotas);

        while (numero < 10) {
            numero++;
            System.out.println(numero);
        }

        for(int contador = 1; contador <= 10; contador++) {
            System.out.println(contador);
        }
    }
}