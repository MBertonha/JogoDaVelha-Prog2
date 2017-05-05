
package jogovelha;


public class JogoVelha extends Jogador {
  
    String[][] tabuleiro = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
    Jogador j1 = new Jogador();
    Jogador j2 = new Jogador();
    
    public String Mostrar(){
        for(int li = 0; li < 3; li++){
            for(int co = 0; co < 3; co++){
                System.out.printf("  " + tabuleiro[li][co]);
            }
        System.out.println("\n");
        }
        System.out.println("\n");
       return null;
    }
    public boolean Valido (String posicao){
         for(int li = 0; li < 3; li++){
            for(int co = 0; co < 3; co++){
                if(tabuleiro[li][co].equals(posicao))
                    return true;
            }
        }
       return false;
    }
    
    public void Jogada(String posicao, String c){
        if (posicao.equals("1")){
            if(tabuleiro[0][0] == "1"){
                tabuleiro[0][0] = c;
            }
        }
        if (posicao.equals("2")){
            if(tabuleiro[0][1] == "2"){
                tabuleiro[0][1] = c;
            }
        }
        if (posicao.equals("3")){
            if(tabuleiro[0][2] == "3"){
                tabuleiro[0][2] = c;
            }
        }
        if (posicao.equals("4")){
            if(tabuleiro[1][0] == "4"){
                tabuleiro[1][0] = c;
            }
        }
        if (posicao.equals("5")){
            if(tabuleiro[1][1] == "5"){
                tabuleiro[1][1] = c;
            }
        }
        if (posicao.equals("6")){
            if(tabuleiro[1][2] == "6"){
                tabuleiro[1][2] = c;
            }
        }
        if (posicao.equals("7")){
            if(tabuleiro[2][0] == "7"){
                tabuleiro[2][0] = c;
            }
        }
        if (posicao.equals("8")){
            if(tabuleiro[2][1] == "8"){
                tabuleiro[2][1] = c;
            }
        }
        if (posicao.equals("9")){
            if(tabuleiro[2][2] == "9"){
                tabuleiro[2][2] = c;
            }
        }
    }
    
    public void Testar(String c1, String c2, String n1, String n2){
        //J1
        if (tabuleiro[0][0]==c1 && tabuleiro[0][1]==c1 && tabuleiro[0][2]==c1){
            System.out.println("Vencedor = " + n1);
        }
        if (tabuleiro[1][0]==c1 && tabuleiro[1][1]==c1 && tabuleiro[1][2]==c1){
            System.out.println("Vencedor = "+ n1);
        }
        if (tabuleiro[2][0]==c1 && tabuleiro[2][1]==c1 && tabuleiro[2][2]==c1){
            System.out.println("Vencedor = "+ n1);
        }
        if (tabuleiro[0][0]==c1 && tabuleiro[1][0]==c1 && tabuleiro[2][0]==c1){
            System.out.println("Vencedor = "+ n1);
        }
        if (tabuleiro[0][1]==c1 && tabuleiro[1][1]==c1 && tabuleiro[2][1]==c1){
            System.out.println("Vencedor = "+ n1);
        }
        if (tabuleiro[0][2]==c1 && tabuleiro[1][2]==c1 && tabuleiro[2][2]==c1){
            System.out.println("Vencedor = "+ n1);
        }
        if (tabuleiro[0][0]==c1 && tabuleiro[1][1]==c1 && tabuleiro[2][2]==c1){
            System.out.println("Vencedor = "+ n1);
        }
        if (tabuleiro[0][2]==c1 && tabuleiro[1][1]==c1 && tabuleiro[2][0]==c1){
            System.out.println("Vencedor = "+ n1);
        }
        //J2
        if (tabuleiro[0][0]==c2 && tabuleiro[0][1]==c2 && tabuleiro[0][2]==c2){
            System.out.println("Vencedor = "+ n2);
        }
        if (tabuleiro[1][0]==c2 && tabuleiro[1][1]==c2 && tabuleiro[1][2]==c2){
            System.out.println("Vencedor = "+ n2);
        }
        if (tabuleiro[2][0]==c2 && tabuleiro[2][1]==c2 && tabuleiro[2][2]==c2){
            System.out.println("Vencedor = "+ n2);
        }
        if (tabuleiro[0][0]==c2 && tabuleiro[1][0]==c2 && tabuleiro[2][0]==c2){
            System.out.println("Vencedor = "+ n2);
        }
        if (tabuleiro[0][1]==c2 && tabuleiro[1][1]==c2 && tabuleiro[2][1]==c2){
            System.out.println("Vencedor = "+ n2);
        }
        if (tabuleiro[0][2]==c2 && tabuleiro[1][2]==c2 && tabuleiro[2][2]==c2){
            System.out.println("Vencedor = "+ n2);
        }
        if (tabuleiro[0][0]==c2 && tabuleiro[1][1]==c2 && tabuleiro[2][2]==c2){
            System.out.println("Vencedor = "+ n2);
        }
        if (tabuleiro[0][2]==c2 && tabuleiro[1][1]==c2 && tabuleiro[2][0]==c2){
            System.out.println("Vencedor = "+ n2);
        }
        else{
            System.out.println("EMPATE");
        }
    }
}//--------------------------------------------FINAL
