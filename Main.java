package jogovelha;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        JogoVelha jogo = new JogoVelha();
        Scanner teclado = new Scanner(System.in);
        Jogador j1 = new Jogador();
        Jogador j2 = new Jogador();
        
        j1.caractere = " ";
        j1.jogada=" ";
        j1.nome=" "; 
        
        j2.caractere = " ";
        j2.jogada=" ";
        j2.nome=" ";
        
        System.out.println("Nome J1: ");
        j1.nome = teclado.next();
        System.out.println("Nome J2: ");
        j2.nome = teclado.next();
        
        System.out.println("J1 Insira o caracter: ");
        j1.caractere = teclado.next();
        System.out.println("J2 Insira o caracter: ");
        j2.caractere = teclado.next();
        jogo.Mostrar();
        
        System.out.println("J1 Insira a posição: ");
        j1.jogada = teclado.next();
        jogo.Jogada(j1.jogada, j1.caractere);
        
        System.out.println("J2 Insira a posição: ");
        j2.jogada = teclado.next();
        jogo.Jogada(j2.jogada, j2.caractere);
        jogo.Mostrar();
        
        jogo.Testar(j1.caractere, j2.caractere, j1.nome, j2.nome);
    }
}
