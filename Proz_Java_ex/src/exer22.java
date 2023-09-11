import java.util.Random;
import java.util.Scanner;

public class exer22 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int nAleatorio = random.nextInt(5) + 1;
        int tentativa;
        

        
        System.out.println("Tente adivinhar o número de 1 a 5.");

        while (true) {
            System.out.print("Sua tentativa: ");
            tentativa = scanner.nextInt();
            

            if (tentativa == nAleatorio) {
            	System.out.println("Parabéns! Você acertou o número " );
            	break;
            }else {
                System.out.println("Não foi dessa vez tente novamente .");
                
            }
        }
        scanner.close();
    }
}