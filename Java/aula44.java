import java.util.Scanner;

public class aula44 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // este é o imput
        int soma = 0;
        while (x != 0){
            soma += x; // é o acumulador, todo numero que for digitado sera somado
            x = sc.nextInt();
        } 
        System.out.println(soma);
        sc.close();

    }
}
// em quanto nao foi digitado o numero 0, continuara o laço de repetição. 