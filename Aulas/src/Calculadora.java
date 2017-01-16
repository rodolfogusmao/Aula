import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		int num1, num2, oper, resultado;
		System.out.println(">>> Calculadora <<<");
		System.out.println("Informe o primeiro número: ");
		num1 = scann.nextInt();
		System.out.print("Informe o segundo numero: ");
		num2 = scann.nextInt();
		System.out.println("Escolha a operação 1 = soma, 2 = subtração, 3 = divisão ou 4 = multiplicação");
		oper = scann.nextInt();
	}

}
