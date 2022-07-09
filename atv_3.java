import java.util.Scanner;

public class atv_3 {
    public static void main(String[] args) {
		double soma = 0;
		Scanner sc = new Scanner(System.in);
		double[]vetor = new double[2];
		double[]vetor2 = new double[2];
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o faturamento total de cada estado");
			vetor[i]= sc.nextDouble();
			soma = soma + vetor[i];
		}
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] =  soma -vetor[i] ;
			vetor2[i] = vetor[i] / 100;
			System.out.println("porcetagem do estado " +(i+1)+ " " +vetor2[i]+"%");
		}
	}
}
