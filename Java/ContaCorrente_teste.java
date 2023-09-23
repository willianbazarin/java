

public class ContaCorrente_teste {

        public float juros = 0.01f;
        public float saldo = 0.0f;
        public float limiteChequeEspecial = -200.0f;
        public String primeiroNome;
        public String sobrenome;
        public long numeroConta;
    public static void main(String[] args) {
            ContaCorrente_teste conta = new ContaCorrente_teste("Willian", "Bazarin", 123456);
            conta.deposito(100.0f);
            conta.saque(125.0f);
            conta.rendimento();
            conta.exibirSaldo();
        }
        public ContaCorrente_teste(String primeiroNome, String sobrenome, long numeroConta) {
            this.primeiroNome = primeiroNome;
            this.sobrenome = sobrenome;
            this.numeroConta = numeroConta;
        }
        public void deposito(float valor) {
            saldo += valor;
        }
        public void saque(float valor) {
            if (saldo + limiteChequeEspecial >= valor) {
                saldo -= valor;
            } else {
                System.out.println("Limite insuficiente!");
            }
        }
        public void rendimento() {
            if (saldo > 0) {
                saldo += saldo * juros;
                
                System.out.println("Rentabilidade: R$" +  saldo);
            }
        }
        public void exibirSaldo() {
            System.out.println("Saldo da conta: R$" + saldo);
        }
    
        public String getNome() {
            return primeiroNome + " " + sobrenome;
        }
        public long getNumero() {
            return numeroConta;
        }

}