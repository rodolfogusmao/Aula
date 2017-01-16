import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		int num1, num2, oper, resultado, opcao =1;

		do{
			System.out.println(">>> Calculadora <<<");
			System.out.print("Informe o primeiro número: ");
			num1 = scann.nextInt();
			System.out.print("Informe o segundo numero: ");
			num2 = scann.nextInt();
			System.out.println("Escolha a operação 1 = soma, 2 = subtração, 3 = divisão ou 4 = multiplicação");
			oper = scann.nextInt();
			switch (oper){
			case 1:
				resultado = num1+num2;
				System.out.println("O resultado é " + resultado);
				break;
			case 2:
				resultado = num1-num2;
				System.out.println("O resultado é "+ resultado);
				break;
			case 3:
				resultado = num1/num2;
				System.out.println("O resultado é "+ resultado);
				break;
			case 4:
				resultado = num1*num2;
				System.out.println("O resultado é "+ resultado);
				break;
			default:
				System.out.println("Opção inválida!");
			}
			System.out.println("Deseja encerrar? 0 = Sim ou 1 = Não ");
			opcao = scann.nextInt();
		}while (opcao != 0);
		System.out.println("Programa Encerrado!");
	}
}
