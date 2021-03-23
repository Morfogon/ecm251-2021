package souza.rossini.matheus;

public class Main {

    public static void main(String[] args) {
        Inimigo enemy = new Inimigo("Dragão", 50);
        Jogador player = new Jogador("Matheus", 50);
        System.out.println("CERTO DIA DETERMINADO PLAYER ESTAVA ANDANDO PELA FLORESTA QUANDO DE REPENTE...");
        System.out.println(enemy.nome + "APARECE!");
        new Combate(player, enemy);
    }


}

