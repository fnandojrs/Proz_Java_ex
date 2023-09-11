import java.util.Scanner;

public class exer15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int i = 0, idade = 0, idadedamenor = 0;
		String nome , nomedamenor = "";

		

		do {
			System.out.print("Digite o nome da " + (i + 1) + "º pessoa: ");
			nome = scanner.nextLine();
			System.out.print("Digite a  idade da " + (i + 1) + "º pessoa: ");
			idade = scanner.nextInt();
			scanner.nextLine();
			i += 1;
			if ((idade <  idadedamenor) || (idadedamenor == 0)) {
				idadedamenor = idade;
				nomedamenor = nome;
			}
		}while (i < 3);	
		
		
		System.out.println("A Pessoa mais nova é : " + nomedamenor + " com a idade de " + idadedamenor + " anos");
		scanner.close();
	}}
