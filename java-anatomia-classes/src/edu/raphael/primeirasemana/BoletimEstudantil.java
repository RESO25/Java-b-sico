package edu.raphael.primeirasemana;
public class BoletimEstudantil {
    public static void main(String[] args) {
        
        int media = 10;

        String aprovacao;

        if (media>6)
            aprovacao = "REPROVADO";
        else if (media == 6)
            aprovacao = "PROVA MINERVA";
        else
            aprovacao = "APROVADO";

        System.out.println(aprovacao);
    }
}
