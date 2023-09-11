import java.util.Scanner;

public class exer12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        int somaIdades = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            somaIdades += idade;
        }

        System.out.println("A soma das idades é: " + somaIdades);
        scanner.close();
    }
}