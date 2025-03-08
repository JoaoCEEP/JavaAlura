public class TesteSistema {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        c.setSenha(2222);
        SIstemInterno si = new SIstemInterno();

        si.autentica(c);

        Gerente g1 = new Gerente();
        g1.setSenha(2222);
        Administrador adm = new Administrador();
        adm.setSenha(2222);



        si.autentica(g1);
        si.autentica(adm);
    }
}
