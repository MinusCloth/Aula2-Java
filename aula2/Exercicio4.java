package aula2;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercicio4 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		List<Integer>sequeciaNum = new ArrayList<>();
		System.out.println("Digite um conjunto de 20 numeros: ");
		int soma=0;
		int aux=0;
		for(int i = 0;i<20;i++) {
			if(i%2==0) {
				aux=sc.nextInt();
				soma+=aux;}
		}System.out.println(soma);
		
		
		
		
		
		
		
	}
}
