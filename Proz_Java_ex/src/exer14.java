import java.util.Scanner;

public class exer14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int  idade, qtddemaior = 0;
		for (int i = 0; i <= 9; i++) {
			System.out.print("Digite o nome da " + (i + 1) + "º pessoa: ");
			scanner.nextLine();
			System.out.print("Digite a  idade da " + (i + 1) + "º pessoa: ");
			idade = scanner.nextInt();
			scanner.nextLine();
			if (idade >= 18) {
				qtddemaior += 1;
			}
			
		}
		
		System.out.println("A Qauntidade de pessoas maiores de idade é: " + qtddemaior);
		scanner.close();
	}
}