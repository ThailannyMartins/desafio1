import java.util.Scanner;

public class salarioMinimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Imforme o valor do salario minimo");
        double salarioMinimo = scanner.nextDouble();

        System.out.println("Informe o valor do salario de usuario");
        double salarioUsuario = scanner.nextDouble();

        double quantidadeDoSalarioMinimo = salarioMinimo / salarioUsuario;

        System.out.println("o usuario ganha aproximadamente" + quantidadeDoSalarioMinimo);

        scanner.close();
    } 
    
}
