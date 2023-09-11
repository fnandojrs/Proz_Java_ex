import java.util.Scanner;

public class exer009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome;

		System.out.print("Digite um Nome : ");
		nome = sc.nextLine();

		for (int i = 1; i <= 20; i++) {
			System.out.println(nome + "  --" + i);
		}

		sc.close();

	}
}