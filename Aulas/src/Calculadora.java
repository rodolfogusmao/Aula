import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		int num1, num2, oper, resultado, opcao =1;

		do{
			System.out.println(">>> Calculadora <<<");
			System.out.print("Informe o primeiro n�mero: ");
			num1 = scann.nextInt();
			System.out.print("Informe o segundo numero: ");
			num2 = scann.nextInt();
			System.out.println("Escolha a opera��o 1 = soma, 2 = subtra��o, 3 = divis�o ou 4 = multiplica��o");
			oper = scann.nextInt();
			switch (oper){
			case 1:
				resultado = num1+num2;
				System.out.println("O resultado � " + resultado);
				break;
			case 2:
				resultado = num1-num2;
				System.out.println("O resultado � "+ resultado);
				break;
			case 3:
				resultado = num1/num2;
				System.out.println("O resultado � "+ resultado);
				break;
			case 4:
				resultado = num1*num2;
				System.out.println("O resultado � "+ resultado);
				break;
			default:
				System.out.println("Op��o inv�lida!");
			}
			System.out.println("Deseja encerrar? 0 = Sim ou 1 = N�o ");
			opcao = scann.nextInt();
		}while (opcao != 0);
		System.out.println("Programa Encerrado!");
	}
}
