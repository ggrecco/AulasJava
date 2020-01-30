package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
//		operador ternario aninhado
		double media = 7.6;
		String resultadoRecuperacao = media >= 7.0 ? "aprovado" : media >= 5.0 ? "recuperação" : "reprovado";
		System.out.println(resultadoRecuperacao);
	}
}
