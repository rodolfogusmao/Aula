import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		int num1, num2, oper, resultado;
		System.out.println(">>> Calculadora <<<");
		System.out.println("Informe o primeiro n�mero: ");
		num1 = scann.nextInt();
		System.out.print("Informe o segundo numero: ");
		num2 = scann.nextInt();
		System.out.println("Escolha a opera��o 1 = soma, 2 = subtra��o, 3 = divis�o ou 4 = multiplica��o");
		oper = scann.nextInt();
	}

}
