package fundamentos;

public class ConversaoTipoPrimitivos {
	public static void main(String[] args) {
		double a = 1;
		System.out.println(a);
		
		float b = (float) 1.123457899;
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.8889;
		int f = (int) e;
		System.out.println(f);
	}
}
