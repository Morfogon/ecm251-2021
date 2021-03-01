package souza.rossini.matheus;

import java.util.Random;

public class Basico03 {
    //Estruturas de repetição
    public static void main(String[] args) {
        int limite = 10;
        int contador;

        for(contador = 0; contador < limite; contador++){
            System.out.println("Contador atual: " + contador);
        }

        //Cria um metodo que sorteia coisas aleatorias
        Random sorteador = new Random();
        int numero = sorteador.nextInt(1000);
        System.out.println("Numero sorteado: " + numero);
        int senha = 123456;
        int tentativas = 0, chute;
        chute = sorteador.nextInt(999999);
        while (chute != senha){
            tentativas++;
            System.out.println("Ainda não quebramos: " + chute);
            System.out.println("Tentativas: " + tentativas);
            chute = sorteador.nextInt(999999);
        }
        System.out.println("Parabens! quase um cracker! ");
        System.out.println("Levou apenas: " + tentativas);
    }


}