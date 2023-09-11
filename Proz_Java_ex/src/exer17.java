import java.util.Scanner;

public class exer17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int i = 0, n1 = 0, qtddenMaior = 0;

		do {
			System.out.print("Digite o " + (i + 1) + "º numero: ");
			n1 = scanner.nextInt();
			scanner.nextLine();
			i += 1;
			if (n1 > 8) {
				qtddenMaior += 1;
			}
		} while (i < 20);

		System.out.printf("A quantidade de numeros maiores 8 sao %d", qtddenMaior);
		scanner.close();
	}
}
