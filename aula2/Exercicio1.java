package aula2;
import java.util.Scanner;
public class Exercicio1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int soma=0;
	for(int i=100; i<=500;i++) {
		if(i%2==0) {
			soma+=i;
		}System.out.println(soma);
	}
}
}
