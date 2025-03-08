public class Conta{

    double saldo;
    int agencia;
    int numero;
    String titular;

    void deposito(double valor) {
        this.saldo += valor;
    }

    boolean saque(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    boolean transfere(double valor, Conta destino) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            destino.deposito(valor);
            return true;
        } else {
            return false;
        }
    }
}