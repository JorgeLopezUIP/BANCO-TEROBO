import Banco.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Depositar");
        System.out.println("2.Retirar");
        System.out.println("3.Movimiento");
        int e = sc.nextInt();

        switch (e){
            case 1:
                Deposito deposito = new Deposito();
                deposito.depositar();
                break;
            case 2:
                Retiro retiro = new Retiro();
                retiro.retirar();
                break;
            case 3:
                Movimiento movimiento = new Movimiento();
                movimiento.Move();
            default:
                System.out.println("Por favor, ingrese una opcion valida");
        }
    }
}