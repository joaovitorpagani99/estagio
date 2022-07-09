import java.util.Scanner;

public class atv_2 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double maior = 0, menor = 0, soma = 0;
		int numeroDeDias = 0;
		int i = 0; 
		
		
		System.out.println("Digite a quantidade de dias em que o mês vai ter:");
		 i = sc.nextInt();
		 double [] vetor = new double[i];
		 
		
		for (int j = 0; j < vetor.length; j++) {
			System.out.println("Dígite o faturamento do dia: " +(j+1));
			vetor[j] = sc.nextDouble();
			menor = vetor[j];
				if (vetor[j] > maior) 
					maior = vetor[j];
				if (vetor[j] < menor) 
					menor = vetor[j];
				soma = soma + vetor[j];
		}
		for (int j = 0; j < vetor.length; j++) {
			if(vetor[j] > soma)
				numeroDeDias = numeroDeDias +1 ;
		}
		System.out.println("Numero de dias em que o faturamento diário foi maior que a média: "+numeroDeDias);
		System.out.println("Maior valor" +maior);
		System.out.println("Menor valor"+menor);
	}
}
