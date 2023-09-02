import java.util.Scanner;
import java.util.Locale;


public class exerc_aula28_4 {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int valor = sc.nextInt();
        double horas = sc.nextDouble();

        double salary = valor * horas;
        System.out.println("NUMBER = " + number);
        System.out.println("SALARY = U$ " + salary);

        sc.close();
        




    }
}
