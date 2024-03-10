package aula2;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Exercicio7 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		//List<Integer>receberNumeros=new ArrayList<>();
		int soma=0;
		int numero = 0;
		System.out.println("Defina os numeros que deseja somar");
		do {
			System.out.println("Digite um numero:");
			numero = sc.nextInt();
			if(numero%2==0) {
				soma+=numero;
				
			} System.out.println("A soma dos numeros pares é: "+ soma);
			
		}while(numero>=0);
		System.out.println("Voce encerrou o programa!");
		
		
		
		
		
		
		
	}

}
