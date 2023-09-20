import java.util.Scanner;

public class ContaBanco {
    private String nome;
    private int numero;
    private String agencia;
    private double saldo;
    

    public ContaBanco(String nome,int numero, String agencia, double saldo) {
        this.nome = nome;
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

    
    public String getcNome() {
        return nome;
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

    public boolean searchUser(){
        
        setNome();
        setAgenc();
        setNumero();
        setSaldo();

        System.out.println("Seu numero de conta é: "+ getNumero() + "\nSua agencia é: " + getAgencia());
        return true;
    }

    public void setNome(){
        System.out.println("Insira seu nome: ");
        Scanner scanner =  new Scanner(System.in);
        String nameLer = scanner.nextLine();
        this.nome = nameLer;
    }

    public void setAgenc(){
        System.out.println("Insira sua agencia: ");
        Scanner scanner =  new Scanner(System.in);
        String agenciaLer = scanner.nextLine();
        this.agencia = agenciaLer;
    }
    
    public void setNumero(){
        System.out.println("Insira seu Numero: ");
        Scanner scanner =  new Scanner(System.in);
        int numeroLer = scanner.nextInt();
        this.numero = numeroLer;
    }

    public void setSaldo(){
        float saldinho = numero + 3 * 321 / 2;
        saldo = saldinho;
    }
}