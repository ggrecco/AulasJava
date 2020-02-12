package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double resposta = 0;
		
		System.out.print("Digite o primeiro número: ");
		String valor = sc.nextLine();
		Double num1 = Double.parseDouble(valor);
		
		System.out.print("Digite o segundo número: ");
		valor = sc.nextLine();
		Double num2 = Double.parseDouble(valor);

		System.out.println("Qual operador? ( +, -, *, / ) ");
		String operador = sc.next();
		
		
//		if("+".equals(operador)) {
//			resposta = num1 + num2;
//		}else if("-".equals(operador)) {
//			resposta = num1 - num2;
//		}else if("*".equals(operador)) {
//			resposta = num1 * num2;
//		}else if("/".equals(operador) && num2 > 0) {
//			resposta = num1 / num2;
//		}else{
//			System.out.println("Impossivel realizar está operação");
//		}
		
		resposta= "+".equals(operador) ? num1 + num2 : 0 ;
		resposta= "-".equals(operador) ? num1 - num2 : resposta ;
		resposta= "*".equals(operador) ? num1 * num2 : resposta ;
		resposta= "/".equals(operador) && num2 != 0 ? num1 / num2 : resposta ;
		
		if( resposta != 0) {
			System.out.println("A resposta é: " + resposta);
		}else {
			System.out.println("Intdeterminado ou 0.");
		}
		
		
		sc.close();
	}
}
