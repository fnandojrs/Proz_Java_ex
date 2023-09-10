import java.util.Scanner;

public class exer002 {

	public static void main(String[] args) {

		int[] numeros1 = { 8, 9, 7 };
		int[] numeros2 = { 4, 5, 6 };

		double media1 = (numeros1[0] + numeros1[1] + numeros1[2]) /3;
		double media2 = (numeros2[0] + numeros2[1] + numeros2[2]) /3;
		double somaDasMedias = media1 + media2;
		double mediaDasMedias = (media1 + media2) / 2;

		System.out.println("A média dos números 8, 9 e 7 é: " + media1);
		System.out.println("A média dos números 4, 5 e 6 é: " + media2);
		System.out.println("A soma das duas médias é: " + somaDasMedias);
		System.out.println("A média das médias é: " + mediaDasMedias);
	}

	
}
