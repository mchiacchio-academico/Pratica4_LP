package questao3;

import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {

		Scanner ler=new Scanner(System.in);	
		
		System.out.println("-----------------MENU--------------");
		System.out.println("(1) Cadastrar Item Perdido");
		System.out.println("(2) Buscar Item");
		System.out.println("(3) Sair");
		System.out.println("----------------------------------");
		short opcao=ler.nextShort();
	}

}
