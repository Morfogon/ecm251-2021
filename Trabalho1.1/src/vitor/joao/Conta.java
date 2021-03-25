package vitor.joao;

public class Conta {
    //Atributos das classe
    private Usuario usuario;

    private double saldo;
    public int idConta;

    //construtor
    public Conta(String nome, double saldoInicial, int idConta) {
        this.saldo = saldoInicial;
        this.idConta = idConta;
        this.usuario = new Usuario(nome);

    }

    //Métodos da classe

    public void depositar(double valor) {
        //this.saldo = this.saldo + valor;
        this.saldo += valor;
    }

    public boolean Retirar(double valor) {
        if(valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferirDinheiro(Conta destino, double valor) {
        if(this.Retirar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }



    public boolean Receber(double valor) {
        if(valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    //public boolean FazerPagamento(Conta Pagador, Conta Recebedor , String QRCode) {

     //   if(this.Retirar(valor)){                                               // se o valor a ser pago for menor do que o saldo da conta entao True
     //       destino.depositar(valor);
     //       return true;
     //   }
    //    return false;
    //}

    public double getSaldo() {
        return this.saldo;
    }




}
