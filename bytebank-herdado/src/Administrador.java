public class Administrador extends Funcionario implements Autenticavel {

    public double getBonificacao() {
        return 50;
    }

    private AutenticadorUtil autenticador;

    public Administrador (){
        this.autenticador = new AutenticadorUtil();
    }

    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}
