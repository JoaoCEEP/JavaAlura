import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner matematica = new Scanner(System.in);

        int i = 0;
        double resultado;

        while(i==0){
            System.out.println("Escolha um número qualquer: ");
            double num1 = matematica.nextDouble();
            System.out.println("Escolha a operação matemática; + - * /: ");
            char operacao = matematica.next().charAt(0);
            System.out.println("Escolha o segundo número");
            double num2 = matematica.nextDouble();

            switch (operacao){
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    resultado = num1 / num2;
                    break;
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                default:
                    System.out.println("Opção invalida");
                    return;
            }
            System.out.println(num1+" "+operacao+" "+num2+" = "+resultado);
            resultado -= resultado;
        }
    }
}
