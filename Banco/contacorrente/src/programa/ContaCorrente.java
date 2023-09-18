package programa;

import java.util.ArrayList;
import java.util.Scanner;

public class ContaCorrente {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Conta> contasBancarias;

    public static void main(String[] args){
        contasBancarias = new ArrayList<Conta>();
        operacoes();
    }
    public static void operacoes(){

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("-----------------------------Bem Vindos----------------------------------");
        System.out.println("*****************************SELECIONE***********************************");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("|   1 - Criar Conta     |");
        System.out.println("|   2 - Depositar       |");
        System.out.println("|   3 - Sacar           |");
        System.out.println("|   4 - Transferir      |");
        System.out.println("|   5 - Listar          |");
        System.out.println("|   6 - Rendimento      |"); 
        System.out.println("|   7 - Sair            |");
        
        int operacao = input.nextInt();

        switch (operacao) {
        case 1:
            criarConta();
            break;
        case 2:
            depositar();
            break;
        case 3:
            sacar();
            break;
        case 4:
            transferir();
            break;
        case 5:
            listarContas();
            break;
        case 6:
            rendimento();
            break;
        case 7:
            System.out.println("Obrigado por escolher esta agencia");
            System.exit(0);

        default:
            System.out.println("Opcao invalido!!!!");
            operacoes();    
            break;
        }

    }
    public static void criarConta() {
        System.out.println("\nNome: ");
        String nome = input.next();

        System.out.println("\nCPF: ");
        String cpf = input.next();

        System.out.println("\nEmail ");
        String email = input.next();

        Pessoa pessoa = new Pessoa(nome, cpf, email);

        Conta conta = new Conta(pessoa);

        contasBancarias.add(conta);
        System.out.println("Conta criada com sucesso!");
        
        operacoes();
    }
    
    public static Conta encontrarConta(int numeroConta){
        Conta conta = null;
        if(contasBancarias.size() > 0){
            for(Conta c : contasBancarias){
                if(c.getNumeroConta() == numeroConta);{
                    conta = c;
                }
            }
        }
        return conta;
    }
    public static void depositar(){
        System.out.println("Número conta: ");
        int numeroConta = input.nextInt();

        Conta conta = encontrarConta(numeroConta);

        if(conta!= null){
            System.out.println("Valor depositar.");
            Double valorDeposito = input.nextDouble();
            conta.depositar(valorDeposito);
            //System.out.println("Deposito realizado!!!");
        }else{
            System.out.println("Conta nao cadastrada!!!");
        }
        operacoes();
    }
    public static void sacar(){
        System.out.println("Número conta: ");
        int numeroConta = input.nextInt();
        Conta conta = encontrarConta(numeroConta);
        if(conta != null){
            System.out.println("Valor saque? ");
            Double valorSaque = input.nextDouble();
            conta.sacar(valorSaque);
            //System.out.println("Saque realizado!!! ");
        }else{
            System.out.println("Conta não encontrada!!! ");
        }
        operacoes();
    }
    public static void transferir(){
        System.out.println("Remetente: ");
        int numeroContaRemetente = input.nextInt();

        Conta contaRemetente = encontrarConta(numeroContaRemetente);
        if (contaRemetente != null){
            System.out.println("Destinatario: ");
            int numeroContaDestinatario = input.nextInt();

            Conta contaDestinatario = encontrarConta(numeroContaDestinatario);
            if (contaDestinatario != null){
                System.out.println("Valor a ser transferido: ");
                double valor = input.nextDouble();   
                contaRemetente.Transferir(contaDestinatario, valor);
            }else{
                System.out.println("Conta para deposito no localizada.");
            }
        }else{
            System.out.println("Conta para tranferencia não localizada.");
        }
        operacoes();
    }
    public static void rendimento(){
        System.out.println();

    }
    public static void listarContas(){
        if(contasBancarias.size() > 0 ){
            for(Conta conta: contasBancarias){
                System.out.println(conta);
            }
        }else{
            System.out.println("Não há conta cadastrada!!!");
            
        }
        operacoes();
    }
}
