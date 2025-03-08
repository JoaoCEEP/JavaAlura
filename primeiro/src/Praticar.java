import java.util.Scanner;

public class Praticar {
    public static void main(String[] args) {
        Scanner pratica = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = pratica.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
//        System.out.print("Digite um número: ");
//        int numero = pratica.nextInt();
//        System.out.println("Tabuada do " + numero + ":");
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(numero + " x " + i + " = " + (numero * i));
//        }
//
//        int multiplicador = 0;
//        System.out.println("Escolha um número");
//        int tabuada = pratica.nextInt();
//        while (multiplicador < 10){
//            multiplicador++;
//            System.out.println(tabuada * multiplicador);
//        }

//        System.out.println("Escolha um número inteiro");
//        int parOuImpar = pratica.nextInt();
//        if (parOuImpar %2 ==0) {
//            System.out.println("Seu número é par");
//        } else {
//            System.out.println("Seu número é impar");
//        }

//        System.out.println("Aprte 1 para calcular a área do quadrado e 2 para a área do circulo");
//        int escolha = pratica.nextInt();
//        if (escolha == 1) {
//            System.out.println("escolha o valor do lado do quadrado");
//            double ladoQuadrado = pratica.nextDouble();
//            System.out.println(ladoQuadrado * ladoQuadrado);
//        } if (escolha == 2) {
//            System.out.println("Escolha o raio do círculo");
//            double raio = pratica.nextDouble();
//            System.out.println(3.14 * (raio * raio));
//        }

//        System.out.println("Insira 2 números inteiros");
//        int um = pratica.nextInt();
//        int dois = pratica.nextInt();
//
//        if (um == dois) {
//            System.out.println("São iguais");
//        } else {
//            System.out.println("São diferentes");
//        } if (um > dois) {
//            System.out.println("Primeiro termo é maior que o segundo");
//        } else {
//            System.out.println("Segundo termo é maior que o primeiro");
//        }

//        System.out.println("Escreva um número");
//        int teste = pratica.nextInt();
//        if (teste >= 0) {
//            System.out.println("Seu número é positivo");
//        } else {
//            System.out.println("Seu número é negativo");
//        }
    }
}
