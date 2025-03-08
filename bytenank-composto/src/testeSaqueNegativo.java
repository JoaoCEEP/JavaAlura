public class testeSaqueNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposito(100);
        System.out.println(conta.saque(200));

        System.out.println(conta.getSaldo());
    }
}
