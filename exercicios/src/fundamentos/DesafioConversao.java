package fundamentos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o 1º salário: ");
		String valor = sc.next().replace(",", ".");
		Double valor1 = Double.parseDouble(valor);
		
		System.out.print("Informe o 2º salário: ");
		valor = sc.next().replace(",", ".");
		Double valor2 = Double.parseDouble(valor);

		System.out.print("Informe o 3º salário: ");
		valor = sc.next().replace(",", ".");
		Double valor3 = Double.parseDouble(valor);
		
		Double media = (valor1 + valor2 + valor3) / 3;
		
		DecimalFormat formatar = new DecimalFormat("#0,0");
		media = Double.valueOf(formatar.format(media));
		
		System.out.println("A média é: "+ media);
		
	}
}
