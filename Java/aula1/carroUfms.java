package aula1;   


public class carroUfms{
    
    
    // atributos
    String nome;
    String marca;
    int ano;
    int vel;

    // metodos
    void acelerar (int aceleracao){
        vel += aceleracao;
    }
    void freiar (int reduzir){
        vel -= reduzir;
    }
    void buzinar(){
        System.out.println("bibibibbibibiiiiiiiiiiiiii");
    }
}


