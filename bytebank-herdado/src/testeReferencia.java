public class testeReferencia {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        EditorVideo ev1= new EditorVideo();

        g1.setNome("João");
        g1.setSalario(5000);
        System.out.println(g1.getBonificacao());


        ev1.setSalario(2500);
        System.out.println(ev1.getBonificacao());

        ControleBonificacao controle = new ControleBonificacao();

        controle.registro(g1);
        controle.registro(ev1);

        System.out.println(controle.getSoma());
    }
}
