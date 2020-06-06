package exArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class app {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**********BEM VNDO AO CADASTRO DE CLIENTES**********");
		System.out.print("Quantos clientes vou cadastrar hoje ? voce que manda:");
		int n = sc.nextInt();
		List<Cliente> novoCliente = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Digite os dados do cliente %d ex nome e numero:",i);
			String nomecli = sc.next();
			int numerocli = sc.nextInt();
			
			novoCliente.add(new Cliente(nomecli,numerocli));
			
		}
		
		for (Cliente cliente : novoCliente) {
			System.out.println(cliente.toString());
		}

	}

}
