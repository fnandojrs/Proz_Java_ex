import java.util.Scanner;

public class exer13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int somaIdades = 0;
		double media;

		for (int i = 1; i <= 20; i++) {
			System.out.print("Digite a idade da pessoa " + i + ": ");
			int idade = scanner.nextInt();
			somaIdades += idade;
		}
		media = (double) somaIdades / 20;
		System.out.println("A Media das idades é: " + media);
		scanner.close();
	}
}