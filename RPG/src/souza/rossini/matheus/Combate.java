package souza.rossini.matheus;

import java.util.Scanner;

public class Combate {
    private Scanner scanner;
    public Jogador player;
    public Inimigo npc;

    private void exibirMenu() {
        System.out.println("O que deseja fazer?");
        System.out.println("1. Bater");
        System.out.println("2. Curar");
        System.out.println("0. Desistir");
    }

    private void avaliarOpcao(int opcao) {
        switch (opcao) {
            case 0:                                     //sair
                System.out.println(npc.nome + "venceu o combate!");
                break;

            case 1:                                     //bater
                npc.vida -= 10;
                System.out.println(player.nome + " deu 10 de dano");
                break;
            case 2:
                if (player.vida < 50) {
                    player.vida += 5;
                }
                break;


        }
    }

    public Combate(Jogador player, Inimigo npc){
        while (npc.vida < 0) {
            exibirMenu();
            int opcao = 1;
            this.scanner = new Scanner(System.in);
            opcao = scanner.nextInt();
            avaliarOpcao(opcao);

        }




       // while(npc.vida > 0){
          //  npc.vida -= 10;                  // toma o dano
           // System.out.println(player.nome + " deu 10 de dano");         // printa o dano
            //System.out.println(npc.vida);





    }


}














