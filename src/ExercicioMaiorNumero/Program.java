/* Crie uma classe java MaiorNumero que contenha um m�todo que receba dois
n�meros inteiros e imprima o maior entre eles.
 */

package ExercicioMaiorNumero;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		entitiesMaiorNum maiorNum = new entitiesMaiorNum();
		System.out.print("Digite o 1� numero: ");
		maiorNum.setNum1(entrada.nextInt());
		System.out.print("Digite o 2� numero: ");
		maiorNum.setNum2(entrada.nextInt());
		maiorNum.maiorMenor();
		
	}

}
