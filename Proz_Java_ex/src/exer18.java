import java.util.Scanner;

public class exer18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int i = 0, n1 = 0, qtdPares = 0;

		do {
			System.out.print("Digite o " + (i + 1) + "º numero: ");
			n1 = scanner.nextInt();
			scanner.nextLine();
			i += 1;
			if (n1 % 2 == 0) {
				qtdPares += 1;
			}
		} while (i < 20);

		System.out.printf("Quantidade de números pares: %d", qtdPares);
		scanner.close();
	}
}
