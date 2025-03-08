public class exemploMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Conta contaNova = new  Conta();
        contaNova.saldo = 500;
        conta.saldo = 100;
        conta.saque(50);
        boolean conseguiuRetirar = conta.saque(50);

        if (contaNova.transfere(700, conta)) {
            System.out.println("Concluido");
        } else {
            System.out.println("Ocorreu algum erro");
        }

        System.out.println(conta.saldo);
        System.out.println(conseguiuRetirar);
        System.out.println(contaNova.saldo);


    }
}
