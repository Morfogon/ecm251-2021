package souza.rossini.matheus;

public class Main {

    public static void main(String[] args) {
        Inimigo enemy = new Inimigo("Dragão", 50);
        Jogador player = new Jogador("Matheus", 50);
        Combate duelo = new Combate(player, enemy);
    }


}

