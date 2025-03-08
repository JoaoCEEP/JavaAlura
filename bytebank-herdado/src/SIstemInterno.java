public class SIstemInterno {

    private int senha = 2222;

    public void autentica(Autenticavel fa) {
       boolean autenticou = fa.autentica(this.senha);
       if(autenticou){
           System.out.println("Acesso liberado");
       } else {
           System.out.println("Senha incorreta");
        }
    }
}
