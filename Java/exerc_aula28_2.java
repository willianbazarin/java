import java.util.Scanner;
import java.util.Locale;

public class exerc_aula28_2 {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        

        double area = 3.14159 * (x * x);

        System.out.printf("Area = %.4f%n", area);

        sc.close();

    }
}
