public class testaNegativos {
    public static void main(String[] args) {
        Conta conta = new Conta(485, 429);
        Conta conta1 = new Conta(874, 514);
        Conta conta2 = new Conta(112, 420);
        Conta conta3 = new Conta(1557, 799);

        System.out.println(Conta.getTotal());
    }
}
