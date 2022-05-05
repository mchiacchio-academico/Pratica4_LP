package questao3;

import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);	
		
		String item, autor, local, data, descricao;
		Item[] itens = new Item[10]; //cria o vetor de objetos
		int cont=0;
		
		do {
		System.out.println("-----------------MENU--------------");
		System.out.println("(1) Cadastrar Item Perdido");
		System.out.println("(2) Buscar Item");
		System.out.println("(3) Sair");
		System.out.println("----------------------------------");
		int opcao=ler.nextInt();
		while(opcao!=3) {
		switch(opcao) {
		case 1: 
			System.out.println("Item: ");
			item=ler.nextLine();
			System.out.println("Autor: ");
			autor=ler.nextLine();
			System.out.println("Local: ");
			local=ler.nextLine();
			System.out.println("Data: ");
			data=ler.nextLine();
			System.out.println("Descrição: ");
			descricao=ler.nextLine();
		
			itens[cont]=new Item(item, autor, local, data, descricao);
			cont++;
			break;
		case 2:
			break;
		case 3:
			break;
		}
		
			
		}
		
		
	

		}
}