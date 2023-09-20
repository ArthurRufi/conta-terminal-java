public class Usuario extends ContaBanco {
    private String nome;

    public Usuario(String nome, int numero, String agencia, double saldo) {
        super(nome ,numero, agencia, saldo);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    //converter as entradas em Strings, todas as entradas

    public String allInfos(){
        String convertAgencia = ""+getAgencia();
        String convertNumero = ""+getNumero();
        String convertSaldo = ""+getSaldo();
        String infos = "Nome: " + nome + "\nAgencia: "+convertAgencia+"\nNumero: "+convertNumero+"\nSaldo: "+convertSaldo; 
        
        return infos;
    }

    public void addUser(){
        
    }
}