import java.util.Scanner;

public class exer010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome;
		int n1 ;

		System.out.print("Digite um Nome : ");
		nome = sc.nextLine();
		System.out.print("Agora digite a quantidade de vezes que ira repetir: ");
		n1 = sc.nextInt();
		for (int i = 1; i <= n1; i++) {
			System.out.println(nome + "  --" + i);
		}

		sc.close();

	}}