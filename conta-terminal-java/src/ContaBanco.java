public class ContaBanco {
    private int numero;
    private String agencia;
    private double saldo;

    public ContaBanco(int numero, String agencia, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getAgencia(){
        return agencia;
    }

    public int getNumero(){
        return numero;
    }
}