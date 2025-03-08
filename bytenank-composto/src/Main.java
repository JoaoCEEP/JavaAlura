public class Main {
    public static void main(String[] args) {
        Cliente joao = new Cliente();
        joao.nome = "João Cerisoli";
        joao.cpf = "111.111.111-00";
        joao.profissao = "Geógrafo";

        Conta contaDoJoao = new Conta();
        contaDoJoao.deposito(100);

        contaDoJoao.titular = joao;
        System.out.println(contaDoJoao.titular.nome);

        Conta contaDoHugo = new Conta();
        contaDoHugo.titular = new Cliente();
        contaDoHugo.titular.nome = "Hugo";
        System.out.println(contaDoHugo.titular.nome);
    }
}