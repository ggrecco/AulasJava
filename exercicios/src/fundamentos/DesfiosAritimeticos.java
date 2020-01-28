// minha resposta para o desafio
package fundamentos;

public class DesfiosAritimeticos {

	public static void main(String[] args) {
		int valor1 = 6 * (3+2);
		double valor2 = Math.pow(valor1, 2);
		valor2 = valor2 / (3 * 2); //b = 150
		
		valor1 = ((1 - 5) * (2 - 7)) / 2;
		double valor3 = Math.pow(valor1, 2); // c = 100
		
		valor1 = (int) valor2 - (int) valor3;
		
		double resultado = Math.pow(valor1 / 10, 3);
		
		System.out.println(resultado);
	}
}
