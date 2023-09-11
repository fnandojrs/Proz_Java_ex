import java.util.Scanner;

public class exer23 {

	public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o numero de termos da sequencia de Fibonacci que deseja imprimir: ");
	        int numEscolhido = scanner.nextInt();

	        int n1 = 0;
	        int n2 = 1;

	        System.out.println("Sequência de Fibonacci com " + numEscolhido + " termos:");

	        for (int i = 1; i <= numEscolhido; i++) {
	            System.out.print(n1 + " ");

	            int proximoTermo = n1 + n2;
	            n1 = n2;
	            n2 = proximoTermo;
	        }
	    
	        scanner.close();
	}
	}