import java.util.Locale;

public class curso2_variaveis {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		System.out.println(y);
		System.out.printf("%.2f%n",x);
		System.out.printf("%.4f%n",x);
		System.out.println("Boa noite");
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n",x);
		System.out.println("RESULTADO = " + x + " METROS ");
		System.out.printf("RESULTADO = %.2f METROS%n ", x);
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
