public class TesteConexao {
    public static void main(String[] args) {

        try(Conexao con = new Conexao()) {
            con.leDados();
        } catch (IllegalStateException ex) {
            System.out.println("Deu erro na conexao");
        }


//        try {
//            con = new Conexao();
//            con.leDados();
//        } catch (Exception e) {
//            System.out.println("Deu erro na conexao");
//        } finally {
//            con.fecha();
//        }
    }
}
