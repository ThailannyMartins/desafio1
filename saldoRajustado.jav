import java.util.Scanner;

public class saldoReajustado {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("informe o saldo atual");
        double saldo = scanner.nextDouble();
        double saldoReajustado= saldo * 1.01;

        System.out.println(" o saldo com reajuste de 1% é:" + saldoReajustado);

        scanner.close();
        
    }
}