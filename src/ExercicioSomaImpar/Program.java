/*Escreva um programa que imprima na tela a soma dos números ímpares entre
0 e 30 e a multiplicação dos números pares entre 0 e 30. */

package ExercicioSomaImpar;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		System.out.println("Soma dos numeros impares: ");
		for(int i = 0; i <= 30; i++) {
			if(i % 2 == 1) {
				System.out.printf("%d + %d = %d\n", i, i, i+i);
			}
		}
		System.out.println("\nMult entre numeros pares: ");
		for(int i = 0; i <= 30; i++) {
			if(i % 2 == 0) {
				System.out.printf("%d X %d = %d\n", i, i, i * i);
			}
		}
	}

}
