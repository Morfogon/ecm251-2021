package souza.rossini.matheus;

public class Conta {
    //Atributos das classe
    private Usuario usuario;
    private double saldo;
    private int id;

    public Conta(String nome, double saldoInicial, int id) {
        this.saldo = saldoInicial;
        this.id = id;
        this.usuario = new Usuario(nome);

    }
