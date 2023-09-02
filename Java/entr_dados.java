import java.util.Scanner;
import java.util.Locale;


public class entr_dados {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        String x;
        x=sc.next();
        System.out.println("Voce digitou: " + x);

        int Y;
        Y=sc.nextInt();
        System.out.println("Voce digitou: " + Y);

        double a;
        a=sc.nextDouble();
        System.out.println("Voce digitou: " + a);



        sc.close();

    }
}
