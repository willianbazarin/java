import java.util.Scanner;

public class Aula49For {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        int soma = 0;
        for (int i = 0; i < N; i ++) {                   // i++ é igual a i=i+1
            int x = sc.nextInt();
            soma = soma + x; // não pode ser resumido pois tem que declara o x.
        

        System.out.println(soma);


        }

        sc.close();
    }
}
