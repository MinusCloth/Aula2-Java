package aula2;
import java.util.Scanner;
public class Exercico10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String senha = "Penna09";
		int i =-1;
		String senhaDigitada="";
		System.out.println("Digite sua senha:");
		while (i<0){
			senhaDigitada = sc.nextLine();
			if(senhaDigitada.equals(senha)) {
				System.out.println("Boas vindas");i=1;
			}System.out.println("Snha incorreta,tente denovo");
			
			
		}
		
		
		
		
		
	}
}
