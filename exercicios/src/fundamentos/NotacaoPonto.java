package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String h = "Ol� Mundo?";
		System.out.println(h);
		
		h = h.replace("?", "!");
		System.out.println(h);
		
		h = h.toUpperCase();
		System.out.println(h);
		
		h = h.concat("!!");
		System.out.println(h);
		
	}
}
