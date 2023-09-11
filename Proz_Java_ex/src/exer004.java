import java.util.Scanner;

public class exer004 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe a porcentagem do IPI: ");
		double ipi = scanner.nextDouble();

		
		System.out.print("Informe o código da peça 1: ");
		scanner.nextInt();
		System.out.print("Informe o valor unitário da peça 1: ");
		double valor1 = scanner.nextDouble();
		System.out.print("Informe a quantidade de peças 1: ");
		int quant1 = scanner.nextInt();

		
		System.out.print("Informe o código da peça 2: ");
		scanner.nextInt();
		System.out.print("Informe o valor unitário da peça 2: ");
		double valor2 = scanner.nextDouble();
		System.out.print("Informe a quantidade de peças 2: ");
		int quant2 = scanner.nextInt();

		double totalPeca1 = valor1 * quant1;
		double totalPeca2 = valor2 * quant2;
		double totalSemIPI = totalPeca1 + totalPeca2;
		double totalComIPI = totalSemIPI * (ipi / 100 + 1);

		System.out.println("O valor total a ser pago com IPI é: " + totalComIPI);
		scanner.close();
	}
}