import java.util.Iterator;

public class atv_1 {
	
	public static int fib(int n) {
		int i,f = 0,f1 = 0, f2 = 1;
		if(n == 1)
			return 0;
		if(n == 2)
			return 1;
		for (i = 3; i <= n; i++) {
			f = f1 + f2;
			f1 = f2;
			f2 = f;
			if(n == f || n == f1 || n == f2) {
				System.out.println("Tem o número na sequencia");
				break;
			}else
				if(n < f) {
					System.out.println("Não tem na sequencia");
					break;
				}
		}		
		return f;
	}

	public static void main(String[] args) {
		int i;
		fib(2);
		
	}

}
