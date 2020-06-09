/* Crie uma classe java MaiorNumero que contenha um método que receba dois
números inteiros e imprima o maior entre eles.
 */

package ExercicioMaiorNumero;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		entitiesMaiorNum maiorNum = new entitiesMaiorNum();
		System.out.print("Digite o 1º numero: ");
		maiorNum.setNum1(entrada.nextInt());
		System.out.print("Digite o 2º numero: ");
		maiorNum.setNum2(entrada.nextInt());
		maiorNum.maiorMenor();
		
	}

}
