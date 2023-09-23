public class ContaCorrente {
    
        // Atributos
        public float juros = 0.01f;
        public float saldo = 100000.0f;
        public float limiteChequeEspecial = -200.0f;
        public String primeiroNome;
        public String sobrenome;
        public long numeroConta;
    
        public ContaCorrente(String primeiroNome, String sobrenome, long numeroConta) {
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
    
        
        public static void main(String[] args) {
            ContaCorrente conta = new ContaCorrente("Willian", "Bazarin", 123456);
            conta.deposito(100.0f);
            conta.saque(20000.0f);
            conta.rendimento();
            conta.exibirSaldo();
        }
}
            
