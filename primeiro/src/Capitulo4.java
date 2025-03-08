import java.util.Scanner;

public class Capitulo4 {
    public static void main(String[] args) {
        Scanner banco = new Scanner(System.in);

        System.out.println("Qual seu nome: ");
        String nome = banco.nextLine();
        System.out.println("Qual seu tipo de conta: ");
        String tipoConta = banco.nextLine();
        System.out.println("Qual seu saldo disponivel: ");
        double saldoInicial = banco.nextDouble();

        System.out.println("""
                
                *******************************
                Dados iniciais do cliente:
                """);
        System.out.println("Nome:                "+ nome);
        System.out.println("Tipo da conta:       "+ tipoConta);
        System.out.println("Saldo disponível:    " +saldoInicial);
        System.out.println("*******************************");

        System.out.println("""
                
                Operações
                
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                """);

        System.out.println("Digite a opção desejada: ");

        int opcao = 0;
        double acrescimo = 0;
        double debito = 0;
        while (opcao != 4) {
            System.out.println("""
                
                Operações
                
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                """);
            opcao = banco.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo é: "+saldoInicial);
                    opcao -= opcao;
                    break;
                case 2:
                    System.out.println("Escolha o valor a ser creditado");
                    acrescimo = banco.nextDouble();
                    saldoInicial += acrescimo;
                    System.out.println("Seu novo saldo é: "+saldoInicial);
                    opcao -= opcao;
                    break;
                case 3:
                    System.out.println("Escolha o valor a ser debitado");
                    debito = banco.nextDouble();
                    if (debito > saldoInicial) {
                        System.out.println(nome+ " não tem saldo suficiente");
                    } else {
                        saldoInicial -= debito;
                        System.out.println("Seu novo saldo é: "+saldoInicial);
                        opcao -= opcao;
                    }
                    break;
                default:
                    System.out.println("Essa opção é inválida tente outro comando.");
            }
        }
    }
}
