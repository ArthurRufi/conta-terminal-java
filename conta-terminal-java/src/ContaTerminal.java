import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //iniciar o scanner "op" que sinaliza as opções selecionadas pelo usuario
        Scanner scanner =  new Scanner(System.in);

        //bloco de boas vindas ao usuario e escolha de opções iniciais
        System.out.println("Bem vindo(x) ao banco DIO\nSiga as intruções");
        System.out.println("Você já é cliente? (Sim/Nao)");
        String op = scanner.nextLine();

        
        //divisão de opções, no sim ele deve consultar seus dados (não disponivel para consulta ainda)

        if (op.equals("Sim") || op.equals("s")){
            
            //receber informações do cliente
            // colocar as chamadas de informações dentro de metodos
            ContaBanco busca = new ContaBanco(null, 0, op, 0);

            if (busca.searchUser()){
                Usuario user = new Usuario(busca.getcNome(), busca.getNumero(), busca.getAgencia(), busca.getSaldo());
                System.out.println(user.allInfos());
                
            }

            boolean cond = true;

            do{
                System.out.println("Sua informações estão corretas?\n(S/N)");
                String op2 = scanner.nextLine();
                scanner.close();
                if (op2.equals("S") || op2.equals("s")){
                    cond = false;
                }
            }while(cond);
            
        }
        else if(op.equals("Nao") || op.equals("n")){

            System.out.println("Insira suas informações pessoais para realizar o cadastro: ");
            ContaBanco buscar = new ContaBanco(null, 0, op, 0);
            buscar.searchUser();
            Usuario user1 = new Usuario(buscar.getcNome(), buscar.getNumero(), buscar.getAgencia(), buscar.getSaldo());
            System.out.println(user1.allInfos());
        }

        scanner.close();
    }
}

