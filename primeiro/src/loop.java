import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);
        double nota = 0;
        double media = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("Sua nota do filme");
            nota = notas.nextDouble();
            media += nota;
        }

        System.out.println("Média do filme é " + media /4);
    }
}
