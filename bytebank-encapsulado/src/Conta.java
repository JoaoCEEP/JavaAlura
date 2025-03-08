public class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta (int agencia, int numero) {
        total++;
        System.out.println(total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println(this.agencia);
        System.out.println(this.numero);
    }

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

    public int getAgencia() {
        return this.agencia;
        }

    public int getNumero() {
        return this.numero;
        }

    public void setNumero(int novoNumero) {
        if (novoNumero <= 0) {
            System.out.println("Erro");
            return;
        }
        this.numero = novoNumero;
        }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setAgencia(int agencia) {
        if (agencia <=0){
            System.out.println("Erro");
            return;
        }
        this.agencia = agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static int getTotal() {
        return total;
    }
}
