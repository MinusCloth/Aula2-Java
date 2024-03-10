package aula2;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer>conjuntoDeIdade =new ArrayList<>();
		//int[] conjuntoIdade;
		int soma16=0,soma31=0,soma46=0,soma61=0,soma62=0;
		
		
		System.out.println("Digite a sequencia de idades:");
		for(int i = 0;i<5;i++) {
			int idade=sc.nextInt();
			if(idade<0) {
				System.out.println("Idade invalida");
			}
			else if(idade>=0) {
				
				conjuntoDeIdade.add(idade);
				
				if(idade<16)        {soma16+=1;}
				else if(idade<31)   {soma31+=1;}
				else if(idade<46)   {soma46+=1;}
				else if(idade<61)   {soma61+=1;}
				else                {soma62+=1;}
			    }
			
			
			
			
			
		}
		soma16 = (soma16/50)*100;
		soma31 = (soma31/50)*100;
		soma46 = (soma46/50)*100;
		soma61 = (soma61/50)*100;
		soma62 = (soma62/50)*100;
		
		
		System.out.println(conjuntoDeIdade);
		System.out.println(soma16+"% das pessoas tem entre 0 à 15 anos");
		System.out.println(soma31+"% das pessoas tem entre 16 à 30 anos");
		System.out.println(soma46+"% das pessoas tem entre 31 à 45 anos");
		System.out.println(soma61+"% das pessoas tem entre 46 à 60 anos");
		System.out.println(soma62+"% das pessoas tem mais de 60 anos");
	}

}
