package aula2;
import java.util.Scanner;
public class Exercicio8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite qual numero deseja ver a tabuada");
		int numero = sc.nextInt();
		int aux = 0;
		int i = 1;
		while(i<=10) {
			aux = numero *i;
			System.out.println(aux);
			i++;
		}
	}

}
