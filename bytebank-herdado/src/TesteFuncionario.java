public class TesteFuncionario {
    public static void main(String[] args) {

        Gerente joao = new Gerente();
        joao.setNome("João");
        joao.setCpf("111.111.111-11");
        joao.setSalario(10000.00);

        System.out.println(joao.getNome());
        System.out.println(joao.getBonificacao());
    }
}
