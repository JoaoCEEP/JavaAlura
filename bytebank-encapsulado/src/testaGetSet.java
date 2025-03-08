public class testaGetSet {
    public static void main(String[] args) {
        Conta conta = new Conta(547, 265);
        Cliente joao = new Cliente();

        conta.setNumero(1337);
        conta.setTitular(joao);
        conta.getTitular().setProfissao("Programador");

        joao.setNome("João Cerisoli");

        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setCpf("111.111.111-11");

        System.out.println(conta.getNumero());

        System.out.println(conta.getTitular().getNome());

        System.out.println(joao.getNome());

        System.out.println(joao.getProfissao());

        System.out.println(joao.getCpf());

        if (titularDaConta == joao) {
            System.out.println("true");
        } else{
            System.out.println("Não são iguais");
        }
    }
}
