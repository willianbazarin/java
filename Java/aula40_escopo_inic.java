

public class aula40_escopo_inic {

    public static void main(String[] args){

        double price = 400.00;
        double discount = 0;

        if(price < 200.00){
            discount = price * 0.1;
        }

        System.out.println(discount);
    }
    

}
// se ela nao foi inicia o price dara erro