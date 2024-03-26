package Banco;
import java.util.Scanner;

public class Movimiento {

    public void Move(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Inicial");
        System.out.println("2.Deposito");
        System.out.println("3.Retiro");
        int e = sc.nextInt();

        switch (e){
            case 1:
                System.out.print("5,000,00");
                break;
            case 2:
                System.out.print("300");
                break;
            case 3:
                System.out.print("5,000,00");
            default:
                System.out.println("Por favor, ingrese una opcion valida");
        }
    }
}
