package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
//		se 1 trabalho der certo tv 32 os 2 trabalhos tv 50, comprou tv tomaram sorvete
//		se nenhum trabalho nenhum sorvete

		boolean trabalho1 = true;
		boolean trabalho2 = true;

		if (trabalho1 && trabalho2) {
			System.out.println("Comprou tv de 50 e tomaram sorvete");
		} else if (trabalho1 || trabalho2) {
			System.out.println("Comprou tv de 32 e tomaram sorvete");
		} else {
			System.out.println("Não comprou nada");
		}
	}
}
