/*Crie uma classe java NumeroDecrescente que contenha um m�todo que receba
um n�mero inteiro e imprima, em ordem decrescente, o valor do n�mero at�
0.
 */
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
