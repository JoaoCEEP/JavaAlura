public class Gerente extends Funcionario implements Autenticavel {

    public double getBonificacao() {
        return super.getSalario();
    }

    private AutenticadorUtil autenticador;

    public Gerente (){
        this.autenticador = new AutenticadorUtil();
    }

    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}