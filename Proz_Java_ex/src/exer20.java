import java.util.Scanner;

public class exer20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int i = 0, n1 = 0, qtdNumde0a100 = 0,qtdNumde101a200 = 0,qtdNummaior200 = 0;

		do {
			System.out.print("Digite o " + (i + 1) + "º numero: ");
			n1 = scanner.nextInt();
			scanner.nextLine();
			i += 1;
			if ((n1 >= 0) && (n1 <= 100)) {
				qtdNumde0a100 += 1;
			}else if ((n1 > 100) && (n1 <= 200)) {
				qtdNumde101a200 += 1;
			}else if (n1 > 200) {
				qtdNummaior200 += 1;
			}
		} while (i < 20);

		
		System.out.println("Quantidade de números entre 0 e 100: " + qtdNumde0a100);
        System.out.println("Quantidade de números entre 101 e 200: " + qtdNumde101a200);
        System.out.println("Quantidade de números maiores que 200: " + qtdNummaior200);
		scanner.close();
	}
}
