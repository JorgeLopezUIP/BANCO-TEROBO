package Banco;

public class Deposito  {

    private double saldo = 5000;
    private double deposito = 300;
    public Deposito(){
    }

    public void depositar(){
        saldo = saldo + deposito;
        System.out.print("Su saldo es de: " + saldo);
    }
}
