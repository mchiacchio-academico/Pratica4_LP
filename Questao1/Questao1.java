package Questao1;

import java.util.Scanner;

public class Questao1 {
	
	public static void main(String[] args) {
		
		Scanner ler=new Scanner(System.in);
		
		int soma = 0, aux;

		int[] notas = new int[10];
		
		for(int i=0; i<10; i++) {
			System.out.println("Digite a nota posi��o n�: "+(i+1));
			notas[i]=ler.nextInt();
			soma=soma+notas[i];
		}
		for(int i=0; i<10; i++) {
		for(int j=0; j<9; j++) {
		if(notas[j]>notas[j+1]) {
		aux=notas[j];
		notas[j]=notas[j+1];
		notas[j+1]=aux;
		}
		}
		}
		
		
	System.out.println("A m�dia �: "+soma/10);
	System.out.println("A maior nota �: "+notas[9]);
	System.out.println("A 2� maior nota �: "+notas[8]);
	System.out.println("A 3� maior nota �: "+notas[7]);
	System.out.println("A menor nota �: "+notas[0]);
		
	}
}
