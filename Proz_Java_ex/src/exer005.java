import java.util.Scanner;

public class exer005 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor do salário mínimo: ");
        double SM = scanner.nextDouble();

        System.out.print("Informe o valor do salário do usuário: ");
        double salario = scanner.nextDouble();

        double quantidadeSM = salario / SM;

        System.out.println("O usuário ganha " + quantidadeSM + " salários mínimos.");
        scanner.close();
    }
}