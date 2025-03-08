public class Conta {

    private double saldo;
    int agencia;
    int numero;
    Cliente titular;

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

    boolean transferencia(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposito(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }
}