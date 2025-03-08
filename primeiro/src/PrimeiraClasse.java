public class PrimeiraClasse {
    public static void main(String[] args) {
        System.out.println("Conclui a aula 1");

        String saudacao = "Olá, ";
        String alura = "Alura";
        System.out.println(saudacao + alura + "!");

        double media = (9.7 + 9.5 + 6.9 + 7.8) /4;
        System.out.println(media);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);

        int celsius = 14;
        double fah = (celsius * 1.8) +32;
        int temperatura = (int) (fah);
        System.out.println(temperatura);

        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));

        String fala = """
                TESTE TESTE TESTE
                LOREM LOREM LOREM
                TESTE
                """;

        System.out.println(fala);

        String senha = "12345";
        if (senha.equals("12355")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }

        //desafios

        double notas = (8.9 + 6.7) /2;
        System.out.println(notas);

        double original = 8.5698;
        int casting = (int) (original);
        System.out.println(casting);

        char Letra = 'A';
        String fim = "Sua nota foi ";
        System.out.println(fim + Letra);

        double preco = 4.98;
        int quantidade = 47;
        System.out.println(preco * quantidade);

        String dolar = "dolar";
        double Qdolar = 4.94;
        int Qreais = 600;
        double conversao = Qreais /Qdolar;
        System.out.println(String.format("Esse é a quantidade de %s que tu tens %.2f", dolar, conversao));

        double precoOriginal = 150.0;

        double percentualDesconto = 10.0;
        double valorDesconto = (percentualDesconto / 100.0) * precoOriginal;
        double novoPreco = precoOriginal - valorDesconto;

        System.out.println("Preço original: R$" + precoOriginal);
        System.out.println("Desconto: R$" + valorDesconto);
        System.out.println("Novo preço com desconto: R$" + novoPreco);
    }
}