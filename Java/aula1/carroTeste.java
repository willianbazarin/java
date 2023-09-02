package aula1;  

public class carroTeste {

    public static void main(String[] args) {

        carroUfms c1 = new carroUfms();
        
        c1.nome = "Uno";
        c1.marca = "Fiat";
        c1.ano = 2015;
        c1.vel = 100;

        c1.acelerar(10);

        System.out.println("Velocidade: " + c1.vel + "km/h");
        
        c1.freiar(50);

        System.out.println("Velocidade: " + c1.vel + "km/h");
    }
    
}
