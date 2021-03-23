package souza.rossini.matheus;

import java.util.Random;

public class Transacao {
    private boolean executarTransacao;
    private Usuario usuario;
    private Conta conta;
    private double valor;

    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        int idTransacao = r.nextInt((max - min) + 1) + min;
        return r.nextInt((max - min) + 1) + min;


    }

    private void gerarCode(Usuario usuario,Conta conta,double valor, int idTransacao){
        String s = usuario + conta + valor + idTransacao;
        String[] dados = s.split(";");

    }

}


