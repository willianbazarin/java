package programa;

//import java.util.Scanner;
import programa.utilitarios.Utils;

public class Conta{

    public static int ContadorDeContas = 1;
    
    

    public int numeroConta;
    public Pessoa pessoa;
    public Double saldo = 0.0;
    
    public Conta(Pessoa pessoa) {
        this.numeroConta = ContadorDeContas;
        this.pessoa = pessoa;
        ContadorDeContas += 1;

        
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String toString(){
        return"\nNome: " + this.pessoa.getNome()+
                "\nCPF: " + this.pessoa.getCPF()+
                "\nEmail: " + this.pessoa.getEmail()+
                "\nSaldo: " + Utils.doubleToString(this.getSaldo())+
                "\nConta: " + this.getNumeroConta() + "\n";


    }
    public void depositar(Double valor){
        if (valor > 0) {
            setSaldo(getSaldo()+valor);
            System.out.println("Deposito realiazado com sucesso!!!");
        }else {
            System.out.println("Deposito não Realizado!!!");
        }
    }
    
    public void sacar(Double valor){
        if (valor > 0 && this.getSaldo() >= valor){
            setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado com sucesso!!!");
        }else{
            System.out.println("Saque não realizado!!!");
        }
    }
    public void Transferir(Conta contaParaDeposito, Double valor){
        if (valor > 0 && this.getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            contaParaDeposito.saldo = contaParaDeposito.getSaldo() + valor;
            System.out.println("Transferencia realizada com Sucesso!!!");
        }else{
            System.out.println("Transferencia não realizada!!!");
        }
    }
   // public void rendimento(Double valor){
       // Scanner sc=new Scanner(System.in);
        //Double juros = ;
        //juros = sc.nextDouble();

       // sc.close();
    //}
    
}