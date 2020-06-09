package ExeNumDecrescente;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		numeroDecrescente op1 = new numeroDecrescente(num);
		op1.Decrescente();
		

	}

}
