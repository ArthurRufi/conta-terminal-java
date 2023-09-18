public class Usuario extends ContaBanco {
    private String nome;

    public Usuario(String nome, int numero, String agencia, double saldo) {
        super(numero, agencia, saldo);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String convertInfos(){
        
    }

    public void allInfos(){
        String infos = nome+getNumero()+getAgencia()+getSaldo(); 
    }
}