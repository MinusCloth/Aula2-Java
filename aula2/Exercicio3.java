package aula2;
import java.util.Scanner;
public class Exercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os valores de a e b: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int soma=0;
		
		if(a<b) {
		for(int i = a;i<=b;i++) {
			soma+=i;
			
			System.out.println(soma);
		}
	} 
		else {
			for(int i = b;i<=a;i++) {
				soma+=i;
				
				
			}System.out.println(soma);

		}
	}
}
	


