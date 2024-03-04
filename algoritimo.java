import java.util.Scanner;

public class algoritimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite a porcentagem do IPI a ser acrescido no valor das peças: ");
        double ipi = scanner.nextDouble();

        System.out.println("Digite o codigo da peça: ");

        System.out.println("Valor da peça: ");
        double valor1 = scanner.nextDouble();

        System.out.println("Quantidade de peças: ");
        int quantidade1 = scanner.nextInt();

        System.out.println("digte o codigo da peça 2: ");
        

        System.out.println("digite o valor da peça 2: ");
        double valor2 = scanner.nextDouble();

        System.out.println("Digite quantidade  de peças 2: ");
        int quantidade2 = scanner.nextInt();

        double valorTotal = (valor1 * quantidade1 + valor2 * quantidade2 * (ipi / 100 + 1));

        System.out.println("Valor total é: " + valorTotal);

        scanner.close();
    }
}