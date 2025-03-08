import java.util.Scanner;

public class leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Diga seu jogo favorito");
        String jogo = leitura.nextLine();
        System.out.println(jogo);
    }
}
