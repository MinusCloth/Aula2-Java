package aula2;
import java.util.Scanner;
import java.util.Random;
public class Exercicio9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int numeroAleat = rand.nextInt(101)+1;
		System.out.println();
		System.out.println("Tente adivinhar o numero:");
		int numero=0;
		System.out.println(numeroAleat);
		do {
			System.out.println("Digite um numero:");
			numero = sc.nextInt();
			if(numero==numeroAleat) {System.out.println("Parabens,voce acertou");}
			else if(numero<numeroAleat) {System.out.println("Tente novamente,um numero mais alto");}
			else if(numero>numeroAleat) {System.out.println("Tente novamente,um numero mais baixo");}
		}while(numero!=numeroAleat);
		
		
		
		
		
		
		
	}
}
