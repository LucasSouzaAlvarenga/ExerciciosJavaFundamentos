package ExercicioContaBancaria;

import java.util.Random;
import java.util.Scanner;

/*Exercicio simulando a criação de conta, utilizando metodos, wrapper class e getters e setters */
public class Aplication {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random random = new Random();
		entitiesConta p1 = new entitiesConta();
		
		System.out.print("CC ou CP? ");
		String tipoConta  = entrada.nextLine().toUpperCase();
		//String tipoConta = "CC"; 
		p1.abrirConta(tipoConta);
		
		p1.setNumeroConta(random.nextInt(1000));
		System.out.print("Digite o nome do titular: ");
		String nomeTitular = entrada.nextLine();
		p1.setNomeTitular(nomeTitular);
		p1.estadoAtual();
		
		System.out.print("Digite o valor de deposito: ");
		double deposito = entrada.nextDouble();
		p1.depositar(deposito);
		System.out.println("Saldo: " + p1.getSaldo());
		System.out.println("Digite o valor do saque: ");
		double sacar = entrada.nextDouble();
		p1.sacar(sacar);
		System.out.println("Saldo: " + p1.getSaldo());
		p1.pagarMensal();
		System.out.println("Saldo após pagamento de mensalidade: " + p1.getSaldo());
		p1.estadoAtual();
		
		entrada.close();

	}
}