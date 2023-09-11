import java.util.Scanner;

public class exer19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int i = 0, n1 = 0, qtdNum = 0;

		do {
			System.out.print("Digite o " + (i + 1) + "º numero: ");
			n1 = scanner.nextInt();
			scanner.nextLine();
			i += 1;
			if ((n1 >= 0) && (n1 <= 100)) {
				qtdNum += 1;
			}
		} while (i < 20);

		System.out.printf("Quantidade de números entre 0 e 100: %d", qtdNum);
		scanner.close();
	}
}
