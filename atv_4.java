import java.util.Scanner;

public class atv_4 {
    public static String inverterCaracteres(String s) {
		int i,n;
		n = s.length();
		String auxiliar;
		
		auxiliar = "";
		for (i = (n-1); i>=0; i--) {
			auxiliar = auxiliar + s.charAt(i);
		}
		return auxiliar;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(inverterCaracteres("Ola mundo"));

	}
}
