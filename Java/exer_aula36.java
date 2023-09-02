import java.util.Scanner;


public class exer_aula36{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        int n3;

        System.out.println("Qual numero 1:");
        System.out.println("Qual numero 2:");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        
        n1 = n1 % 2;
        n2 = n2 % 2;
        n3 = n2 + n1;
    
        if (n3 == 0){
            System.out.println("MULTIPLOS");
        }
        else{
            System.out.println("NAO MULTIPLOS");
        }



        sc.close();   




    }






}
