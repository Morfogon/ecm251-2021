package souza.rossini.matheus;

public class Combate {

    Combate(Jogador player, Inimigo npc){
        while(npc.vida > 0){
            npc.vida -= 10;                  // toma o dano
            System.out.println(player.nome + " deu 10 de dano");         // printa o dano
            System.out.println(npc.vida);
        }
    }
}
