package Banco;

public class Retiro  {

    private double retiro = 5000;
    private double saldo = 5300;

    public Retiro(){
    }


    public void retirar(){
        saldo = saldo - retiro;
        System.out.print("Su saldo es de: " + saldo);
    }
}
